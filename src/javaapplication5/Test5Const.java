package javaapplication5;

public class Test5Const {

    public static void main(String[] args) {
        
        final double TE_CONST = 5.5; // constant
        
        double x = 1.222;
        
        double f = Math.pow(x, TE_CONST);
        
        System.out.println("Special number is: " + f);
        
        
        double y = 4.5;
        
        y += 15;    // y = y + 15;
        
        // +=   -=  *=  /=  
        
        System.out.println("Value of 'y' is: " + y );
        
        
        int z = 777;
        int w = z % 10;
        
        System.out.println("Modul of " + z + " when divided by 10 is: " + w);
        
        
//        int b = 123;
//        b %= 10;
//        
//        System.out.println("Result: " + b);

        int a = 1;
        
        a++;    // =2
        a++;    // =3
        
        a--;    // =2
        a--;    // =1
        
        System.out.println(a);
        
        int b = 1;
        
        ++b;    // =2
        ++b;    // =3
        
        --b;    // =2
        --b;    // -1
        
        System.out.println(b);
    }
    
}
