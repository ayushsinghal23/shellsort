package shellSort;

public class ShellSort {
    public void sort(int[] arr) {
        int arrSize = arr.length;
        for (int gap = arrSize / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arrSize; i++) {
                int j;
                int temp = arr[i];
                for (j = i; j > 0; j -= gap) {
                    if (j >= gap && arr[j - gap] > temp) {
                        arr[j] = arr[j - gap];
                    } else {
                        break;
                    }
                }
                arr[j] = temp;
            }
        }
    }
}
