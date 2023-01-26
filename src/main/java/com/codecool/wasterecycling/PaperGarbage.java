package com.codecool.wasterecycling;

public class PaperGarbage extends Garbage {

        protected boolean isSqueezable;


        public PaperGarbage(String name, boolean isSqueezable) {
                super(name);
                this.isSqueezable = isSqueezable;
        }

        public String getPaperName() {
                return getName();
        }

        public boolean isSqueezed() {
                return isSqueezable;
        }

        public boolean squeez() {
                if (isSqueezable = false) {
                        return isSqueezable = true;
                }
                return isSqueezable;
        }
}
