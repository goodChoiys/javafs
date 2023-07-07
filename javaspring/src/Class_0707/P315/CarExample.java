package Class_0707.P315;

public class CarExample {
    public static void main(String[] args) {
        // Car 객체 생성
        Car myCar = new Car();

        // Tire 객체 생성
        myCar.tire = new Tire();
        myCar.run();

        // Tire 객체 생성
        myCar.tire = new HankookTire();
        myCar.run();

        // Tire 객체 생성
        myCar.tire = new KumhoTire();
        myCar.run();

    }
}
