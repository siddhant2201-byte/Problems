public class binarys {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 8;
        for(int i = 0; i < arr.length; i++){
            arr[i]=i;
        }
        int index = binarySearch(arr, target);
        if(index == -1) {
            System.out.println("Target not found");
        }
        else {
            System.out.println("Target found at index: " + index);
        }
    }

    private static int binarySearch(int[] arr, int target) {
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
}