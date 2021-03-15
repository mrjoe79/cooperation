package cooperation;

public class Bus {
    int busNumber;
    int passengerCount;
    int money;

    public Bus(int busNumber) {
        this.busNumber = busNumber ;
        //this.passengerCount = passengerCount;   승객수는 왜 안될까?
    }

     public int take(int money) {                //난 매개변수에 int passenger, int money로 적었음
        this.money = money;
        passengerCount++;
        return money;
    }

    public void showInfo(){
        System.out.println("버스 " + busNumber + "번의 승객은 " + passengerCount + "명이고, 수입은 " + money + "입니다.");
    }


}
