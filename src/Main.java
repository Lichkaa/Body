public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int m;
        double h;
        double result = service.calculate(82, 1.73);
        System.out.println("Индекс массы тела равен");
        System.out.println(result);
    }
}
