package Class_0707.P325;

public class SmartPhone extends Phone {
    
    // 생성자 선언
    SmartPhone(String owener){
        // Phone 생성자 호출
        super(owener);
    }

    // 메소드 선언
    void internetSearch(){
        System.out.println("인터넷 검색을 합니다.");
    }


}
