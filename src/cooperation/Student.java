package cooperation;

public class Student {
    String studentName;                 // 3개 다 자료형 앞에 public 이 왜 들어가는지 모르겠다.
    int grade;
    int money;

    public Student(String studentName,int money){            //student가 생성될때, 2개의 매개변수로 받겠다라는 뜻 같다.
        this.studentName = studentName;
        this.money = money;
    }

    public void takeBus(Bus bus) {   //('Bus bus' 의 형태(대문자/소문자)로 왜 써야하는지 모르겠다. Bus 클래스에서 가져온다는 뜻?)
     //   bus.take(1000);                 //학생이 버스를 타면 1000원을 내라는 코드인데, 왜 저렇게 쓸까?
        this.money -= 1000;             //여기서 this 를 쓴 이유는 Student의 멤버변수 중 하나인 money에서 1000원이 차감되기때문에 this를 표현한것인가>?
        int resultTake = bus.take(1000);
        System.out.println(resultTake);
    }

    public void takeSubway(Subway subway) {
        subway.take(1500);
        this.money -= 1500;
    }

    public void showInfo() {
        System.out.println(studentName + "님의 남은 돈은" + money + "입니다.");
    }
}
