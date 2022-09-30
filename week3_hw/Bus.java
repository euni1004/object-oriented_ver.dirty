package week3_hw;

public class Bus extends degung {

    private int personmax = 30;
    private int currentperson;
    private int yogum;
    private String state = "운행중";
    private int speed;

    Bus(int degungnum) {
        this.degungnum = degungnum;
    }

    public void setCurrentperson(int currentperson) {
        if (this.state.equals("운행중")) {
            if (this.personmax < this.currentperson + currentperson) {
                System.out.println("최대 승객수 초과");
            } else {
                this.currentperson += currentperson;
                this.personmax -= currentperson;
                this.yogum = 1000 * currentperson;
            }
        } else {
            System.out.println("이 버스는 차고지 행 버스입니다.");
        }

    }

    public void setSpeed(int speed) {
        if(this.speed + speed<0){
            System.out.println("속도 변경 불가");
        }else
            this.speed+=speed;
    }

    public void setState(String state) {
        if(state.equals("차고지행")) {
            this.state = state;
            this.currentperson = 0;
            this.personmax = 30;
            this.speed = 0;
        }else{
            this.state = state;
            this.currentperson = 0;
            this.personmax = 30;
            this.speed = 10;
        }

    }

    public void setOil(int oil) {
        this.oil += oil;
        if (this.oil < 10) {
            this.state = "차고지행";
            this.currentperson = 0;
            this.personmax = 30;
            this.speed=0;
            System.out.println("주유 필요");
        }
    }


    @Override
    public String toString() {
        return "잔여승객수 =" + personmax +
                ", 탑승 승객 수 =" + currentperson +
                ", 요금확인 =" + yogum;
    }

    public String Printstate() {
        return "상태 = " + state +
                ", 주유량 = " + oil +
                ", 속도 = "+speed;
    }


}
