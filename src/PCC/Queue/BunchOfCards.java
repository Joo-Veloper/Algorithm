package PCC.Queue;

import java.util.ArrayDeque;
import java.util.Arrays;

/* 코니는 영어 단어가 적힌 카드 뭉치 2개를 선물 받았습니다.
* - 원하는 카드 뭉치에 카드를 순서대로 한 장씩 사용합니다.
* - 한 번 사용한 카드는 다시 사용할 수 없습니다.
* - 카드를 사용하지 않고 다음 카드로 넘어갈 수 없습니다.
* - 기존에 주어진 카드 뭉치의 단어 순서는 바꿀 수 없습니다.*/
/*예를 들어 첫 번쨰 카드 뭉치에 i, drink, water.
* 두 번째 카드 뭉치에 want, to가 적혀있을 때
* i, want, to , drink, water 순서의 단어 배열을 만들려고 합니다. 첫 번째 카드 뭉치에서 i 를 사용후 두 번째 카드 뭉치에서 want와 to를 사용
* 첫 번 째 카드 뭉치에 drink와 water를 차례로 사용하면 원하는 순서의 단어 배열을 만들 수 있습니다.
* 문자열로 이루어진 배열 Cards1, cards2와 원하는 단어 배열 goal이 매개변수로 주어질때 cards1과 cards2에 적힌 단어들로 goal를 만들 수 있다면
*  Yes를 만들 수 없다면 No를 반환하는 solution함수를 완성 */

public class BunchOfCards {
    public static void main(String[] args) {
        BunchOfCards bunchOfCards = new BunchOfCards();
        String[] cards1 = {"i", "drink", "water"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};
        System.out.println(bunchOfCards.solution(cards1, cards2, goal));
    }

    public String solution(String[] cards1, String[] cards2, String[] goal) {
        ArrayDeque<String> cardsDeque1 = new ArrayDeque<>(Arrays.asList(cards1));
        ArrayDeque<String> cardsDeque2 = new ArrayDeque<>(Arrays.asList(cards2));
        ArrayDeque<String> goalDeque = new ArrayDeque<>(Arrays.asList(goal));

        while (!goalDeque.isEmpty()) {
            if (!cardsDeque1.isEmpty() && cardsDeque1.peekFirst().equals(goalDeque.peekFirst())) {
                cardsDeque1.pollFirst();
                goalDeque.pollFirst();
            } else if (!cardsDeque2.isEmpty() && cardsDeque2.peekFirst().equals(goalDeque.peekFirst())) {
                cardsDeque2.pollFirst();
                goalDeque.pollFirst();
            } else {
                break;
            }
        }

        return goalDeque.isEmpty() ? "Yes" : "No";
    }
}