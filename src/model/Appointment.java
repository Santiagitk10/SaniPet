package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Appointment {

    /*https://youtu.be/il7eVsDPFoA?t=642 to use localDate and localTime*/
    private String typeOfAppointment;
    private String Status;
    private LocalDate date;
    private LocalDateTime hour;
    private Pet pet;
    private Employee employee;

    public Appointment(String typeOfAppointment, LocalDate date, LocalDateTime hour, Pet pet, Employee employee) {
        this.typeOfAppointment = typeOfAppointment;
        this.Status = String.valueOf(appointmentStatus.NOT_STARTED);
        this.date = date;
        this.hour = hour;
        this.pet = pet;
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "typeOfAppointment='" + typeOfAppointment + '\'' +
                ", Status='" + Status + '\'' +
                ", date=" + date +
                ", hour=" + hour +
                ", pet=" + pet +
                ", employee=" + employee +
                '}';
    }
}
