import java.lang.*;

class Person implements Comparable {
    private String name;
    private String surname;
    private String patronymic;
    private int age;
    Person(String name, String surname, String patronymic, int age) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.age = age;
    }
    public String toString(){
        return "Name: " + this.name
                + " surname: " + this.surname
                + " patronymic: " + this.patronymic
                + " age:" + this.age;
    }
    String getName(){
        return name;
    }

    @Override
    public int compareTo(Object o) {
        Person person = (Person) o;
        return this.name.compareToIgnoreCase(person.getName());
    }
}
