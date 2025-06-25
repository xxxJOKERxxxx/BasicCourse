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

        // цикл FOREACH
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
        // оператор switch case
        int b = 2;
        String s = switch (b) {
            case 1 -> "one";
            default -> "Default";
        };
        System.out.println(s);

        System.out.println("___________________");

        // цикл FOREACH

        int[] array = new int[10];
        String[] strArray = new String[5];

        for (int number: array) {
            System.out.print(number);
        }
        for (String str: strArray) {
            System.out.print(str + " ");
        }

        System.out.println("___________________");
// оператор continue break
        for (int i = 0; i < 10; i++) {
            if(i%2 == 0) {
                continue;
            } if(i > 7) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("___________________");

        String q = "Привет";
        String w = "Привет";
        String r = "Привет";
        String e = new String("Привет");

        System.out.println(q == w);
        System.out.println(e == q);        // true → одна и та же ссылка
        System.out.println(e.equals(w));   // true → одинаковый текст
        System.out.println(System.identityHashCode(q));
        System.out.println(System.identityHashCode(e));//обьекты разные, разный хэш код

        System.out.println("___________________");
// массив
        int[] arrai2 = new int[5];
        for(int i = 0; i < arrai2.length; i++) {
            arrai2[i] = i;
            System.out.println(arrai2[i]);
        }
        System.out.println("___________________");

        String[] arr = {"one", "Two", "three"};
        for(int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }

        arr[1] = "four";
        for(int j = 0; j < arr.length; j++ ){
            System.out.println(arr[j]);
        }

        System.out.println("___________________");
        // двумерный массив
        int[][] arr2 = new int[5][5];
        for(int i = 0; i < arr2.length; i++) {
            for(int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("___________________");


    }
}