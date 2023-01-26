package com.codecool.wasterecycling;

public class PlasticGarbage extends Garbage {
        public PlasticGarbage(String name) {
                super(name);
        }
        protected boolean isCleanFlag;

        public boolean isClean(boolean isCleanFlag){
                return isCleanFlag;
        }
        public boolean clean() {
               if (isCleanFlag = false){
                       return isCleanFlag = true;
               }
               return isCleanFlag;
        }
        public String getPlasticName(){
                return getName();
        }
}
