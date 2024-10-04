package BaekJ.recursion;

import java.util.Scanner;

public class MergeSortKthSave {
    static int saveCount = 0; // 저장된 횟수
    static int kthSaveValue = -1; // k 번째 저장된 값
    static int K; // 찾고 싶은 k번째 수

    public static void mergeSort(int[] array, int[] tempArray, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2; //중앙값
            mergeSort(array, tempArray, left, middle); // 왼쪽 반 정렬
            mergeSort(array, tempArray, middle + 1, right); // 오른쪽 반 정렬
            merge(array, tempArray, left, middle, right);
        }
    }

    public static void merge(int[] array, int[] tempArray, int left, int middle, int right) {
        int leftStart = left;
        int rightStart = middle + 1;
        int tempIndex = left;

        while (leftStart <= middle && rightStart <= right) {
            if (array[leftStart] <= array[rightStart]) {
                tempArray[tempIndex++] = array[leftStart++];
            } else {
                tempArray[tempIndex++] = array[rightStart++];
            }
        }

        // 왼쪽 배열이 남아있으면 tempArray
        while (leftStart <= middle) {
            tempArray[tempIndex++] = array[leftStart++];
        }

        // 오른쪽 배열이 남아있으면 tempArray
        while (rightStart <= right) {
            tempArray[tempIndex++] = array[rightStart++];
        }

        for (int i = left; i <= right; i++) {
            array[i] = tempArray[i];
            saveCount++;
            if (saveCount == K) {
                kthSaveValue = array[i];
            }
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // 사용자 입력을 받는 스캐너
        int arraySize = scanner.nextInt();  // 배열 크기 입력받음
        K = scanner.nextInt();  // K번째 저장 횟수 입력받음
        int[] numbersArray = new int[arraySize];  // 정렬할 배열 생성
        int[] tempArray = new int[arraySize];  // 임시 배열 생성

        // 배열에 숫자 입력받음
        for (int i = 0; i < arraySize; i++) {
            numbersArray[i] = scanner.nextInt();
        }

        // 병합 정렬 시작
        mergeSort(numbersArray, tempArray, 0, arraySize - 1);

        // K번째로 저장된 숫자를 출력
        System.out.println(kthSaveValue);
    }
}
