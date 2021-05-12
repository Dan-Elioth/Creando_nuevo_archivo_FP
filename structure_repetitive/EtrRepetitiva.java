import java.util.Scanner;

/**
 * EtrRepetitiva
 */
public class EtrRepetitiva {

    static Scanner teclado=new Scanner(System.in);

    public static void suma10NumerosMientras() {
        //Declarar variables
        int contador=1;
        double numeros, sumaNumeros=0;
        //Datos de entrada y proceso
        while (contador<=10) {
            System.out.println("Ingrese el valor en la posición"+contador+":");
            numeros=teclado.nextDouble();
            sumaNumeros=sumaNumeros+numeros;
            contador++;
            
        }
        System.out.println("La suma de los 1o numeros es:"+sumaNumeros);

    }


    public static void suma10NumeroshacerMientras() {
        //Declarar variables
        int contador=1;
        double numeros, sumaNumeros=0;
        //Datos de entrada y proceso
        do{
            System.out.println("Ingrese el valor en la posición"+contador+":");
            numeros=teclado.nextDouble();
            sumaNumeros=sumaNumeros+numeros;
            contador++;
        }

        while (contador<=10);
        System.out.println("La suma de los 1o numeros es:"+sumaNumeros);

    }
    public static void suma10Numerospara() {
        //Declarar variables
        double numeros, sumaNumeros=0;
        //Datos de entrada y proceso
        for(int contador=1; contador<=10; contador++){
            System.out.println("Ingrese el valor en la posición"+contador+":");
            numeros=teclado.nextDouble();
            sumaNumeros=sumaNumeros+numeros;

        }

        System.out.println("La suma de los 1o numeros es:"+sumaNumeros);
    }
    public static void main(String[] args) {
        System.out.println("Hola mundito!!"); 
        //suma10NumerosMientras();
        //suma10NumeroshacerMientras();
        suma10Numerospara();

    }
}