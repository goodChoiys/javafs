package Class_0712.P575;


public class GenericExample {
    public static void main(String[] args) {
        HomeAgency homeAgency = new HomeAgency();
        Home Home = homeAgency.rent();
        home.turnOnLight();

        CarAgency carAgency = new CarAgency();
        Car car = carAgency.rent();
        car.run();
    }
}
//HomeAgency의 rent() 메서드를 호출하여 Home 객체를 얻고, 이후 turnOnLight() 메서드를 호출하여 전등을 켭니다.
//CarAgency의 rent() 메서드를 호출하여 Car 객체를 얻고, 이후 run() 메서드를 호출하여 전등을 켭니다.




