//********************************************************************
//  RationalNumber.java       Java Foundations
//
//  Represents one rational number with a numerator and denominator.
//********************************************************************


public class RationalNumber implements Comparable{
    private int numerator, denominator;
    private float numerator1,denominator1;
    private RationalNumber Ratnum1;
    private RationalNumber Ratnum2;
    //-----------------------------------------------------------------
    //  Constructor: Sets up the rational number by ensuring a nonzero
    //  denominator and making only the numerator signed.
    //-----------------------------------------------------------------
    public RationalNumber(int numer, int denom)
    {
        if (denom == 0)//if the denominator is 0 then the denominator will be 1
            denom = 1;

        // Make the numerator "store" the sign
        if (denom < 0)//if denominator is less than zero the denominator and numerator are turned to positive numbers(-1)
        {
            numer = numer * -1;
            denom = denom * -1;
        }

        numerator = numer;
        denominator = denom;

        reduce();
    }
    
    //-----------------------------------------------------------------
    //  PREFERRED Constructor: Sets up the rational number by ensuring a nonzero
    //  denominator and making only the numerator signed.
    //-----------------------------------------------------------------
    public RationalNumber(float numer, float denom)
    {
        if (denom == 0)//if the denominator is 0 then the denominator will be 1
            denom = 1;

        // Make the numerator "store" the sign
        if (denom < 0)//if denominator is less than zero the denominator and numerator are turned to positive numbers(-1)
        {
            numer = numer * -1;
            denom = denom * -1;
        }

        numerator1 = numer;
        denominator1 = denom;

        reduce();
    }
    