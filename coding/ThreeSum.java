import java.util.*;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == target && (i != k && j != k)) {
                        res.add(List.of(nums[i], nums[j], nums[k]));
                    }
                }
            }
        }
        
        return res;
    }

    public static void main(String[] args) {

        int[] nums = {-2, 0, 2, -2, 1, -1};
        System.out.println(threeSum(nums, 0));
        
    }
}

