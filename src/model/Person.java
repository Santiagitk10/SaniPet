package model;

public abstract class Person {

    protected String id;
    protected String name;
    protected String surname;
    protected String cellPhone;
    protected int age;

    public Person(String id, String name, String surname, String cellPhone, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.cellPhone = cellPhone;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", cellPhone='" + cellPhone + '\'' +
                ", age=" + age +
                '}';
    }
}
