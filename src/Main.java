public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bmi = (int) service.calculate(75, 1.68);
        System.out.println("Ваш индекс массы тела " + bmi);
    }
}