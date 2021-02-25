import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        addition add = new addition();
        subtraction sub = new subtraction();
        multiplication multi = new multiplication();
        division div = new division();

        //Обеспечение цикличной работы программы
        String end = "1";
        while ("1".equals(end)) {

            //Ввод исходных данных
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите a:");
            int a = sc.nextInt();
            System.out.println("Введите оператор:");
            String operator = sc.next();
            System.out.println("Введите b:");
            int b = sc.nextInt();

            //Вызов метода наследника
            if ("+".equals(operator)) {
                add.execute(a, b);
            } else {
                if ("-".equals(operator)) {
                    sub.execute(a, b);
                } else {
                    if ("*".equals(operator)) {
                        multi.execute(a, b);
                    } else {
                        if ("/".equals(operator)) {
                            div.execute(a, b);
                        } else {
                            System.out.println("Оператор введён некорректно!");
                        }
                    }
                }
            }
            //Условие выхода из цикла
            System.out.println("Введите любую строку, если хотите выйти из программы.");
            System.out.println("Введите '1', если хотите продолжить работу.");
            end = sc.next();

        }
    }
}
