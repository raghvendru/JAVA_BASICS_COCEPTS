package JAVA_CODE.SORTING;

public class Insertion {
    public static int[] selection(int[] nums){
        int n = nums.length;
        for(int i=0;i<n;i++){
            int j = i;
            while(j>0 && nums[j-1]>nums[j]){
                int temp = nums[j];
                nums[j] =nums[j-1];
                nums[j-1]=temp;
                j--;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        selection(arr);
        for(int a:arr){
            System.out.println(a);
        }
    }
}
