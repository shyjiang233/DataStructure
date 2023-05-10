package numbersize;

/*Author:shyjiang233
 *  Desc:二分查找
 */public class search2 {
    public int search(int[] nums, int target) {
        if (target < nums[0] || target > nums[nums.length - 1]) {
            return -1;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);//直接将left和right相加并除以2，求得mid。这种方式的缺点在于如果left和right的值非常大，可能会导致整数溢出。
            if (nums[mid] == target) {
                return mid;
            }else if(nums[mid]>target){
                  right=mid-1;
            }else if(nums[mid]>target){
                left=mid+1;
            }
        }
        return -1;

    }
}
