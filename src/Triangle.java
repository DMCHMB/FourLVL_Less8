/*
»спользу€ цикл for, выведи на экран пр€моугольный треугольник из восьмЄрок со сторонами 10 и 10.
*/


class Triangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < i; j++) { //цикл дожен рисовать диагональ
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
