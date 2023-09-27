package tongOnTap.ReadWriteFile.characterFile_txt_csv;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Test {
    private static String FILE_PATH = "src/tongOnTap/ReadWriteFile/characterFile_txt_csv/data.csv";

    public static void main(String[] args){
        //Tạo, xóa,
        try {
            File file = new File(FILE_PATH);
            if (!file.exists()){
                file.createNewFile();
                //file.delete() xóa
                //file.length() kiểm tra kích thước file

            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
        //Reader
        try {
            FileReader fileReader = new FileReader(FILE_PATH);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String[] tmp;
            String line;
            while (!((line = bufferedReader.readLine()) == null)){
                System.out.println(line);
                tmp = line.split(",");
                for (int i = 0; i< tmp.length; i++) {
                    System.out.print(tmp[i] + "-");
                }
                System.out.println("");
            };
            fileReader.close();
            //cach 2
            List<String> strings = Files.readAllLines(Path.of(FILE_PATH));
            for (int i =0; i<strings.size(); i++){
                System.out.println(strings.get(i).equals(null));
            }
            fileReader.close();
        } catch (IOException e){
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }

        //ghi file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))){
            writer.write("Van, Quang, Trinh");
        } catch (IOException e){
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
