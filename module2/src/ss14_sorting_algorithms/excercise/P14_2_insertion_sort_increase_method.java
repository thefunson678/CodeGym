package ss14_sorting_algorithms.excercise;

import java.util.ArrayList;

class P14_2_insertion_sort_increase_method {

    public static void main(String[] args) {
        int[] list = {5,4,8,6,9,7,3,1,2};
        ArrayList arrayList = new ArrayList<>();
        for (int i= 0;i<list.length;i++){
            arrayList.add(list[i]);
        }
        System.out.print("Your input Array: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        insertionSortArray(list);
        System.out.println();
        System.out.print("Your sorted Array: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        //ArrayList
        System.out.println();
        System.out.print("Your input ArrayList: ");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + "\t");
        }
        insertionSortArrayList(arrayList);
        System.out.println();
        System.out.print("Your Sorted ArrayList: ");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + "\t");
        }
    }
    public static void insertionSortArray(int[] list){
        int selectedValue = list[0];
        int currentPosition;
        for (int i = 1; i<list.length;i++){
            selectedValue = list[i];
            currentPosition = i;
            while (currentPosition > 0 && selectedValue < list[currentPosition-1]){
                list[currentPosition] = list[currentPosition-1];
                currentPosition--;
            }
            list[currentPosition]=selectedValue;
        }
    }

    public static void insertionSortArrayList(ArrayList arrayList){
        int selectedValue = (int) arrayList.get(0);
        int currentPosition;
        for (int i = 1; i< arrayList.size();i++){
            selectedValue = (int) arrayList.get(i);
            currentPosition = i;
            while (currentPosition > 0 && selectedValue < (int) arrayList.get(currentPosition-1)){
                arrayList.set(currentPosition, arrayList.get(currentPosition-1));
                currentPosition--;
            }
            arrayList.set(currentPosition,selectedValue);
        }
    }
}
