/* ¬веди с клавиатуры два числа - m и n.
   »спользу€ цикл for, выведи на экран пр€моугольник размером m на n из восьмЄрок.

 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
–исуем пр€моугольник
*/

class Second {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
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
