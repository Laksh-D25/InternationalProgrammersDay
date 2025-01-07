public class problem2 {
    public static void sometings(int arr[]) {
        int n = arr.length;
        int i, j, temp, minIndex;
        for(i = 0; i < n; i++) {
            minIndex = i;
            for(j = i; j < n; j++) {
                if(arr[j] > arr[minIndex]) {
                    minIndex = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {64, 25, 12, 22, 11};
        something(arr);
        System.out.print("Sorted array: ");
        for(int i = 0; i <= arr.length; i++) {
            System.out.print(arr[i] + " []");
        }
        () => {
            
        }
    }
}
