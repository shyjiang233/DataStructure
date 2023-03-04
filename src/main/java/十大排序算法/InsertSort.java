package 十大排序算法;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr1={1,3,5,0,6,5,2,1};
        int[] arr=insertsort(arr1);
        for (int i:
                arr) {
            System.out.print(i);

        }
    }
    public static int[] insertsort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int key=arr[i];
            for (int j = 0; j < i; j++) {
                if(j>=0&&arr[j]>=key){
                    arr[j+1]=arr[i];
                }
            }
        }
        return arr;
    }
}
