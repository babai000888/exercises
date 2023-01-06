package edu.ex1_enum;

enum Abstract {
    C1 {/* ww w. ja va2  s .c  om*/
        // Body of constant C1
        public int getValue() {
            return 100;
        }
    },
    C2 {
        // Body of constant C2
        public int getValue() {
            return 10;
        }
    },
    C3 {
        // Body of constant C3
        public int getValue() {
            return 0;
        }
    };

    // Provide default implementation for getValue() method
    public abstract int getValue();
}
