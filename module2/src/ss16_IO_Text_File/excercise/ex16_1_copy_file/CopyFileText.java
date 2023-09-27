package ss16_IO_Text_File.excercise.ex16_1_copy_file;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class CopyFileText {
    private static final String TARGETPATH = "ss16_IO_Text_File/excercise/ex16_1_copy_file/TargetFile.csv";
    private static final String SOURCEPATH = "ss16_IO_Text_File/excercise/ex16_1_copy_file/SourceFile.csv";

    public static void main(String[] args) {
        String lineTarget;
        String lineSource;
        try{
            FileReader sourceFile = new FileReader(SOURCEPATH);
            FileWriter targetFile = null;
            BufferedReader sourceBuff = new BufferedReader(sourceFile);
            lineTarget = sourceBuff.readLine();
            String choose;
            do {
                System.out.println("Bạn xác nhận ghi đè (Y) hay không (N)? Hoặc chọn thoát chương trình (E)?");
                Scanner scanner = new Scanner(System.in);
                choose = scanner.nextLine();
            } while (!choose.contains("YNE"));
            switch (choose){
                case "E":
                    System.exit(0);
                case "N":
                    targetFile = new FileWriter(TARGETPATH, false);
//                    copyFileText(s)
                case "Y":

                default:
                    System.exit(0);
            }
        } catch (FileNotFoundException e ) {
            System.err.println(e.getMessage());
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }

    public static void copyFileText(BufferedReader sourceBuff, FileWriter targetFile){
        String tempTarget[];
        String tempSource[];
        BufferedWriter targetBuff =new BufferedWriter(targetFile);
    }

    public static int characterCount(String filePath){
        int numberOfChar=0;
        String line;
        String temp[];
        try {
            FileReader file = new FileReader(filePath);
            BufferedReader buff = new BufferedReader(file);
            line = buff.readLine();
            while (line != null){
                temp = line.split(",");
                for (int i=0; i<temp.length; i++){
                    numberOfChar+=temp[i].length();

                }
            }
        } catch (FileNotFoundException e){
            System.out.println("Đường dẫn file không đúng!");
        } catch (IOException e){
            System.out.println("Lỗi Input Output");
        }
        return numberOfChar;
    }

}
