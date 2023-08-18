package ss12_map.exercise.ex12_1_product_arraylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class ProductManager {
    private static ArrayList<Product> arrayListProduct = new ArrayList<>();
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
                    productManager.addProduct();
                    break;
                case 2:
                    System.out.print("Enter id want change: ");
                    int editID = Integer.parseInt(scanner.nextLine());
                    productManager.editProduct(editID);
                    break;
                case 3:
                    System.out.print("Enter id want delete: ");
                    int deleteID = Integer.parseInt(scanner.nextLine());
                    productManager.deleteProduct(deleteID);
                    break;
                case 4:
                    productManager.showListProduct();
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

    public void addProduct() {
        int newid=0;
        String newName;
        double newPrice;
        if (arrayListProduct.size()==0) {
            newid++;
        } else {
            newid = arrayListProduct.get(arrayListProduct.size()-1).getIdProduct() + 1;
        }

        System.out.print("Enter new product name: ");
        newName = scanner.nextLine();
        System.out.print("Enter new product price: ");
        newPrice = Double.parseDouble(scanner.nextLine());
        Product product = new Product(newid, newName, newPrice);
        arrayListProduct.add(product);
        System.out.println("Added, done!");
    }

    public void editProduct(int id) {
        if (id > arrayListProduct.size()) {
            System.out.println("Not found product with id!");
        } else {
            int editIndex = id-1;
            String editName;
            double editPrice;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Change product name:" + arrayListProduct.get(editIndex).getNameProduct() + " ==> ");
            editName = scanner.nextLine();
            arrayListProduct.get(editIndex).setNameProduct(editName);
            System.out.print("Change product price:"+ arrayListProduct.get(editIndex).getPriceProduct() + " ==> ");
            editPrice = Double.parseDouble(scanner.nextLine());
            arrayListProduct.get(editIndex).setPriceProduct(editPrice);
        }
    }

    public void deleteProduct(int id) {
        int delID = -1;
        for (int i = 0; i < arrayListProduct.size(); i++) {
            if (arrayListProduct.get(i).getIdProduct() == id){
                delID = i;
                break;
            }
        }
        if (delID == -1){
            System.out.println("Not found Delete Product by ID!");
        } else {
            arrayListProduct.remove(id);
        }
    }

    public void showListProduct() {
        System.out.println("List Product is:");
        if (arrayListProduct.size() == 0) {
            System.out.println("Empty");
        } else {
            System.out.println("NO. | ID | Name     | Price");
            for (int i = 0; i < arrayListProduct.size(); i++) {
                System.out.println( (i+1) + " | " +  arrayListProduct.get(i).getIdProduct() +
                        " | " + arrayListProduct.get(i).getNameProduct() +
                        " | " + arrayListProduct.get(i).getPriceProduct());
            }
        }
    }
    private static void findListByName(){
        List<Product> res = new ArrayList<>();
        String findName;

        System.out.print("Enter name of Product: ");
        findName= scanner.nextLine();
        for (int i=0; i<arrayListProduct.size(); i++){
            if (arrayListProduct.get(i).getNameProduct().contains(findName)){
                res.add(arrayListProduct.get(i));
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
        arrayListProduct.sort(new Comparator<Product>() {
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
