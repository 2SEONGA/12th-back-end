package LottoProject;

import java.util.List;

public class Matching {
    // 1�� 2�� 3�� 4�� 5���� � ��÷�Ǿ����� reward �迭�� ����
    private int[] reward = {0,0,0,0,0};

    // ����� �����
    int [] price= { 2000000000, 30000000,1500000, 50000, 5000};
    //�� ���
    private int total=0;
    // ������ �����ϸ� �ٷ� fileread ��ü ���� ��÷��ȣ�� ���ʽ� ��ȣ�� �о���� ����� ���� �ζǵ� �ʿ�
    public Matching(Lottos ls){
        FileRead fr= new FileRead();
        matchedNum(ls, fr);
        printPrice(fr);
    }

    public int[] getPrice() {
        return price;
    }

    public int getTotal() {
        return total;
    }

    // 6��° ���ڱ��� Ȯ�� �� 5�� ������ ������ ���ʽ� �ѹ��� Ȯ��- for each�� ���
    private void matchedNum(Lottos ls, FileRead fr) {
        for(Lotto l : ls.getLottos()){
            int cnt=0;
            for(int n: fr.getAnsnum()){
                if(l.getLotto().contains(n)) cnt++; // contains ����Ͽ� ��÷��ȣ�� ���� �Ǿ������� cnt++
            }
            // ���� Ȯ���� ������ ���� ��ȣ�� ��� �������� ���ʽ� ��ȣ�� �´��� Ȯ����
            switch (cnt){
                case 6:
                    reward[0]++;
                    break;
                case 5:
                    if(l.getBonusNum()==fr.getBnum()) reward[1]++;
                    else reward[2]++;
                    break;
                case 4:
                    reward[3]++;
                    break;
                case 3:
                    reward[4]++;
                    break;
            }
        }

        calTotal();
        }
        // ��� �� �� ����ϱ�
    private void calTotal(){
        for (int i=0 ; i< price.length; i++) {
            total += price[i]* reward[i];
        }
    }
    // ��÷��ȣ�� ���
    private void printPrice(FileRead fr){
        System.out.print("��÷ ��ȣ��: ");
        for (int i=0; i<fr.getAnsnum().length; i++) System.out.print(fr.getAnsnum()[i]+" ");
        System.out.println("+"+fr.getBnum());
        for (int i=0; i<reward.length; i++){
            System.out.println((i+1)+"�� ("+getPrice()[i]+"): "+reward[i]+"��");
            total+= price[i]*reward[i];
        }
        System.out.println("�� "+getTotal()+"�� �Դϴ�.");
    }
}
