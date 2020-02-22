public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {200, 35, -15, 7, 55, 1, -22, 34, 67, -2, 14, 100, -3, -9};
        for (int i = 1; i < arr.length; i++) {
            int j = i-1;
            int temp = arr[i];
            while(j>= 0 && arr[j]>temp){
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
                i--;
            }
        }

        for(int k : arr){
            System.out.print(k+" ");
        }

    }
}
