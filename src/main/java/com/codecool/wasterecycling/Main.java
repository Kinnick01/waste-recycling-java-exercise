package com.codecool.wasterecycling;

public class Main {

        public static void main(String[] args) {
                Dustbin purpleDustbin = new Dustbin("pruple");
                Garbage garbage = new Garbage("green-apple");
                purpleDustbin.throwOutGarbage(garbage);
                PaperGarbage dirtypaper1 = new PaperGarbage("newspaper", false);
                if (!dirtypaper1.isSqueezed()) {
                        dirtypaper1.squeez();
                        purpleDustbin.throwOutGarbage(dirtypaper1);
                }
                purpleDustbin.displayContent();
        }
}
