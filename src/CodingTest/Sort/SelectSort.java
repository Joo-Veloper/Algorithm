package CodingTest.Sort;

import java.util.Scanner;


public class SelectSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner 객체를 생성, 키보드 입력을 받기 위함
        String str = sc.next(); // 사용자로부터 한 단어 입력을 받아 문자열 str에 저장
        int[] A = new int[str.length()]; // 문자열 길이만큼의 정수 배열 A를 생성

        // 문자열의 각 문자를 하나씩 순회하며 정수 배열 A에 저장
        for (int i = 0; i < str.length(); i++) {
            A[i] = Integer.parseInt(str.substring(i, i + 1)); // 문자를 정수로 변환하여 배열에 할당
        }

        // 선택 정렬을 이용한 내림차순 정렬 과정
        for (int i = 0; i < str.length(); i++) { // 배열의 모든 요소를 순회
            int Max = i; // 현재 최대값의 인덱스를 저장할 변수 Max, 초기값은 i
            for (int j = i + 1; j < str.length(); j++) { // i 이후의 요소들을 순회
                if (A[j] > A[Max]) { // 현재 요소가 저장된 최대값보다 크면
                    Max = j; // 최대값의 인덱스를 업데이트
                }
            }
            if (A[i] < A[Max]) { // 만약 최대값이 현재 요소(i)보다 크다면
                int temp = A[i]; // 요소 교환을 위한 임시 변수
                A[i] = A[Max]; // 최대값을 현재 위치로 이동
                A[Max] = temp; // 원래 위치에 현재 요소 저장
            }
        }

        // 정렬된 배열 출력
        for (int i = 0; i < str.length(); i++) { // 배열의 모든 요소를 순회하며
            System.out.print(A[i]); // 각 요소를 출력
        }
    }
}