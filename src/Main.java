public class Main {
    public static void main(String[] args) {

        // Exercise 1
        System.out.println("Exercise 1");
        for (int i = 1; i <= 10; i++){
            System.out.print(" Итерация цикла " + i);
        }

        // Exercise 2
        System.out.println("\n Exercise 2");
        for (int i = 10; i > 0; i--){
            System.out.print(i + " ");
        }

        // Exercise 3
        System.out.println("\n Exercise 3");
        for (int i = 0; i < 17; i = i + 2){
            System.out.print(i + " ");
        }

        // Exercise 4
        System.out.println("\n Exercise 4");
        for (int i = 10; i >= -10; i--){
            System.out.print(i + " ");
        }

        // Exercise 5
        System.out.println("\n Exercise 5");
        for (int i = 1904; i <= 2096; i = i + 4){
            System.out.println(i + " год является високосным ");
        }

        // Exercise 6
        System.out.println("\n Exercise 6");
        for (int i = 7; i <= 98; i = i + 7){
            System.out.print(i + " ");
        }

        // Exercise 7
        System.out.println("\n Exercise 7");
        int a = 1;
        System.out.print(a + " ");
        for (int i = 2; i <= 512; i = i * 2){
            System.out.print(i + " ");
        }

        // Exercise 8
        System.out.println("\n Exercise 8");
        int sum = 29000;
        int bank = 0;
        for (int i = 0; i < 12; i++){
            bank = bank + sum;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + bank + " рублей");
        }

        // Exercise 9
        System.out.println("\n Exercise 9");
        int sumInBank = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++){
            total = total + total/100;
            total = total + sumInBank;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }
}