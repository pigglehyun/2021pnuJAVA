package com.cafe.order;
import com.cafe.menu.Beverage;
import java.util.ArrayList;
import java.util.List;


public class Order {
    private int orderNo  ;
    private List<OrderItem> items = new ArrayList<>();

    private static int orderCounter = 1;

    public Order() {
    }


    public void addItem(OrderItem order){
        items.add(order);
        orderCounter++;
    }

    public void completed(){
        orderNo++;
    }

    public int getOrderCounter() {return this.orderCounter;}
    public int getOrderNo(){return this.orderNo;}

    public void setOrderNo(int orderNo){
        this.orderNo = orderNo;
    }


    private Order.PickUp delivery;

    public static interface PickUp {
        public abstract String toString();


        public abstract void handle(Order o);

    }
     public void setPickUp(Order.PickUp pickUp){
        pickUp.handle(this);
    }
    public Order.PickUp getPickUp(){
        return this.delivery;
    }


    public String toString(){
        String txt = "";
   //     int i = 1;
   //     for(OrderItem e : items){
   //             txt += e;
   //         }
        return items.toString();
    }


}