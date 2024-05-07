
public class Main {

    public static void main(String[] args) {
        Input input = new Input();
        Formatter formatter = new Formatter();
        Calculator calculator = new Calculator();
        int peopleCount = input.peopleCount();
        while (input.addProduct()) {
            String productName = input.addProductName();
            double productCoast = input.addProductCoast();
            calculator.addProduct(productName, productCoast);
        }
        System.out.println("Добавленные товары:");
        calculator.showAllProducts();
        double everyoneWillPay = calculator.everyoneWillPay(peopleCount);
        System.out.println("Каждый из " + peopleCount + " человек должен заплатить по: " + formatter.rubCoast(everyoneWillPay));
    }


}