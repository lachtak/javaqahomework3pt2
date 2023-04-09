public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        System.out.println("Ваш индекс массы тела (ИМТ) составляет: " + service.calculate(1.87, 98) + " кг/м²");

        System.out.println();
        System.out.println("Ваш индекс массы тела (ИМТ) составляет: " + service.calculate(2.15, 112) + " кг/м²");

        System.out.println();
        System.out.println("Ваш индекс массы тела (ИМТ) составляет: " + service.calculate(1.65, 95) + " кг/м²");

        System.out.println();
        System.out.println("Ваш индекс массы тела (ИМТ) составляет: " + service.calculate(1.70, 77) + " кг/м²");
    }
}
