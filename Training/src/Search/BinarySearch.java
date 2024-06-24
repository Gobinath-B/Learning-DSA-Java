package Search;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int low=0;
        int high= arr.length-1;
        int mid =0;
        int target = 6;
        boolean found = false;
        while(low<=high){
            mid = low+(high-low)/2;
            if(mid == target){
                System.out.println("Target Found: "+mid);
                found = true;
                break;
            } else if (mid<target) {
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        if(!found) {
            System.out.println("Target Not Found !!");
        }
    }
}
