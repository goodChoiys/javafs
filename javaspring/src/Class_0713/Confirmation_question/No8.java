package Class_0713.Confirmation_question;

import java.util.*;

public class No8 {

    public static void main(String[] args) {
        Set<Student> set = new HashSet<Student>();

        set.add(new Student(1, "홍길동"));
        set.add(new Student(2, "신용권"));
        set.add(new Student(1, "조민우"));

        System.out.println("저장된 객체 수: " + set.size());
        for (Student s : set) {
            System.out.println(s.studentNum + " : " + s.name);
        }
    }
}

class Student {
    public int studentNum;
    public String name;

    public Student(int studentNum, String name) {
        this.studentNum = studentNum;
        this.name = name;
    }

    // 작성한 코드

    @Override
    public int hashCode() {
        return studentNum;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student stu = (Student) obj;
            if (stu.studentNum == studentNum)
                return true;
        }
        return false;

        /*
         * 선생님 작성
         * 
         * @Override
         * public boolean equals(Object obj){
         * //equals 메소드 동일한 객체 식별하기 위해서
         * if(this == obj){
         * return true;
         * }
         * if(obj == null || getClass()!=obj.getClass()){
         * return false;
         * }
         * Student student = (Student) obj;
         * if(studentNum != student.studentNum){
         * return false;
         * }
         * return true;
         * }
         */

        /*
         * @Override
         * public int hashCode() {
         * return studentNum;
         * }
         * 
         * @Override
         * public boolean equals(Object obj) {
         * if(!(obj instanceof Student)) return false;
         * Student student = (Student) obj;
         * if(studentNum != student.studentNum) return false;
         * return true;
         * }
         */
    }
}