package edu.ex1_enum;

enum MyEnum {
    C1 {//from ww w .j  a v a2s  .co m
        // Body of constant C1
        public int getValue(int c) {
            return 100 + c;
        }
    },
    C2, C3;

    // Provide the default implementation for the getValue() method
    public int getValue(int c) {
        return 100000 + c;
    }
}

