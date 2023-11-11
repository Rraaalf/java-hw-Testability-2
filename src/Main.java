public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int index = service.calculator(1.87, 98);
        System.out.println(index);
        System.out.println();
        System.out.println();
        System.out.println("Сравнение с результатами из онлайн калькулятора:");
        System.out.println();
        System.out.println("Рост 1,50 см, вес 90 кг");
        System.out.println("Ожидаемый результат: 40");
        System.out.println("Фактический результат: " + service.calculator(1.50, 90));
        System.out.println();
        System.out.println("Рост 2 м, вес 70 кг");
        System.out.println("Ожидаемый результат: 17");
        System.out.println("Фактический результат: " + service.calculator(2, 70));
    }
}
