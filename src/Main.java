public class Main {
    public static void main(String[] args) {
        boolean registered = true;
        double deposit = 100500.50;
        if (deposit > 1000) {
            deposit = deposit + (int)(deposit / 100);
        }
        System.out.println("Вам начислено " + deposit + " рублей");
    }
}
