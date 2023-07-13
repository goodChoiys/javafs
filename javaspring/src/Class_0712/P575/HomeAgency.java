package Class_0712.P575;

public class HomeAgency implements Rentable<Home> {
    @Override
    public Home rent() {
        return new Home();
    }
}
