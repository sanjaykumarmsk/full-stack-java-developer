package oops;

class Solution {
    public int printArray(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return 0;
    }
}

public class Second {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5 };
        Solution obj = new Solution();
        obj.printArray(arr);
        for (int num : arr) {
            System.out.print(num+" ");
        }
        System.out.println();

    }
}