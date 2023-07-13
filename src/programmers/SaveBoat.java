package programmers;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class SaveBoat {
    // 총 필요한 보트의 개수
    static int answer = 0;

    public int solution(int[] people, int limit) {
        // 오름차순으로 정렬한다.
        Arrays.sort(people);

        // 사람들을 Deque에 몸무게가 가장 큰 사람이 맨 뒤로 가게 차례대로 넣는다.
        // 아이디어는 다음과 같다.
        // Deque에 사람이 2명 이상 있을 때는
        //      ㄴ 맨 뒤(무게가 제일 많은) 사람과 맨 앞(무게가 제일 적은) 사람의 무게 합이 limit과 같거나 작을 때는 둘 다 빼고 answer를 ++한다.
        //      ㄴ 맨 뒤 사람과 맨 앞 사람의 무게 합이 limit을 넘는다면 맨 뒤 사람만 빼고 answer를 ++한다.
        // Deque에 사람이 1명만 있을 때는
        //      ㄴ 그냥 젤 처음 사람 빼고 answer를 ++한다.
        // ++된 answer의 값을 리턴한다.
        
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < people.length; i++) {
            deque.addLast(people[i]);
        }

        while (!deque.isEmpty()) {
            if (deque.size() <= 1) {
                deque.removeFirst();
                answer++;
            } else {
                if (deque.peekLast() + deque.peekFirst() <= limit) {
                    deque.removeLast();
                    deque.removeFirst();
                    answer++;
                } else {
                    deque.removeLast();
                    answer++;
                }
            }
            System.out.println(deque.toString());
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        SaveBoat s = new SaveBoat();
        s.solution(new int[]{70, 50, 80, 50}, 100);

    }
}
