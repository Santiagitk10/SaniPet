package model;

public enum Schedule {
    MONDAY_TO_WEDNESDAY("DoctorWeek"),
    FRIDAY_TO_SATURDAY("DoctorWeekend"),
    MONDAY_TO_SATURDAY("StyleList");

    String typeOfSchedule;

    Schedule (String typeOfSchedule){
        this.typeOfSchedule = typeOfSchedule;
    }

}
