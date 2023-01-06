package edu.ex1_enum;

enum Level {
    LOW(30), MEDIUM(15), HIGH(7), URGENT(1);

    // Declare an instance variable
    private int myCustomeValue;

    // Declare a private constructor
    private Level(int c) {
        this.myCustomeValue = c;
    }//from   ww  w  .  j  a  v a  2 s  .  co m

    // Declare a public method to get the value
    public int getMyCustomeValue() {
        return myCustomeValue;
    }

    public void setMyCustomeValue (int c) {
        this.myCustomeValue = c;
    }

}
