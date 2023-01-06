package edu.ex1_enum;

enum Gender {
    MALE {
        @Override
        public int get(int c) {
            System.out.println(" Я MAL~e");
            return 0;
        }
        {
            System.out.println(" Я MAL~e");

        }
    },
    FEMALE {
        public int get(int c) {
            System.out.println("Я FEMALE");
            return c;
        }
        {
            System.out.println("Я FEMALE");

        }
    };
    public abstract int get(int c);
}
