package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public class Sanipet {

    public static void main(String[] args){

        ArrayList<Appointment> appointments = new ArrayList<Appointment>();

        Owner santiago = new Owner("1035424789", "Santiago", "Sierra", "3144392847", 31);
        Cat mirringo = new Cat("Mirringo", "blanquito", santiago);
        Medicine diciclin = new Medicine("Diciclin", "Pills","Veterinarian", 200, 5000);
        mirringo.addMedicine(diciclin);
        Employee doctorWeek1 = new Employee("43876389","Robert", "Healthy", "3103783562", 45, "Doctor","Monday to Wednesday");

        System.out.println(diciclin);
        Appointment appointment1 = new Appointment("Medical", LocalDate.of(2022,07,07), LocalDate.of(2022,07,07).atTime(5,30),mirringo,doctorWeek1);

        appointments.add(appointment1);

        System.out.println(appointments.get(0));

    }

}
