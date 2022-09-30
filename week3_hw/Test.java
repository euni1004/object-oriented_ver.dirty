package week3_hw;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("<================버스================>");

        Bus bus100 = new Bus(100);
        bus100.Printnum();
        Bus bus110 = new Bus(110);
        bus110.Printnum();

        bus100.setCurrentperson(2);
        System.out.println(bus100);

        bus100.setOil(-50);
        bus100.Printoil();

        bus100.setState("차고지행");
        bus100.setOil(10);
        System.out.println(bus100.Printstate());

        bus100.setState("운행중");
        bus100.setCurrentperson(45);

        bus100.setCurrentperson(5);
        System.out.println(bus100);

        bus100.setOil(-55);
        System.out.println(bus100.Printstate());

        System.out.println("-----------------버스 test-----------------");

        bus100.setOil(50);
        bus100.setState("운행중");
        System.out.println(bus100.Printstate());

        bus100.setCurrentperson(5);
        System.out.println(bus100);

        bus100.setCurrentperson(5);
        System.out.println(bus100);

        bus100.setSpeed(10);
        System.out.println(bus100.Printstate());

        System.out.println();
        System.out.println("<================택시================>");
        /*택시 상태가 일반일때 속도가 0이여야 승객이 탈수 있으므로 일반일때와 운행불가일때 속도는 0
        * 운행중일떄는 10. 속도는 운행 불가 상태와 최종속도가 0보다 작은 경우가 아니라면 다 변경 가능
        *
        * 기본 요금은 3000원
        * 1키로당 1000원씩 추가됨*/

        Taxi taxi1 = new Taxi(1);
        System.out.println(taxi1);
        Taxi taxi2= new Taxi(2);
        System.out.println(taxi2);
        System.out.println();

        taxi1.setPassenger(2,"서울역",2);
        System.out.println(taxi1.Print());
        System.out.println();

        taxi1.setOil(-80);

        taxi1.setreset();//결제후 내림

        System.out.println(taxi1.PrintOil_price());
        System.out.println();

        taxi1.setPassenger(3,"구로 디지털 단지역",12);
        System.out.println(taxi1.Print());
        System.out.println();

        taxi1.setOil(-20);

        taxi1.setreset();
        System.out.println(taxi1.PrintOil_price());
        System.out.println();

        System.out.println("-----------------택시 test-----------------");

        taxi1.setOil(100);
        taxi1.setPassenger(2,"신중동역",12);
        System.out.println(taxi1.Print());
        System.out.println();

        taxi1.setOil(-20);

        taxi1.setreset();
        System.out.println(taxi1.PrintOil_price());
        System.out.println();
    }
}
