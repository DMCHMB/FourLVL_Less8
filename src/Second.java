/* ����� � ���������� ��� ����� - m � n.
   ��������� ���� for, ������ �� ����� ������������� �������� m �� n �� ��������.

 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
������ �������������
*/

class Second {
    public static void main(String[] args) throws IOException {
        //�������� ��� ��� ���
        BufferedReader but = new BufferedReader(new InputStreamReader(System.in));
        String nu1 = but.readLine();
        String nu2 = but.readLine();
        int m = Integer.parseInt(nu1);
        int n = Integer.parseInt(nu2);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
