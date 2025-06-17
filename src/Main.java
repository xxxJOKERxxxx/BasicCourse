public class Main {

    public static void main(String[] args) {

        Person person2 = new Person("Евгений");
        person2.printNameAndSecondName("Евгений", "Малиновский");

        int age = 43;
        String info = age >= 18 ? "Взрослый" : "Подросток";
        System.out.println(info);

        int a = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println(a);
            a++;
            
        }
        System.out.println("___________________");

        while (a < 6) {
            System.out.println(a);
            a++;
        }

        System.out.println("___________________");


        int[] arrai = new int[5];
        for(int num : arrai) {
            System.out.println(num);
        }

        System.out.println("___________________");


        String welcome = "Hello World!";
        String name1 = "Andrei";
        String name2 = new String("Andrei");

        System.out.println(welcome);

        System.out.println("___________________");

        int example = 15;
        if (example <5) {
            example +=10;
        } else if (example == 15) {
            example -=10;
        } else {
            example++;
        }
        System.out.println(example);

        System.out.println("___________________");

        int b = 2;
        String s = switch (b) {
            case 1 -> "one";
            default -> "Default";
        };
        System.out.println(s);

        System.out.println("___________________");






    }
}