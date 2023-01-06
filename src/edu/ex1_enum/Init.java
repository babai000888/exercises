package edu.ex1_enum;

public enum Init {
    INIT(30) {
        {
            System.out.println("блок INIT");
        }
        static {
            System.out.println(" статический блок INIT");
        }
    },
    TINI(50) {
        {
            System.out.println("блок TINI");
        }
        static {
            System.out.println(" статический блок TINI");
        }
    };

    Init(int i) {
        System.out.println("CONSTRUCTOR :" + this.name() + "  " + i);
    }
    {
        System.out.println("непонятный блок");
    }
    static {
        System.out.println("непонятный статический блок");
    }
}

