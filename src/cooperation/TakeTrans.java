package cooperation;

public class TakeTrans {
    public static void  main(String[] args) {
        Student studentJames = new Student("James", 5000);   //Student 클래스에서 매개변수를 저렇게 지정했구나..
        Student studentTomas = new Student("Tomas", 10000);

        Bus bus100 = new Bus(100);    //Bus 클래스에서 매개변수를 저렇게 지정했구나..
        studentJames.takeBus(bus100);           //이거 왜 이렇게 썼는지 모르겠다.
        studentJames.showInfo();
        bus100.showInfo();

        Subway subwayGreen = new Subway("2호선");
        studentTomas.takeSubway(subwayGreen);
        studentTomas.showInfo();
        subwayGreen.showInfo();
    }
}
