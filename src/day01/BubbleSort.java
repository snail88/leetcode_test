package day01;

public class BubbleSort {
    public static void main (String[] args){
        int [] arr = {1,0,4,2,7,3,8,5,9,6};
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("排序后的数组为==>");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }

    }
}
