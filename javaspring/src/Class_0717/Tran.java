package Class_0717;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Tran {

        public static void main(String[] args) {

                Trader raoul = new Trader("Raoul", "Cambridge");
                Trader mario = new Trader("Mario", "Milan");
                Trader alan = new Trader("Alan", "Cambridge");
                Trader brian = new Trader("Brian", "Cambridge");

                List<Transaction> transactions = Arrays.asList(
                                new Transaction(brian, 2011, 300),
                                new Transaction(raoul, 2012, 1000),
                                new Transaction(raoul, 2011, 400),
                                new Transaction(mario, 2012, 710),
                                new Transaction(mario, 2012, 700),
                                new Transaction(alan, 2012, 050));

                // System.out.println("모든데이터" + transactions);

                // 1. 2011년에 일어나 모든 트랜잭션 검색 후 값을 오름차순 검색

                List<Transaction> trans01 = transactions.stream()
                                .filter(item -> item.getYear() == 2011)
                                // getValue는 Transaction에서 쓰였기 때문에 transactions가 아니라 이걸로 바꿔야함
                                .sorted(Comparator.comparingInt(Transaction::getValue))
                                // collect로 정렬된 값을 다시 받고
                                .collect(Collectors.toList());
                // 결론적으로 trans01로 배열을 받았으므로, 출력
                // trans01에는 2011년도 조건에 해당하는 항목들이 저장되어 보여짐
                System.out.println(trans01);

                // 1. stream() 메서드 호출해서 transactions 리스트를 스트림으로 변환
                // 2. item.getYear() == 2011 를 이용해서 2011년에 일어나 트랜잭션만 필터링
                // 3. Transaction 객체의 value 값을 기준으로 오름차순 정렬합니다.
                // collect(Collectors.toList); 정렬된 트랜잭션을 리스트로 수집하여 trans01

                // 2. 거래자가 근무하는 모든 도시를 중복 없이 나열하시오.

                List<String> trans02 = transactions.stream()
                                // .map(Transaction::getTrader);
                                // .map(Transaction::getCity);
                                .map(item -> item.getTrader().getCity())
                                .distinct().collect(Collectors.toList());
                System.out.println(trans02);

                // 3. 케임브리지에서 근무하는 모든 거래자를 찾아서 이름순으로 정렬하시오.

                List<Trader> trader03 = transactions.stream()
                                .map(Transaction::getTrader) // 트랜잭션의 거래자 정보를 추출
                                .filter(item -> "Cambridge".equals(item.getCity()))
                                .sorted(Comparator.comparing(Trader::getName)) // 이름순으로 정렬
                                .distinct()
                                .collect(Collectors.toList());

                System.out.println(trader03);

                // 4. 모든 거래자의 이름 알파벳순 정렬
                List<String> trader04 = transactions.stream()
                                .map(a -> a.getTrader().getName()) // 트랜잭션의 거래자 정보를 추출
                                .distinct()
                                .sorted() // 이름순으로 정렬
                                .collect(java.util.stream.Collectors.toList());
                System.out.println("4. 모든 거래자의 이름 알파벳순 정렬 : " + trader04);

                // 5. 밀라노에 거래자가 있는가?
                Boolean trader05 = transactions.stream()
                                .anyMatch(item -> "Milan".equals(item.getTrader().getCity()));
                System.out.println("5. 밀라노의 거래자가 있는지 여부 : " + trader05);

                // 6. 케임브리지에 거주하는 거래자의 모든 트랜잭션값을 출력하시오
                List<Integer> trader06 = transactions.stream()
                                .filter(item -> "Cambridge".equals(item.getTrader().getCity()))
                                .map(Transaction::getValue)
                                .collect(Collectors.toList());

                System.out.println("6. 케임브리지에 거주하는 거래자의 모든 트랜잭션값 \n" + trader06);

                // 7. 전체 트랜잭션 중 최댓값은?
                Optional<Integer> trader07 = transactions.stream()
                                .map(Transaction::getValue)
                                .reduce(Integer::max);

                System.out.println("7. 전체 트랜잭션 중 최댓값은? : " + trader07);

                // 8. 전체 트랜잭션 중 최소값은?
                Optional<Integer> trader08 = transactions.stream()
                                .map(Transaction::getValue)
                                .reduce(Integer::min);

                System.out.println("8. 전체 트랜잭션 중 최소값은? : " + trader08);


        }

}
