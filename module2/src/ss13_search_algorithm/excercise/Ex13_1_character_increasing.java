package ss13_search_algorithm.excercise;

import java.util.*;

class Ex13_1_character_increasing {
    //Tìm kiếm nhị phân sử dụng đệ quy
    public static void main(String[] args) {
        String wordBeforeSort;
        String wordAfterSort;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter word:");
        wordBeforeSort = scanner.nextLine();
        sortIncreaseWord(wordBeforeSort);
    }
    public static void sortIncreaseWord(String string){
        ArrayList<Character>  arrayList =  new ArrayList<>();
        char minChar = 0;
        if (string.length() == 0){
            System.out.println("out of word!");
        } else {
            for (Character ch: string.toCharArray()) {
                arrayList.add(ch);
            }
            minChar =  arrayList.get(0);
            for (int i = 0; i < arrayList.size()-2; i++) {
                if (minChar < arrayList.get(i+1)){
                    System.out.print(minChar);
                    minChar =  arrayList.get(i+1);
                } else if(i==arrayList.size()-3){
                    System.out.print(minChar);
                }
            }
        }


    }
}
