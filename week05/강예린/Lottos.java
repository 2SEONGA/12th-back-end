package LottoProject;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lottos {

    private List<Lotto> lottos;
    
    // �ζǵ��� ������ lottos �����ڴ� Ƽ���� ������ �� ����
    public Lottos(Ticket t){
        lottos= new ArrayList<>();
        generateLottos(t);
        printLotto(t);
    }
    
    public List<Lotto> getLottos() {
        return lottos;
    }
    
    // Ƽ���� �� ��ŭ for���� ������ lottos�� lotto�� ����� ����
    private void generateLottos (Ticket t){
        for (int i=0; i< t.getTicketCount(); i++){
            lottos.add(new Lotto());
        }
    }
    
    // for each �̿��Ͽ� ���� �� ���� �ζ� ��ȣ ����ϴ� �޼ҵ� ȣ��
    private void printLotto(Ticket t){
        System.out.println( t.getTicketCount()+"�� �����ϼ̽��ϴ�.");
        for (Lotto l : lottos){
            printNum(l);
        }

    }
    // �ζ� ��ȣ ����ϴ� �޼ҵ�
    private void printNum(Lotto l) {
        Iterator<Integer> it= l.getLotto().iterator();
        while(it.hasNext()){
            int num = it.next();
            System.out.print(num+" ");
        }
        System.out.println("+"+l.getBonusNum());
    }
}
