public class Main {
    public static void main(String[] args) {
        boolean registered = true;
        double amount = 1590.99;
        int count = 20;
        int miles = (int) (amount / count);
        System.out.println("Вам начислено " + miles + " миль");
    }
}
