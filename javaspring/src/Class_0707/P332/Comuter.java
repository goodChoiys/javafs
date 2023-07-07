package Class_0707.P332;

public class Computer extends Machine {

    @Override
    public void powerOn() {
        System.out.println("전원을 켭니다.");
    }

    @Override
    public void work() {
        System.out.println("컴퓨터가 동작합니다.");
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();
        computer.work();
    }
}