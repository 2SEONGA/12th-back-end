package LottoProject;

import java.util.Scanner;

public class Ticket {
    // ������ �����
    private final int ticketCount;
    public int getTicketCount() {
        return ticketCount;
    }

    public Ticket(Purchase p){
        this.ticketCount= p.getPayment()/1000;
    }
}
