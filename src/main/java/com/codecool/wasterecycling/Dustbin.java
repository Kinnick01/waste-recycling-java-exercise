package com.codecool.wasterecycling;

import java.util.ArrayList;
import java.util.List;

public class Dustbin {
        private final String color;
        protected List<Garbage> garbageList;

        public Dustbin(String color) {
                this.color = color;
                this.garbageList = new ArrayList<>();
        }

        public String getColor() {
                return color;
        }


        public void throwOutGarbage(Garbage garbage)/* throws DustbinContentException*/ {
               garbageList.add(garbage);
        }

        public int getHouseWasteCount() {
               return (int) garbageList.stream().filter(garbage -> garbage instanceof Garbage).count();}

        ;

        public int getPaperCount() {
               return (int) garbageList.stream().filter(garbage -> garbage instanceof PaperGarbage).count();}

        ;


        public int getPlasticCount() {
                return (int) garbageList.stream().filter(garbage -> garbage instanceof PlasticGarbage).count();}

        ;

        public void emptyContents() {
             garbageList.removeAll(garbageList);
        }

        ;


        @Override
        public String toString() {
                return getColor() + "Dustbin" + "House waste content:" + getHouseWasteCount() + "item(s)" +
                        " Paper content:"+ getPaperCount()+ "item(s)" +
                        " plastic content:" + getPlasticCount();
        }

        public void displayContent() {
                System.out.println(this);
        }

}
