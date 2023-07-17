package Class_0717.P771;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example7 {
    public static void main(String[] args) {
        List<Member2> list = Arrays.asList(new Member2("홍길동", "개발자"), new Member2("김나리", "디자이너"),
                new Member2("신용권", "개발자"));

        List<Member2> developers = list.stream()
                .filter(member -> member.getJob().equals("개발자")) // 개발자만 필터링
                .collect(Collectors.toList()); // 필터링된 개발자들을 리스트로 변환

        developers.forEach(m -> System.out.println(m.getName()));
    }

}
