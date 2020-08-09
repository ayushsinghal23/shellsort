package shellSort;
/*
 Shell Sort
 Created by AYUSH SINGHAL
 Date:10/08/2020
 Time:1:35 A.M
 */
/*fastest of all O(n^2) algorithms
 good for medu=ium sized lists
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int arrSize = Integer.parseInt(read.readLine());
        int[] arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            arr[i] = Integer.parseInt(read.readLine());
        }
        System.out.println("Array before sorting: " + Arrays.toString(arr));
        ShellSort obj = new ShellSort();
        obj.sort(arr);
        System.out.println("Array after sorting: " + Arrays.toString(arr));

    }
}
