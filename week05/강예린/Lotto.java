package LottoProject;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lotto {
    // �� ���� �ζǸ� �ߺ� ���� set���� !
    private Set<Integer> lotto;
    // ���ʽ� �ѹ� !
    private int bonusNum;

    // ������ ����� lotto ��ü�� �ζ� ��ȣ ����
    public Lotto(){
        lotto= new HashSet<>();
        randomNum();
    }

    // getter��
    public int getBonusNum() {
        return bonusNum;
    }

    public Set<Integer> getLotto() {
        return lotto;
    }

    // 1���� �ζ� �����- 6���� �⺻ ���ڿ� 1���� ���ʽ� ����
    private void randomNum(){
        while(lotto.size()!=6){
            lotto.add((int)(Math.random()*45+1));
        }
        do {
            bonusNum= (int)(Math.random()*45+1);
        }
        while (lotto.contains(bonusNum));

            }


}
