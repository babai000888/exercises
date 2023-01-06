package edu.ex1_enum;

public enum DayOfWeek2 {

    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;


    @Override
    public String toString() {
//        return super.toString();
        return " Переопределил : " + this.name() + " порядковый номер : " + this.ordinal();
    }
}
