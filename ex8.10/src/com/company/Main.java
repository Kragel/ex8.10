/* Create a base class with two methods. In the first method, call the
second method. Inherit a class and override the second method. Create an object of the
derived class, upcast it to the base type, and call the first method. Explain what happens. */
package com.company;

public class Main {

    public static void main(String[] args) {
        B b = new B();
        // automatic upgrade to base-class to call base-class method A.f()
        // which,by polymorphism, will call the derived-class method B.g():
        b.f();
    }
}
