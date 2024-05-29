package LottoProject;

public class Profit {
    private double ratio;
    // ���ͷ��� ����Ϸ��� ���� �����ؾ��ϰ� ��÷���� �� ���ɾ��� �ʿ���
    public Profit(Purchase p, Matching m) {
        calRatio(p,m);
        printProfit();
    }
    // ���ͷ� ���
    private void calRatio(Purchase p, Matching m){
        if(p.getPayment()==0) ratio=0; // �����̾����� 0
        else ratio= (p.getPayment()-m.getTotal())/(double)p.getPayment()*100;
    }
    private void printProfit(){
        System.out.println("���ͷ��� "+getRatio()+"%");
    }
    public double getRatio() {
        return ratio;
    }
}
