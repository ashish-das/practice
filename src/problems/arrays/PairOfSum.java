package problems.arrays;

import java.util.Arrays;
import java.util.HashSet;

public class PairOfSum {

    public static void usingSet(int[] a,int n,int sum){
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0;i<n;i++){
            int temp = sum-a[i];
            if(temp>=0 && set.contains(temp)){
                System.out.println(a[i]+" "+temp);
            }
            set.add(a[i]);
        }
    }

    public static void usingSort(int[] a,int n,int sum){
        Arrays.sort(a);
        int low=0;
        int high = n-1;
        while(low<high){
            int tempSum = a[low] + a[high];
            if(tempSum == sum){
                System.out.println(a[low]+" "+a[high]);
            }
            if(tempSum > sum){
                high--;
            }
            else{
                low++;
                //9949292183
            }
        }
    }

    public static void subArraySum(int[] a,int n,int sum){
        int curr_sum = a[0];
        int start =0;
        for(int i=1;i<a.length;i++){

            //Check if the curr_sum exceeds the required sum if
                //If it exceeds then remove the trailing element
            while(curr_sum > sum && start < i-1){
                curr_sum = curr_sum - a[start];
                start++;
            }

            if(curr_sum == sum){
                System.out.println("Sum found between indexes " + start
                        + " and " + (i-1));
            }
            else
                curr_sum = curr_sum + a[i];
        }
    }

    public static void main(String[] args) {
        int[] a = {2,3,4,-2,6,8,9,11};
        int sum = 6;
        PairOfSum.usingSet(a,a.length,sum);
        PairOfSum.usingSort(a,a.length,sum);

        int[] b = {15, 2, 4, 8, 9, 5, 10, 23};
        PairOfSum.subArraySum(b, b.length, 23);

    }
}
