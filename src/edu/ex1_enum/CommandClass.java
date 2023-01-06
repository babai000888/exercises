package edu.ex1_enum;

public class CommandClass extends Parent implements Command{

    public enum tt implements Command{
        ONE, TWO;

        @Override
        public void execute() {
            System.out.println(super.getClass());
            System.out.println(super.getDeclaringClass());
            System.out.println(super.name());


        }
    }
    private final int val = 1;
    @Override
    public void execute() {
        System.out.println(this.getClass());
        System.out.println(super.getClass());
        System.out.println(this.val);
        System.out.println(super.i);
    }
}
