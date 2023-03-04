package 十大排序算法;

public class SelectSort {
  /*  首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置。

    再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。

    重复第二步，直到所有元素均排序完毕*/
  public static void main(String[] args) {
      int[] arr1={1,3,5,0,6,5,2,1};
      int[] arr=selectsort(arr1);
      for (int i:
              arr) {
          System.out.print(i);

      }
  }
  public static  int[] selectsort(int[] arr){
      for (int i = 0; i < arr.length; i++) {
          int min=i;
          for (int j = i+1; j <arr.length ; j++) {
              if(arr[j]<arr[i]){
                  min=j;
                  int tmp=arr[i];
                  arr[i]=arr[j];
                  arr[j]=tmp;
              }
          }
      }
      return arr;
  }
//时间复杂度为O(n^2) 空间复杂度为O(1)
}
