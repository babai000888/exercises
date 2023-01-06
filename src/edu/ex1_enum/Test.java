package edu.ex1_enum;

import java.util.Optional;

public class Test {
    public static void main(String[] args) {
        Color color = Color.valueOf("BLACK");
        System.out.println("Color.valueOf   : " + color);
        System.out.println("Color.valueOf   : " + color.name());
        System.out.println("Color.valueOf   : " + color.ordinal());
        System.out.println("Color.valueOf   : " + Color.WHITE.ordinal());
        System.out.println("Color.valueOf   : " + color.getDeclaringClass());
        System.out.println("values:   : " + Color.values());

        DayOfWeek1 sun = DayOfWeek1.SUNDAY;
        System.out.println("DayOfWeek1 sun  : " + sun);

        DayOfWeek2 sreda = DayOfWeek2.THURSDAY;
        System.out.println(sreda);

        Level level = Level.MEDIUM;
        System.out.println(" Level : " + level);
        System.out.println(" Level : " + level.ordinal());
        System.out.println(" Level : " + level.getMyCustomeValue());
        level.setMyCustomeValue(1111);
        System.out.println(" Level : " + level.getMyCustomeValue());

        System.out.println(MyEnum.C1.getValue(3));
        System.out.println(MyEnum.C2.getValue(4));
        System.out.println(MyEnum.C3.getValue(5));

        System.out.println("OUTER :   " + OuterEnum.C1);
        System.out.println("OUTER :   " + OuterEnum.NestedEnum.C5);

        CommandList.JUMP.execute();
        CommandList.RUN.execute();

        Parent p = new Parent();
        CommandClass cc = new CommandClass();
        cc.execute();

        CommandClass.tt.TWO.execute();


        System.out.println(Level.values()[1]);
        System.out.println(Level.valueOf("LOW"));
//        System.out.println(Level.valueOf("NONE"));


        // СРАВНЕНИЕ
        Level high = Level.HIGH;
        System.out.println(high);
        Level high1 = Level.HIGH;
        high.setMyCustomeValue(100);
        Level none = null;
        System.out.println(Optional.ofNullable(high == none));
        System.out.println(high == none);
        System.out.println(none == none);
        System.out.println(high ==high1);
//        System.out.println(high == Gender.MALE);
        System.out.println(high.equals(high1));
        System.out.println(high.equals(none));
//        System.out.println(high.equals(Gender.MALE));
//        System.out.println(high.equals(Gender.MALE));
//        System.out.println(none.equals(high));

        System.out.println("РАЗ");
        System.out.println(Gender.MALE);
        System.out.println("Два");
        System.out.println(Gender.FEMALE);
        System.out.println("Три");
        System.out.println(Gender.MALE);
        System.out.println("Четырк");

        Init init;
        init = Init.INIT;

        System.out.println(high.compareTo(high1));
        System.out.println(high.compareTo(Optional.ofNullable(none).get()));



    }
}
