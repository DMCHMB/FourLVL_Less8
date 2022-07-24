/*
»спользу€ цикл for, выведи на экран:

горизонтальную линию из 10 восьмЄрок;
вертикальную линию из 10 восьмЄрок (символ из горизонтальной линии не учитываетс€).
 */



class Lines {
    public static void main(String[] args) {

        for (int i = 0; i < 10 ; i++) {
            System.out.print(8);
        }
        System.out.println();

        for (int i = 0; i < 10 ; i++) {
            System.out.println(8);
        }
    }
}
