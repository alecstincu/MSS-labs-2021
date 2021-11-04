package com.unibuc.designpatterns.creational;

public class SingletonClass {

    private static SingletonClass reference;

    private SingletonClass() {
    }

    public synchronized static SingletonClass getReference() {
        if (reference == null) {
            reference = new SingletonClass();
        }

        return reference;
    }
}

class Main {
    public static void main(String[] args) {
//        System.out.println(new SingletonClass());
//        System.out.println(new SingletonClass());
//        System.out.println(SingletonClass.getReference());
//        System.out.println(SingletonClass.getReference());

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(SingletonClass.getReference());
            }
        });
        t1.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(SingletonClass.getReference());
            }
        });
        t2.start();
    }
}
