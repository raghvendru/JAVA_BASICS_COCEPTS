package JAVA_CODE.SORTING;

public class Selection {
    public static int[]  selectionSort(int[] nums){
        int n = nums.length;

        for(int i=0;i<=n-2;i++ ){
            int mini = i;
            for(int j=i;j<=n-1;j++){
                if(nums[j]<nums[mini]){
                    mini = j;
                }

            }
            int temp = nums[mini];
            nums[mini] =nums[i];
            nums[i]=temp;
        }
        return nums;

    }
    public static void main(String[] args) {
        int[ ] arr = {1,2,6,7,4,9,8};
        selectionSort(arr);
        for(int a:arr){
            System.out.println(a);
        }
    }
}
