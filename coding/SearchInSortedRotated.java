
public class SearchInSortedRotated {

    public static int searchInSortedRotatedArray(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (nums[start] <= nums[mid]) {
                if (target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {11, 12, 1, 2, 3, 4, 5, 6, 7}; 
        int target = 1;

        System.out.println(searchInSortedRotatedArray(arr, target));
    }
}

