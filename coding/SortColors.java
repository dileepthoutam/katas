import java.util.Arrays;

public class SortColors {

    public static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void sortColors(int[] nums) {
        int start = 0;
        int mid = 0;
        int end = nums.length - 1;

        while (mid <= end) {
            if (nums[mid] == 0) {
                swap(nums, start, mid);
                start++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, end);
                end--;
            }
        }
    }

    public static void main(String[] args) {

        int[] nums = {0, 0, 2, 2, 2, 1, 1, 1};
        sortColors(nums);

        System.out.println(Arrays.toString(nums));
        
    }
    
}

