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

        while (a < 5) {
            System.out.println(a);
            a++;
        }
        
        



    }
}