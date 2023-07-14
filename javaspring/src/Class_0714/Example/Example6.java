package Class_0714.Example;

public class Example6 {
    public static double cald(Function fun) {
        double x = 10;
        double y = 4;
        return fun.apply(x, y);
    }

    public static void main(String[] args) {
        double result = cald((x, y) -> (x / y));
        System.out.println("result: " + result);
    }

    @FunctionalInterface
    public interface Function {

        public double apply(double a, double b);
    }

}
