import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//      Input  Оголошення змінних та класів необхідних для  опрацювання
        Scanner sc = new Scanner(System.in);
        int i;
        String s;
//      Logic Реалізація логіки программи
        System.out.println("Please enter your number: ");
        i = sc.nextInt();
        System.out.println("Please enter your Text: ");
        s = sc.nextLine();
//      Output Вихідні данні
        System.out.println("Your number is " + i);
        System.out.println("Your Text is: " + s);

    }
}
