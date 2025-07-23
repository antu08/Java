
/**
 * Write a description of class UseComplex here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class UseComplex
{
    static Complex retGreater(Complex m,Complex n)
    {
        if (m.a >= n.a && m.b>= n.b)
        {
            return m;
        }
        else if(n.a >= m.a && n.b >= m.b)
        {
            return n;
        }
        else
        {
            return null;
        }
    }
    public static void main(String[] args)
    {
        Complex c1 = new Complex();
        c1.display();
        
        Complex c2 = new Complex(4,5);
        c2.display();
        
        Complex c3 = new Complex(c1);
        c3.display();
        
        Complex c4 = c1.addWith(c2);
        c4.negate();
        c4.display();
        
        Complex larger = retGreater(c1,c2);
        larger.display();
        
        Complex c5 = c1.multiply(c2);
        c5.display();
        
        Complex c6 = c1.division(c2);
        c6.display();
    }
}
