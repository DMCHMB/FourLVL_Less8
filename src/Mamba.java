/*
Введи с клавиатуры имя и, используя цикл for, 10 раз выведи: <имя> любит меня.

Пример вывода на экран для имени Света:
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Mamba {
    public static void main(String[] args) throws IOException {
        BufferedReader put = new BufferedReader(new InputStreamReader(System.in));
        String name = put.readLine();
        for (int i = 0; i < 10; i++) {
            System.out.println(name + " любит меня.");
        }
    }
}
