public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightInKg = 105;
        double heightInMeters = 2.02;
        int bmi = service.calculate(weightInKg,heightInMeters);
        System.out.println(bmi);
    }
}