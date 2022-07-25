/*
Давай напишем программу, в которой нужно будет вводить числа с клавиатуры, и как только будет введено -1, вывести на экран сумму всех чисел и завершить программу.
-1 должно учитываться в сумме.

Подсказка: один из вариантов решения этой задачи - использовать конструкцию:
while (true) {
int number = считываем число;
if (проверяем, что number -1)
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