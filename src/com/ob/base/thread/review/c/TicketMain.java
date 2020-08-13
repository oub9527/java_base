package com.ob.base.thread.review.c;

/**
 * @Author: oubin
 * @Date: 2020/8/11 14:01
 * @Description:
 */
public class TicketMain {

    public static void main(String[] args) {
        Ticket ticket = new Ticket();

        Thread a = new Thread(ticket);
        Thread b = new Thread(ticket);
        Thread c = new Thread(ticket);

        a.start();
        b.start();
        c.start();

    }
}
