package sort;

public class Quicksort {
    public static void main (String[] args){
        int [] arr = {5,2,4,6,8,1,9,3,7,0};
        for (int i=0;i<arr.length;i++) {
            for (int j=0;j<arr.length;j--){
                int temp = arr[0];
            }
            if (arr[0] > arr[i]) {
                int temp;
                temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println(arr);
    }
}
