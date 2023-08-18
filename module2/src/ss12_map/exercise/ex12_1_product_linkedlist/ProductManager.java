package ss12_map.exercise.ex12_1_product_linkedlist;
import java.util.*;
import java.util.stream.Collectors;

class ProductManager {
    private static LinkedList<Product> linkedListProduct = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int choose = 0;
       ProductManager productManager = new ProductManager();
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("=====================");
            System.out.println("MENU");
            System.out.println("1. Add Product");
            System.out.println("2. Edit Product");
            System.out.println("3. Delete Product");
            System.out.println("4. Show list Product");
            System.out.println("5. Find Product with Product name");
            System.out.println("6. Sort and Show list Product");
            System.out.println("7. Exit");
            System.out.println("=====================");
            System.out.print("Choose your menu method: ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    System.out.print("Enter id want change: ");
                    int editID = Integer.parseInt(scanner.nextLine());
                    editProduct(editID);
                    break;
                case 3:
                    System.out.print("Enter id want delete: ");
                    int deleteID = Integer.parseInt(scanner.nextLine());
                    deleteProduct(deleteID);
                    break;
                case 4:
                    showListProduct();
                    break;
                case 5:
                    findListByName();
                    break;
                case 6:
                    sort();
                    break;
                case 7:
                    System.exit(0);
            }
        } while (choose >= 1 && choose <= 7);


    }

    public static void addProduct() {
        int newid=0;
        String newName;
        double newPrice;
        if (linkedListProduct.size()==0) {
            newid++;
        } else {
            newid = linkedListProduct.get(linkedListProduct.size()-1).getIdProduct() + 1;
        }
        System.out.print("Enter new product name: ");
        newName = scanner.nextLine();
        System.out.print("Enter new product price: ");
        newPrice = Double.parseDouble(scanner.nextLine());
        Product product = new Product(newid, newName, newPrice);
        linkedListProduct.addLast(product);
        System.out.println("Added, done!");
    }

    public static void editProduct(int id) {
        int editIndex = -1;
        Product findProduct = linkedListProduct.stream().filter(e -> e.getIdProduct() == id).findFirst().get();
        editIndex = linkedListProduct.indexOf(findProduct);
        if (editIndex == -1) {
            System.out.println("Not found product with id!");
        } else {
            String editName;
            double editPrice;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Change product name:" + findProduct.getNameProduct() + " ==> ");
            editName = scanner.nextLine();
            findProduct.setNameProduct(editName);
            System.out.print("Change product price:"+ findProduct.getPriceProduct() + " ==> ");
            editPrice = Double.parseDouble(scanner.nextLine());
            findProduct.setPriceProduct(editPrice);
        }
    }

    public static void deleteProduct(int id) {
//        Product p = linkedListProduct.stream().filter(e -> e.getIdProduct() == id).findFirst().get();
//        int index = linkedListProduct.indexOf(p);
//        linkedListProduct.remove(index);
        if(linkedListProduct.removeIf(e -> e.getIdProduct() == id))
        {
            System.out.println("sucess");
        }
        else {
            System.out.println("id not exist");
        }

    }
    public static void showListProduct() {
        System.out.println("List Product is:");
        if (linkedListProduct.isEmpty()) {
            System.out.println("Empty");
        } else {
            System.out.println("NO. | ID | Name     | Price");
            for (int i = 0; i < linkedListProduct.size(); i++) {
                System.out.println( (i+1) + " | " +  linkedListProduct.get(i).getIdProduct() +
                        " | " + linkedListProduct.get(i).getNameProduct() +
                        " | " + linkedListProduct.get(i).getPriceProduct());
            }
        }
    }
    private static void findListByName() {
        ArrayList<Product> res = new ArrayList<>();
        String findName;
        System.out.print("Enter name of Product: ");
        findName = scanner.nextLine();
        for (Product p : linkedListProduct) {
            if (p.getNameProduct().contains(findName)) {
                res.add(p);
            }
        }
        res.forEach(System.out::println);
    }

    private static void sort(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Sort up ascending");
        System.out.println("2. Sort Descending");
        System.out.println("Enter type Sort:");
        final int typeSort = Integer.parseInt(scanner.nextLine());
        //sort do not change original the list
//        List<Product> products = linkedListProduct.stream().sorted(Comparator.comparing(Product::getPriceProduct)).collect(Collectors.toList());

        linkedListProduct.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                double tmp = o1.getPriceProduct() - o2.getPriceProduct();
                if(typeSort == 1){
                    return tmp > 0 ? 1 :-1;
                }
                else {
                    return tmp > 0 ? -1 :1;
                }
            }
        });

    }

}
