package com.company;

public class ScopeCheck {
    public int publicVar=0;
    public int var1=1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created,publicVar = " + publicVar + ": privateVar= " + var1);
    }

    public int getVar1() {
        return var1;
    }
    public void timesTwo(){
        int var2=2;
        for(int i=0;i<10;i++){
            System.out.println(i + " times two is " + i*var2);
        }
    }
    public void useInner(){
        InnerClass innerClass= new InnerClass();
        System.out.println("VarThree from outer class: " + innerClass.varThree);
    }
    public class InnerClass{
       private int varThree =3;

        public InnerClass() {
            System.out.println("InnerClass created, varOne is" + var1 + " and varThree is " + varThree);

        }
        public void timesTwo(){
            System.out.println("varOne is still available here" + var1);
            for(int i=0;i<10;i++){
                System.out.println(i + " times two is " + i* varThree);
            }
        }
    }
}
