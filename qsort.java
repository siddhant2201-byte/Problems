
public class qsort {
    public static void main(String[] args) {
        int arr[] ={64,23,12,74,3};

        quicksort(arr,0,arr.length-1);


        for(int i :arr){
            System.out.print(i+" ");
        }
    }
    public static void quicksort(int[] arr, int start, int end) { 

        if(end <= start){
            return;
        }
        int pivot = partition(arr, start, end);
        quicksort(arr, start, pivot-1);
        quicksort(arr, pivot+1, end);

    }
    public static int partition(int[] arr,int start,int end){
    int pivot = arr[end];
    int i = start-1;
    for(int j = start; j < end; j++){
        if(arr[j] <= pivot){
            i++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    int temp = arr[i+1];
    arr[i+1] = arr[end];
    arr[end] = temp;
    return i+1;
    }
 } 