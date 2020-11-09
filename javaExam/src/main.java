import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args){
        System.out.println("hello world");
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(1,3); // able to control where the index u put the element in
        a.add(5);
        System.out.println(a);


        //POLYMORPHISM
        Dog g = new Hound();
        g.bark();
        //unable to run as this is a method under Hound not dog
        //g.drool(1);
        g.drool(); //uses hounds method not dog
        //under Hound method
        //g.sniff();


        //SUBTYPE POLYMORPHISM

        A x = new B();
        x.f(1); //
        //x.g(1); cant run because x is of type class A
        x.h(1);
    }
    // AD HOC POLYMORPHISM
    // method that is chosen depends on what is the arguement's type passed in
    public void log(int x){
        System.out.println(String.valueOf(x));
    }

    public void log(String s){
        System.out.println(s);
    }
}
class Point2D{
    private double x;
    private double y;

    Point2D(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){return x;}
    public double getY(){return y;}
}

class Point3D extends Point2D{
    private double z;

    Point3D(double x, double y, double z){
        super(x,y);
        this.z = z;
    }
}

abstract class Dog{
    public void bark(){
        System.out.println("woof");
    }
    public void drool(){
        System.out.println("drool");
    }
}

class Hound extends Dog {
    public void sniff(){
        System.out.println("sniff ");
    }

    @Override
    public void bark() {
        System.out.println("growl");
    }

    public void drool(int time){
        System.out.print("drool"+ time);
    }
}

class A {
    void f(int x){System.out.println("Af");}
    void h(int x){System.out.println("Ah");}
}

class B extends  A {
    void f(int x){
        System.out.println("Bf");
    }
    void g(int x){
        System.out.println("Bg");
    }
}
