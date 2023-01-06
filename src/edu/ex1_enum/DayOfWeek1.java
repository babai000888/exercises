package edu.ex1_enum;

public class DayOfWeek1 {

    private String title;

    private DayOfWeek1(String title) {
        this.title = title;
    }

    public static DayOfWeek1 SUNDAY = new DayOfWeek1("Воскресенье");
    public static DayOfWeek1 MONDAY = new DayOfWeek1("Понедельник");
    public static DayOfWeek1 TUESDAY = new DayOfWeek1("Вторник");
    public static DayOfWeek1 WEDNESDAY = new DayOfWeek1("Среда");
    public static DayOfWeek1 THURSDAY = new DayOfWeek1("Четверг");
    public static DayOfWeek1 FRIDAY = new DayOfWeek1("Пятница");
    public static DayOfWeek1 SATURDAY = new DayOfWeek1("Суббота");

    @Override
    public String toString() {
        return "DayOfWeek1{" +
                "title='" + title + '\'' +
                '}';
    }

    public static void main(String[] args) {
        DayOfWeek1 dayOfWeek1 = new DayOfWeek1("Суббота");
        System.out.println(dayOfWeek1);
        System.out.println(SUNDAY);
    }
}
