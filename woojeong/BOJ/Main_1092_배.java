import java.util.*;

public class Main_1092_배 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        Integer[] crane = new Integer[N];
        for(int i = 0; i < N; i++) {
            crane[i] = sc.nextInt();
        }
        
        // 내림차순 정렬 (큰 것부터 처리하기 위해)
        Arrays.sort(crane, Collections.reverseOrder());
        
        int M = sc.nextInt();
        List<Integer> box = new ArrayList<>(); // 삭제가 빈번해도 인덱스 접근이 잦으므로 ArrayList 권장
        for(int i = 0; i < M; i++) {
            box.add(sc.nextInt());
        }
        
        // 박스도 내림차순 정렬
        Collections.sort(box, Collections.reverseOrder());
        
        // 가장 큰 박스가 가장 힘센 크레인보다 무거우면 절대 못 옮김
        if (box.get(0) > crane[0]) {
            System.out.println(-1);
            return;
        }
        
        int hours = 0;
        
        while (!box.isEmpty()) {
            int boxIdx = 0;
            for (int i = 0; i < N; ) { // 크레인 하나씩 확인
                if (boxIdx == box.size()) break; // 더 이상 확인할 박스가 없으면 종료
                
                if (crane[i] >= box.get(boxIdx)) {
                    // 현재 크레인이 박스를 들 수 있으면
                    box.remove(boxIdx);
                    i++; // 다음 크레인으로 이동
                } else {
                    // 못 들면 그 다음 무거운 박스 확인 (크레인은 고정)
                    boxIdx++;
                }
            }
            hours++;
        }
        
        System.out.println(hours);
    }
}
