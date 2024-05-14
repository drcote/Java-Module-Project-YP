import java.util.Locale;
import java.util.Scanner;

public class Input {
    public int peopleCount() {
        System.out.println("На скольких человек необходимо разделить счет");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите число");
            if (!scanner.hasNextInt()) {
                System.out.println("Введено не число, попрбуйте заново ввести число");
                scanner.nextLine();
            } else {
                int peopleCount = scanner.nextInt();
                if (peopleCount > 1) {
                    return peopleCount;
                }
                if (peopleCount <= 1) {
                    System.out.println("Введенное число должно быть больше 1");
                }
            }
        }
    }

    public String addProductName() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите название товара");
            if (!scanner.hasNext()) {
                System.out.println("Введена не строка, попробуйте заного ввести название товара");
                scanner.nextLine();
            } else {
                String productName = scanner.nextLine();
                if (!productName.isEmpty()) {
                    return productName;
                }
            }
        }
    }

    public double addProductCoast() {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        while (true) {
            System.out.println("Введите стоимость товара");
            if (!scanner.hasNextDouble()) {
                System.out.println("Стоимость товара должна иметь вид рубли.копейки");
                scanner.nextLine();
            } else {
                double coast = scanner.nextDouble();
                if (coast > 0) {
                    return coast;
                } else {
                    System.out.println("Стоимость должна быть больше 0");
                    scanner.nextLine();
                }

            }
        }
    }

    public boolean addProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Хотите добавить товар?");
        if (scanner.hasNext()) {
            String command = scanner.next();
            return !command.equalsIgnoreCase("Завершить");
        }
        return true;
    }
}
