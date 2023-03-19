package com.cafe.order;

public class PickUpFactory {
    public PickUpFactory(){}

    class Delivery implements Order.PickUp {
        private String address;
        public Order o = new Order();

        public Delivery(String address){
            this.address = address;
        }
        public void handle(Order o){
            this.o = o;
        }
        public  String toString(){
            return ("\n" +
                    "--- 배달 관리 화면 ---\n" +
                    "배달통으로 주문을 전달합니다!\n" +
                    "배송주소: "+this.address);
        }

    }

    class DriveThru implements Order.PickUp {
        private String vehicleNumber;
        public Order o = new Order();

        public DriveThru(String vehicleNumber){
            this.vehicleNumber = vehicleNumber;
        }
        public void handle(Order o){
            this.o = o;
        }
        public  String toString(){
            return ("\n--- 드라이브 쓰루 화면 ---\n" +
                    "차량번호: "+vehicleNumber+"\n" +
                    "주문하신 음료가 준비 되었습니다!");
        }

    }

    class TakeOut implements Order.PickUp {
        public String p = "pickup";
        public Order o = new Order();

        public void handle(Order o){
            this.o = o;
        }
        public  String toString(){
            return ("\n--- 테이크 아웃 화면 ---\n" +
                    "주문번호: "+this.o.getOrderNo()+"\n" +
                    "주문하신 음료가 준비 되었습니다!");
        }

    }


    public Order.PickUp makeTakeOut (){
        return new TakeOut();
    }

    public Order.PickUp makeDriveThru(String vehicleNumber){
        return new DriveThru(vehicleNumber);
    }

    public Order.PickUp makeDelivery (String address){
        return new Delivery(address);
    }


}