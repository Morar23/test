import java.util.Scanner;

public class First {
    public  static void main(String[]age)
    {
        Scanner scanner = new Scanner(System.in);
        double i;
        double sum = 0;
        for (int j = 0 ; j < 14; j++){
            System.out.print("Введите I: ");
            i = scanner.nextDouble();
            i *= i;
            sum += i;
        }
        System.out.print("Сумма квадратов: " + sum);
    }
}
