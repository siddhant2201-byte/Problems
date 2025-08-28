public class bsort{
    public static void main(String[] args) {
        int[] arr = new int[5] ;
        arr[0] = 14;
        arr[1] = 12;
        arr[2] = 33;
        arr[3] = 23;
        arr[4] = 10;

        sort(arr);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int lar = arr[arr.length-1];
        System.out.println("Largest element: " + lar);
    }
    public static void sort(int[] arr){
        for(int i =0;i<arr.length-1;i++){
            for(int j =0;j<arr.length-1;j++){
                if (arr[j]> arr[j+1]){
                    int temp =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}


