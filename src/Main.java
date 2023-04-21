public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 98; // кг
        double height = 1.87; // м;
        System.out.println("BMI - индекс составит:");
        System.out.println(service.calculate(weight, height));
    }
}
