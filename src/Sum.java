/*
����� ������� ���������, � ������� ����� ����� ������� ����� � ����������, � ��� ������ ����� ������� -1, ������� �� ����� ����� ���� ����� � ��������� ���������.
-1 ������ ����������� � �����.

���������: ���� �� ��������� ������� ���� ������ - ������������ �����������:
while (true) {
int number = ��������� �����;
if (���������, ��� number -1)
break;
}

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Sum {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        while (true) {
            int number = Integer.parseInt(reader.readLine());
            sum = sum + number;

            if (number == -1) {
                break;
            }
        }
        System.out.println(sum);
    }
}
//done