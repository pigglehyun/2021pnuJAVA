package com.cafe.order;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import static com.cafe.order.OrderTest.pickUpFactory;


public class OrderRepository implements Iterator<Order> {
    List<Order> orders = new ArrayList<>();
    Iterator<Order> itr = orders.iterator();
    private  int index = 1;


    public boolean hasNext(){
        return itr.hasNext();

    }
    public Order next(){
        return orders.remove(0);
    }

    public void add(Order order){
        order.setOrderNo(index);
        orders.add(order);
        index++;
    }
    public int getIndex(){
        return  this.index;
    }

    public String toString(){
        int i = 1 ;
        String s = "";
        String txt = "";
        for(Order e : orders){
           txt += "주문번호: "+(e.getOrderNo())+" - "+ e.toString() + "\n";
           i++;
        }
        Order.PickUp t;


        if( i ==4 ){
            t = pickUpFactory.makeDelivery("Pusan National University") ;
            s += t.toString();
        }
        if( i ==3 ){
            t = pickUpFactory.makeDriveThru("001가0000") ;
            s += t.toString();
        }
        if( i ==2 ){
            t = pickUpFactory.makeTakeOut() ;
            s += t.toString();
        }

        return "\n--- 주문 관리자 화면 ---\n" +
                "현재 주문수는 총 "+(i-1)+" 입니다.\n\n" +
                "< 주문 내역 > \n"
        +txt + s
                ;





    }
    // your code here
}