package org.day6training;

class FinalChildClass extends FinalClass {
}
public class FinalClassDemo {
public static void main(String[] args) {

FinalClass f1 = new FinalClass(); 
f1.show();
}
}
public class FinalMethodClassTest extends FinalMethodClass {
}
}
final class FinalClass {
void show() {
System.out.println("Final class cannot be inherited");
}
