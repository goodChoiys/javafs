package P286;

public class SmartPhoneExample1 {
    public static void main(String[] args) {

        // smartphone 객체 생성
        SmartPhone1 myPhone1 = new SmartPhone1("갤럭시", "은색");

        // Phone 으로부터 상속받은 필드 읽기
        System.out.println("모델: " + myPhone1.model);
        System.out.println("색상: " + myPhone1.color);
    }

}
