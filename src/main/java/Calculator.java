import java.util.ArrayList;

public class Calculator {
    ArrayList<Product> products = new ArrayList<>();

    public void addProduct(String name, double coast) {
        products.add(new Product(name, coast));
        System.out.println("Товар " + name + " успешно добавлен.");
    }

    private double totalCoast() {
        double totalCoast = 0;
        for (int i = 0; i < products.size(); i++) {
            totalCoast += products.get(i).coast;
        }
        return totalCoast;
    }

    public void showAllProducts() {
        if (!products.isEmpty()) {
            for (int i = 0; i < products.size(); i++) {
                System.out.println(products.get(i).name);
            }
        } else {
            System.out.println("Товаров нет в списке");
        }
    }

    public double everyoneWillPay(int peopleCount) {
        double totalCoast = totalCoast();
        if (totalCoast > 0) {
            return totalCoast / peopleCount;
        } else {
            return 0.0;
        }

    }
}
