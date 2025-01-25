package JAVA_CODE.SORTING;

public class bubble {
    public static int[] bubble(int[] nums){
        int n = nums.length;
        for(int i=n-1;i>=0;i--){
            int didSwap =0;
            for(int j=0;j<=i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    didSwap =1;
                }

            }
            if(didSwap==0){
                break;
            }
        }
        return  nums;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,6,7,5,3};
        bubble(arr);
        for(int a:arr){
            System.out.println(a);
        }
    }
}
