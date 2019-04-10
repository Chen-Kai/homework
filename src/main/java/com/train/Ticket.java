package com.train;

import static java.lang.Math.round;

public class Ticket {

    int PriceOfReturnTicket = 2000;
    int oneticket; //One-way ticket
    int returnticket; //Return ticket

    public Ticket(int oneticket, int returnticket){
        this.oneticket = oneticket;
        this.returnticket = returnticket;
    }
    public int TotalAmount(){

        int total = 1000 * oneticket + round((PriceOfReturnTicket * returnticket) * 0.9f);
        return total;
    }
}
