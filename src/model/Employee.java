package model;

public class Employee extends Person {

    private String employeeType;
    /*private Schedule squedule;*/
    private String squedule;

    public Employee(String id, String name, String surname, String cellPhone, int age, String employeeType, String squedule) {
        super(id, name, surname, cellPhone, age);
        this.employeeType = employeeType;
        this.squedule = squedule;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeType='" + employeeType + '\'' +
                ", squedule='" + squedule + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", cellPhone='" + cellPhone + '\'' +
                ", age=" + age +
                '}';
    }
}
