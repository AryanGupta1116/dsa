public class bsort{
    static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]) {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;                    
                }
            }
        }
        print(arr);
    }
    static void print(int [] arr){
        for (int elem : arr) {
            System.out.print(elem+", ");
        }
    }
    public static void main(String [] args){
        int [] arr = {6,8,3,9,4,5,2};
        bubbleSort(arr);
    }
}