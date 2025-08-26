public class linears {
    public static void main(String[] args) {
        int [] arr = {12,32,44,25,46,72};

        int index = linearsearch(arr , 25);
        System.out.println(index);
    }
    private static int linearsearch(int []arr,int value ) {
    for (int i = 0;i<arr.length;i++){
        if (arr[i] == value){
            return i;
        }
    }
    return -1;
    }
}
