/*
����� � ���������� ��� �, ��������� ���� for, 10 ��� ������: <���> ����� ����.

������ ������ �� ����� ��� ����� �����:
����� ����� ����.
����� ����� ����.
����� ����� ����.
����� ����� ����.
����� ����� ����.
����� ����� ����.
����� ����� ����.
����� ����� ����.
����� ����� ����.
����� ����� ����.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Mamba {
    public static void main(String[] args) throws IOException {
        BufferedReader put = new BufferedReader(new InputStreamReader(System.in));
        String name = put.readLine();
        for (int i = 0; i < 10; i++) {
            System.out.println(name + " ����� ����.");
        }
    }
}
