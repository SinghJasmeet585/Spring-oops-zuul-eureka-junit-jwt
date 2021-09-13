package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        //Parivahan parivahan = new Parivahan();
        // cannot create an oject

        TamilNadu tamilNaduRto = new TamilNadu();
        tamilNaduRto.photoIdentity();
        System.out.println("Registration fee = " + tamilNaduRto.feeForRegistration);

        KeralaRto keralaRto = new KeralaRto();
        keralaRto.photoIdentity();
        System.out.println("Registration fee = " + keralaRto.feeForRegistration);

        /*
        Parivahan tamilNadu = new TamilNadu();
        tamilNadu.photoIdentity();

        Parivahan kerala = new KeralaRto();
        kerala.photoIdentity();
         */

       // Calculator calculator = new Calculator();
        Student student = new Student();
        System.out.println(student.addition(10,20));
        System.out.println(student.subtraction(20,10));
        System.out.println(student.multiplication(10,20));
        System.out.println(student.division(20,10));

    }
}
