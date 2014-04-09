package myjava.npp.homework.march2814;

import java.lang.Math;


/**
 * Created by teren_000 on 28.03.14.
 */



public class MyComplex implements ComplexActions, ComplexMath, TrigonometricForm
{
    private double a;
    private double b;


    public MyComplex ()
    {
        a=0;
        b=0;
    }

    public MyComplex (double a, double b)
    {
        this.a=a;
        this.b=b;
    }

    public void setA (double a)
    {
        this.a=a;
    }

    public double getA ()
    {
        return a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getB(){
        return b;
    }

    public String toString ()
    {
        String result = "";
        result+=a;
        if (b>0)
        {
            result+="+";
        }

        result+=b+"i";

        return result;
    }

    public boolean Equals (MyComplex complex)
    {
        if (a==complex.a && b==complex.b)
            return true;
        return false;
    }

    public void conjugate ()
    {
        b=-b;
    }

    public double getModule ()
    {
        return Math.sqrt(a*a+b*b);
    }

    public double getArg()
    {
        return Math.atan(b/a);
    }

    public void sum(MyComplex complex)
    {
        a+=complex.a;
        b+=complex.b;
    }

    public void difference (MyComplex complex)
    {
        a-=complex.a;
        b-=complex.b;
    }

    public void productOnNumber(double number)
    {
        a*=number;
        b*=number;
    }
}
