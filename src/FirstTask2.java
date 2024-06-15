public class FirstTask2 {
    public static void main(String[] args) {
        int km = 42;
        int energy = 50;

        int answer = km * energy;
//        System.out.println("Калорий было потраено");
//        System.out.println("Калорий было потраено: "+ answer);

        double burgersenergy = 800.0;
        double burgers = answer / burgersenergy;
//        System.out.println("Бургеров надо сьесть");
//        System.out.println("Бургеров надо сьесть: " + burgers);
        long humaniti = 8_000_000_000L;
        long result = humaniti * answer;
        System.out.println("Всё человечество потрвтит: " + result);
       double burgeshumaniti = result / burgersenergy;
        System.out.println("Всё человечество сьест: " + burgeshumaniti);
    }

    }