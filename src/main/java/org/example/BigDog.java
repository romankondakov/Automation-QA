package org.example;

public class BigDog extends Dog {

    public BigDog(String name) {
        super(name);
    }

    void greets() {
        System.out.println("Woow");
    }

    void greets(Dog another) {
        System.out.println("Dog "+ another.getName()+"Wooooof");
    }

    void greets(BigDog another){
        System.out.println("Dog "+ another.getName()+" Wooooooooof");
    }
}



