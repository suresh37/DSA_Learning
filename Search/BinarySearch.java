package DSA_Learning.Search;

public class BinarySearch {
    public static int search(int[] nums, int target) {
        int l = 0, h = nums.length - 1;
        while (l <= h) {
            int m = l + ((h - l) / 2);
            if (nums[m] == target)
                return m;
            else if (target > nums[m])
                l = m + 1;
            else if (target < nums[m])
                h = m - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 10, 20, 30, 40, 50 };
        int result = search(nums, 20);
        System.out.println("element found at index: " + result);
    }
}