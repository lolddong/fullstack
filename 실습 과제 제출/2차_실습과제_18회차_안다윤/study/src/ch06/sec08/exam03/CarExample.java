package ch06.sec08.exam03;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setGas(5);
        myCar.isLeftGas();
        while(myCar.gotGas()) {
            System.out.println("출발합니다.");
            myCar.run();
        }
            System.out.println("gas를 주입하세요.");
    }
}
