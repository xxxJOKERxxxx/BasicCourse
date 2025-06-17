public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }


    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printNameAndSecondName(String name, String secondName) {
        System.out.println("имя : " + name);
        System.out.println("Фамилия : " + secondName);
    }



}
