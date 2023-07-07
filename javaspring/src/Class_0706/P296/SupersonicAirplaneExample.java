package P296;

public class SupersonicAirplaneExample {
    public static void main(String[] args) {
        SupuersonicAirplane sa = new SupuersonicAirplane();
        sa.takeOff();
        sa.fly();
        sa.flyMode = SupuersonicAirplane.SUPERSONIC;
        sa.fly();
        sa.flyMode = SupuersonicAirplane.NORMAL;
        sa.fly();
        sa.land();
    }
}
