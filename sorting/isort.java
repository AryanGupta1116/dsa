public class isort{
    static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int j=i-1;
            int temp = arr[i];
            while(j>=0 && temp<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1] = temp;
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
        insertionSort(arr);
    }
}