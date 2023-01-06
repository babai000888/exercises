package edu.ex1_enum;

enum CommandList implements Command {
    RUN,
    JUMP {
        public void execute() {
            System.out.println(" Переропределил");
        }
    };

    @Override
    public void execute() {
        System.out.println("Команда: "+ super.name());
        System.out.println("Команда: "+ this.name());

    }
}
