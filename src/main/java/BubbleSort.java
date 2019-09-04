public class BubbleSort {
    public static void main(String args[]) {
        int arr[] = {10000, 200, 140, 100, 30, 7};
        for(int j= arr.length ; j > 0 ; j-- ){
            for (int i = 0; i < arr.length; i++) {
                if (i !=arr.length-1 && arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
