package pg;
//그리디
public class KakaoInternship {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();

        // 왼손의 엄지가 10이라는 것은 키패드를 2차원 배열로 표현했을 때,
        // 위치가 키패드 상에서 (4, 1)에 해당하는 위치임을 의미 -> 2차원 배열로 보았을때는 '*'위치는 10을 의미

        //초기 왼손의 엄지는  *
        int leftThumb = 10;

        // 초기 오른손의 엄지는 #
        int rightThumb = 12;
        // 주어진 숫자 배열을 반복,  각 숫자는 num 변수에 순차적으로 할당됩니다.
        for (int num : numbers) {
            if (num == 1 || num == 4 || num == 7) { // 왼쪽 열의 3개의 숫자 1, 4, 7을 입력할 때는 왼손 엄지손가락을 사용
                answer.append("L"); // 왼쪽열 숫자여서 L
                leftThumb = num; // 현재 숫자를 업데이트
            } else if (num == 3 || num == 6 || num == 9) {//오른쪽 열의 3개의 숫자 3, 6, 9를 입력할 때는 오른손 엄지손가락을 사용
                answer.append("R"); // 오른쪽열 숫자여서 R
                rightThumb = num;// 현재 숫자를 업데이트
            }
            //가운데 열의 4개의 숫자 2, 5, 8, 0을 입력할 때는 두 엄지손가락의 현재 키패드의 위치에서 더 가까운 엄지손가락을 사용합니다.
            else {
                //왼손 엄지와 현재 숫자 사이의 거리를 계산
                int leftDistance = getDistance(leftThumb, num);
                //오른 엄지와 현재 숫자 사이의 거리를 계산
                int rightDistance = getDistance(rightThumb, num);

                //왼손과 오른손 사이의 거리를 비교하고, 만약 거리가 같은 경우에는 주어진 손잡이 정보에 따라 손 선택
                if (leftDistance < rightDistance || (leftDistance == rightDistance && hand.equals("left"))) {
                    //왼손을 사용하게되면 L
                    answer.append("L");
                    // 현재 숫자를 업데이트
                    leftThumb = num;
                } else if (rightDistance < leftDistance || (leftDistance == rightDistance && hand.equals("right"))) {
                    answer.append("R");
                    rightThumb = num;
                }
            }
        }

        return answer.toString();
    }

    // 두 번호 간의 거리 계산 상하좌우로만 이동할 수있다는 조건을 맞추어 거리 계산
    private int getDistance(int thumb, int target) {
        if (thumb == 0) thumb = 11;
        if (target == 0) target = 11;

        int thumbX = (thumb - 1) / 3;
        int thumbY = (thumb - 1) % 3;
        int targetX = (target - 1) / 3;
        int targetY = (target - 1) % 3;

        // 두 숫자의 x좌표 차이와 y좌표 차이의 절대값을 더하여 두 번호 간의 거리를 계산합니다.
        return Math.abs(thumbX - targetX) + Math.abs(thumbY - targetY);
    }

    public static void main(String[] args) {
        KakaoInternship kakao = new KakaoInternship();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String hand = "right";
        String result = kakao.solution(numbers, hand);
        System.out.println("Result: " + result);
    }
}
