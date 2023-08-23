package ss14_sorting_algorithms.practice;

public class P14_1_sap_xep_noi_bot_bubble_sort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
    public static void main(String[] args) {
            bubbleSort(list);
            for (int i = 0; i < list.length; i++){
                System.out.print(list[i] + " ");
            }

    }
    public static void bubbleSort(int[] list){
        boolean needNextPass = true;
        for (int i=0; i< list.length & needNextPass; i++){
            needNextPass = false;
            for (int j = 0;j<list.length - i-1;j++){
                if (list[j] < list[j+1]){
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    needNextPass = true;
                }
            }
        }
    }
}
