package Class_0705;

public class StudentTest {
    public static void main(String[] args) {
        Student park = new Student(2019122104, "Park");
        Student kim = new Student(2019206028, "Kim");
        Student lee = new Student(2019153237, "Lee");
        System.out.printf("Student 객체의 수: %d", Student.count);
    }
}

class Student {

    // 클래스 변수(static fields)
    /*
     * 클래스 변수는 따로 생성자를 만들 필요가 없다.
     * 공용변수이기 때문에
     * 수시로 값이 변경됨
     */
    static int count = 0;

    // 인스턴스 변수(non-static fields)
    int id;
    String name;

    // 생성자(constructor)
    Student(int _id, String _name) {
        Student.count++;
        id = _id;
        name = _name;
    }

}
