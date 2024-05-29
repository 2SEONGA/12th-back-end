package LottoProject;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Purchase {
    // ������ ��
    private int payment;
    Scanner scn;
    public Purchase(){
        scn= new Scanner(System.in);
        buyTicket();
    }
    public void setPayment(int payment) {
        this.payment = payment;
    }

    public int getPayment() {
        return payment;
    }

    // 1000�� ������ �����ؾ����� payment�� ����
    private void buyTicket(){
        while(true){
            try {
                System.out.println("������ �׼��� �Է����ּ���.");
                int n = scn.nextInt();
                if (n % 1000 == 0) {
                    setPayment(n);
                    return;
                } else {
                    System.out.println("1000�� ������ �������ּ���.");
                }
            } catch(InputMismatchException e){
                System.out.println("���ڸ� �Է����ּ���.");
                scn.next();
            }
        }
    }
}
