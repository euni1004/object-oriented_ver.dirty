package week3_hw;

public class Taxi extends degung {

    private int speed=0;
    private String destination;
    private int standdistance =1;
    private int destinationdistnace;
    private int standprice=3000;
    private int distanceprice=1000;
    private int price;
    private int passenger;
    private int maxPassenger=4;
    private String state = "일반";
    private int totalprice;

    Taxi(int num) {
        this.degungnum=num;
    }

    public void setPassenger(int passenger,String destination,int distance){
        if(this.state.equals("일반")) {
            if (passenger <= this.maxPassenger) {
                this.passenger = passenger;
                this.destination = destination;
                this.destinationdistnace = distance;
                if (distance > 1) {
                    this.price = standprice + (distance - 1) * this.distanceprice;
                } else {
                    this.price = this.standprice;
                }
                this.state = "운행";
                this.speed=10;
            } else {
                System.out.println("최대 승객 수 초과");
            }
        }else{
            System.out.println("탑승불가 입니다.");
        }


    }

    public void setOil(int oil){
        this.oil+=oil;
        if(this.oil>=10){
            this.state="일반";
        }
    }

    public void setreset(){
        this.maxPassenger=4;
        this.totalprice+=this.price;
        if(oil<10){
            this.state="운행 불가";
            System.out.println("주유 필요");
        }else {
            this.state="일반";
        }
        this.speed=0;
    }

    public void setSpeed(int speed) {
        if(this.state.equals("운행 불가")){
            System.out.println("운행 불가 상태이므로 속도 변경 불가");
        }else{
            if(this.speed + speed<0){
                System.out.println("속도 변경 불가");
            }else
                this.speed+=speed;
        }

    }

    @Override
    public String toString() {
        return "차량 번호 = "+degungnum+
                ", 주유량 = "+oil+
                ", 상태 = "+state;
    }

    public String Print(){
        return "탑승 승객수 = "+passenger+
                "\n잔여 승객수 = "+(this.maxPassenger-this.passenger)+
                "\n기본요금 확인 = "+standprice+
                "\n목적지 = "+destination+
                "\n목적지까지 거리 = "+destinationdistnace+"km"+
                "\n지불할 요금 = "+price+
                "\n상태 = "+state+
                "\n속도 = "+speed;
    }

    public String PrintOil_price(){
        return "주유량 = "+this.oil+
                "\n상태 = "+state+
                "\n누적 요금 = "+totalprice+
                "\n속도 = "+speed;
    }
}
