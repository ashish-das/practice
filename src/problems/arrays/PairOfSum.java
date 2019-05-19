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
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {2,3,4,-2,6,8,9,11};
        int sum = 6;
        PairOfSum.usingSet(a,a.length,sum);
        PairOfSum.usingSort(a,a.length,sum);
    }
}
