package LottoProject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    BufferedReader reader;
    // ��÷��ȣ ���� �迭
    private int[] ansnum = new int[6];
    // ���ʽ� �ѹ�
    private int bnum;

    // �����ڿ��� ,�� ���еǾ��ִ� lotto.txt ���� �б�
    public FileRead() {
        try {
            // ���۸����� �� ���� �а� split�� ���ڹ迭�� �����ؼ� ������ ���ڴ� ���ʽ� �ѹ��� 6�� ���ڴ� ��÷��ȣ �迭�� ����
            reader = new BufferedReader(new FileReader("C:\\Users\\������\\Documents\\lotto.txt"));
            String line = reader.readLine();
            if (line != null) {
                String[] s = line.split(",");
                for (int i = 0; i < 6; i++) {
                    ansnum[i] = Integer.parseInt(s[i]);
                }
                bnum= Integer.parseInt(s[6]);
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("������ �������� �ʽ��ϴ�.");
        }
    }

    public int[] getAnsnum() {
        return ansnum;
    }

    public int getBnum() {
        return bnum;
    }
}
