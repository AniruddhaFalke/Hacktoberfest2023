import java.util.Scanner;

public class Solution {
    public static int search(int []nums, int target) {
        // Write your code here.
        int start=0;
        int end=nums.length-1;
        while (start<=end) {
            
            int mid=(start+end)/2;
            
            if(nums[mid]==target){

                return mid;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
    }
 return -1;
    }

    public static void main(String[] args){

        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int[] arr=new int[size];
        
        for (int i = 0; i < arr.length; i++) {

            arr[i]=s.nextInt();
            
        }

        int index=search(arr,5 );

        System.out.println(index);



    }
}
