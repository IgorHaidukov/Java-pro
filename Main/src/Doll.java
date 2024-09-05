import java.util.Scanner;

public class Doll {
    public static void main(String[] args) {
//        System.out.println("********  Сравнивание чисел  ********");
//        System.out.print("Введите 1 число: ");
//        int a = new Scanner(System.in).nextInt();
//        System.out.print("Введите 2 число: ");
//        int b = new Scanner(System.in).nextInt();
//
//        if (a > 5 && b < 5) {
//            System.out.println(" ответ ");
//        }

//        if (a < b){
//            System.out.println(a + " < " + b);
//        }if (a == b){
//            System.out.println(a + " == " + b);
//
//        }

        int twixPrise = 5;
        int spraitPrise = 6;
        int marsPrise = 4;

        boolean isCanBuy = false;

        System.out.println("Введите количество денег: ");
        int moneyAmourt = new Scanner(System.in).nextInt();

        if (moneyAmourt >= twixPrise) {
            System.out.println("Твикс");
            isCanBuy = true;
        }
        if (moneyAmourt >= marsPrise) {
            System.out.println("Марс");
            isCanBuy = true;
        }
        if (moneyAmourt >= spraitPrise) {
            System.out.println("Cпрайт");
            isCanBuy = true;
        }
        if (isCanBuy = false){
            System.out.println("Нехватает денег!!!");
        }
        else if (moneyAmourt <= 3)
        {
            System.out.println("Мало денег");
        }




    }
}