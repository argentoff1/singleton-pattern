public class Main {

    public static void main(String[] args) {
        ChocolateBoiler first_boiler = ChocolateBoiler.getInstance();
        System.out.println("Первый экземпляр: " + first_boiler);

        ChocolateBoiler second_boiler = ChocolateBoiler.getInstance();
        System.out.println("Второй экземпляр: " + second_boiler);
    }
}
