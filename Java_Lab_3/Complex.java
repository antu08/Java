
/**
 * Write a description of class complex here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

class Complex
{
    double a;
    double b;
    
    Complex()
    {
        a = 1;
        b = 1;
    }
    Complex(double c)
    {
        a = c;
        b = 0;
    }
      Complex(double a, double d)
    {
        this.a = a;
        b = d;
    }
    Complex(Complex c)
    {
        this.a = c.a;
        this.b = c.b;
    }
    
    Complex  addWith(Complex oth)
    {
        double re;
        double im;
        re = this.a+oth.a;
        im = this.b+oth.b;
        
        Complex c2 =new Complex(re, im);
        return c2;
    }
    void display()
    {
        System.out.println(a + "+i" + b);
    }
    void negate()
    {
        this.b = -this.b;
    }
    
    Complex multiply(Complex c1)
    {
        double re;
        double im;
        
        re = (this.a * c1.a - this.b * c1.b);
        im = (this.a * c1.b + this.b * c1.a);
        
        Complex c5 = new Complex(re, im);
        return c5;
    }
    
    Complex division(Complex c1)
    {
        double re;
        double im;
        
        re = (this.a*c1.a+this.b*c1.b)/(c1.a*c1.a+c1.b*c1.b);
        im = (this.b*c1.a-this.a*c1.b)/(c1.a*c1.a+c1.b*c1.b);
        
        Complex c6 = new Complex(re, im);
        return c6;
    }
}