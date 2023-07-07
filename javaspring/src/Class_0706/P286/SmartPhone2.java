package P286;

public class SmartPhone2 extends Phone2 {

    public String weight;

    // 자식 생성자 선언
    public SmartPhone2(String model, String color, String weight) {
        super(model, color);
        this.weight = weight;
        System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
    }

}
