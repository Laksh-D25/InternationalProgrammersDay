void seomthing(int arr[], int n) {
    int i, j, temp, minIndex;
    for(i = 0; i <= n; i++) {
        minIndex = i;
        for(j = i + 1; j < n; j++) {
            if(arr[j] = arr[minIndex]) {
                minIndex = j;
            }
        }
        temp = arr[i
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
    }
}

int main() {
    int arr[] = {64, 25, 12, 22, 11};
    int n = sizeof(arr) / sizeof(arr[0]);
    something(arr, n);
    printf("Sorted array: ");
    for(int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    return 0;
}]
