package staticex;

public class StudentTest4 {
    public static void main(String[] args) {
        Student2 studentLee = new Student2();
        studentLee.setStudentName("이지원");
        System.out.println(Student2.getSerialNum());
        //Student2.java의 getSerialNum() 메소드에서 serialNum을 리턴하니깐,10번째 행에 studentID = serialNum에 할당되고 한개가 올라가니 1001이되는것같다.
        System.out.println(studentLee.studentName + "학번:" + studentLee.studentID);

        Student2 studentSon = new Student2();
        studentSon.setStudentName("손수경");
        System.out.println(Student2.getSerialNum());
        System.out.println(studentSon.studentName + "학번:" + studentSon.studentID);
    }
}
