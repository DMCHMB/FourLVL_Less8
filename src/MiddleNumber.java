/*

Введи с клавиатуры три числа, выведи на экран среднее из них. Т.е. не самое большое и не самое маленькое.
Если все числа равны, выведи любое из них.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MiddleNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String strNum1 = reader.readLine();
        String strNum2 = reader.readLine();
        String strNum3 = reader.readLine();

        int num1 = Integer.parseInt(strNum1);
        int num2 = Integer.parseInt(strNum2);
        int num3 = Integer.parseInt(strNum3);


        if (((num1 <= num2) && (num1 >= num3)) || ((num1 >= num2) && (num1 <= num3))) {
            System.out.println(num1);
        }   else if (((num2 <= num1) && (num2 >= num3)) || (num2 >= num1) && (num2 <= num3)) {
            System.out.println(num2);
        } else if (((num3 <= num2) && (num3 >= num1)) || ((num3 >= num2) && (num3 <= num1))) {
            System.out.println(num3);
        }
    }
}
