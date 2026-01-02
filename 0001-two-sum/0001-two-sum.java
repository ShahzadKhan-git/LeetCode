import java.util.Scanner;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};  
                }
            }
        }
        return new int[]{-1, -1};  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the array elements (space separated): ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();

        
        Solution solution = new Solution();
        int[] result = solution.twoSum(arr, target);

       
        System.out.println("Indices of the two numbers: [" + result[0] + ", " + result[1] + "]");
        System.out.println("Values: " + arr[result[0]] + " + " + arr[result[1]] + " = " + target);

        sc.close();
    }
}