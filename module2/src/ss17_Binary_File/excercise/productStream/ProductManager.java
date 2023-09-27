package ss17_Binary_File.excercise.productStream;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    private static String FILE_PATH = "src/ss17_Binary_File/excercise/productStream/product.bin";
    public static Scanner scanner = new Scanner(System.in);
    private static List<Product> arrProduct= new ArrayList<>();

    static {
        arrProduct=  toProducts();
    }
    public static void main(String[] args) {
        Product newItem = createProduct();
        addProduct(newItem);
        showProduct();
    }

    public static List<Product> toProducts(){
        List<Product> res = new ArrayList<>();

        try {
            File file = new File(FILE_PATH);
            if (!file.exists()) {
                file.createNewFile();
            }

            if (file.length() > 0) {
                ObjectInputStream input = new ObjectInputStream(new FileInputStream(FILE_PATH));
                return (List<Product>) input.readObject();
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        return res;

////            FileInputStream foIn = new FileInputStream(FILE_PATH);
////            ObjectInputStream objIn = new ObjectInputStream(foIn);
////            arrProduct = (ArrayList<Product>) objIn.readObject();
//            return (ArrayList<Product>) arrProduct;
//        } catch (FileNotFoundException e){
//            System.out.println("Không tim thấy file Pre-update!");
//        } catch (ClassNotFoundException e){
//            System.out.println("Lỗi Class not found!");
//        }  catch (IOException e){
//            System.out.println("Lỗi IO Pre-update!");
//        }
//        return null;
    }
    public static void addProduct(Product product){
     if (product == null){
         System.out.println("Thêm thất bại! Sản phẩm không có mã sản phẩm!");
     }
//        arrProduct = toProducts();

        arrProduct.add(product);
     try {
        FileOutputStream fos = new FileOutputStream(FILE_PATH);
        ObjectOutputStream obs = new ObjectOutputStream(fos);
        obs.writeObject(arrProduct);
     }catch (FileNotFoundException e){
         System.out.println("Không tim thấy file!");
     }catch (IOException e){
         System.out.println("Lỗi IO!");
     }

    }

    public static void showProduct() {
//        arrProduct.forEach(System.out::println);
        ArrayList<Product> arrProduct = new ArrayList<>();
        if (arrProduct.size() == 0) {
            System.out.println("Không có sản phẩm nào!");
        } else {
            System.out.println("Dưới đây là danh sách sản phẩm:");
            for (int i = 0; i < arrProduct.size(); i++){
                System.out.println(arrProduct.get(i));
            }
        }
    }

    public static void findByIdCode(String string){
        for (Product p:arrProduct) {
           if (p.equals(string)){
               System.out.println(p);
           }
        }
    }

    public static Product createProduct(){
        Product newItem= new Product();
        String note="";
        String charIn = "Empty";
        try {
            System.out.print("Nhập mã sản phẩm (bắt buộc):");
            newItem.setIdCode(scanner.nextLine());
            System.out.print("Nhập tên sản phẩm:");
            newItem.setName(scanner.nextLine());
            System.out.print("Nhập hảng sản xuất sản phẩm:");
            newItem.setManufacturer(scanner.nextLine());
            System.out.print("Nhập giá sản phẩm:");
            newItem.setPrice(Double.parseDouble(scanner.nextLine()));
            do {
                System.out.print("Bạn muốn nhập các mô tả khác không? Nhập Y (có) và N (không muốn):");
                charIn = scanner.nextLine();
            } while (!(charIn.equalsIgnoreCase("Y") || charIn.equalsIgnoreCase("N")));
            if (charIn.equals("Y")){
                System.out.println("Nhập các mô tả khác:");
                note = scanner.nextLine();
                newItem.setOtherNote(note);
            }
        } catch (Exception e){
            System.out.println("Có lỗi!");
        }
        if (newItem.emptyProduct()){
            return null;
        } else {
            return newItem;
        }

    }
}
