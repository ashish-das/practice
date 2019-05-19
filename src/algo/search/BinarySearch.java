package algo.search;

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

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8};
        int key = 4;
        System.out.println(BinarySearch.binarySearch(a,0,a.length-1,key));
    }
}
