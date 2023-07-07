package Overloading_Overriding;

public class Job extends Woman {
    public String name;
    public int age;

    // info()메서드
    public void info() {
        System.out.println("여자의 이름은" + name + "이고, 나이는" + age + "입니다.");
    }
}