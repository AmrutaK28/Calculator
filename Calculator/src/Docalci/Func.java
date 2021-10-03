/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Docalci;

public class Func {
    public static double add(double d1,double d2)
    {
        return d1+d2;
    }
    
    public static double sub(double d1,double d2)
    {
        return d1-d2;
    }
    
    public static double divs(double d1,double d2)
    {
        return d1/d2;
    }
    
    public static double multiply(double d1,double d2)
    {
        return d1*d2;
    }
    
    public static double perc(double d1,double d2)
    {
        return (double)d1*(d2/100);
    }
    
    public static double raised2(double d1)
    {
        return Math.pow(d1,2);
    }
    
    public static double raised3(double d1)
    {
        return Math.pow(d1,3);
    }
    
     public static double raised10(double d1)
    {
        return Math.pow(10,d1);
    }
     
     public static double raised(double d1,double d2)
    {
        return Math.pow(d1,d2);
    }
 
      public static double sinvalue(double d1)
    {
        return Math.sin(d1);
    }
      
     public static double cosvalue(double d1)
    {
        return Math.cos(d1);
    } 
     
      public static double tanvalue(double d1)
    {
        return Math.tan(d1);
    }
      
       public static double logarithm(double d1)
    {
        return Math.log10(d1);
    }

      public static double modulus(double d1,double d2)
    {
        return d1%d2;
    }  
    
        public static double squaroot(double d2)
    {
        return Math.sqrt(d2);
    } 
       public static double cuberoot(double d1)
    {
        return Math.cbrt(d1);
    } 
}





