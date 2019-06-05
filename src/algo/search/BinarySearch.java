package algo.search;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BinarySearch {

    public static int binarySearch(int a[],int low,int high,int key){

        if(high>=low){

            int mid = (low + high)/2;

            if(a[mid] == key){
                return mid;
            }
            else if(a[mid] > key){
                return binarySearch(a,low,mid-1,key);
            }
            else{
                return binarySearch(a,mid+1,high,key);
            }
        }

        return -1;

    }

    public static int duplicateInSortedArray(int a[], int low, int high, int key){

        if(high>=low){

            int mid = (low + high)/2;

            if(a[mid] == key){
                return a[mid];
            }
            else if(a[mid] > key){
                return duplicateInSortedArray(a,low,mid-1,key);
            }
            else{
                return duplicateInSortedArray(a,mid+1,high,key);
            }
        }

        return -1;

    }

    public static int duplicateInSortedArray(int a[], int low, int high){

        if(high>=low){

            int mid = (low + high)/2;

            if(a[mid] != a[mid+1]){

                if(mid >0 && a[mid] == a[mid-1])
                    return mid;

                return duplicateInSortedArray(a,low,mid-1);
            }

            return duplicateInSortedArray(a,mid+1,high);
        }

        return -1;

    }

    public static void removeDuplicate(int[] a){

        int temp[] = new int[a.length];
        int j = 0;
        for(int i=0;i<a.length-1;i++){
            if(a[i] != a[i+1]){
                temp[j++] = a[i];
            }
        }
        temp[j] = a[a.length-1];
        System.out.println(Arrays.toString(temp));
    }

    public static void sumOfPairUnsorted(int a[],int n,int sum){

        Set<Integer> integerSet =  new HashSet<>();
        for(int i=0;i<n;i++){
            int rem = sum - a[i];
            if(integerSet.contains(rem)){
                System.out.println("pair: ("+a[i]+","+rem+")");
            }
            else
                integerSet.add(a[i]);
        }
    }



    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8};
        int key = 4;
        //System.out.println(BinarySearch.binarySearch(a,0,a.length-1,key));

        int[] b = { 1 , 1 , 2 , 3 , 4};//{ 1, 2 , 3 , 4 , 4};//{1,1,1,1,1,1};//{1,2,3,3,5,6,7,7};
        for(int i=0;i<b.length-1;i++){
            key = b[i];
            System.out.println(BinarySearch.duplicateInSortedArray(b,i+1,b.length-1,key));
        }
        BinarySearch.duplicateInSortedArray(b,0,b.length-1);

        int[] c = {1,2,3,3,5,6,7,7};//{1,1,1,1,1,1};
        BinarySearch.removeDuplicate(c);

        int[] d = { 1, 5, 7, -1, 5 };
        BinarySearch.sumOfPairUnsorted(d,d.length,6);

    }
}
