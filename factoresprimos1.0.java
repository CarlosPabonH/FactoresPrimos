package factoresprimos; 

import java.util.Scanner; 

public class factoresprimos{ 

    public static void main(String[] args){ 
        long numeroInicial, numero;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca el número que quiera factorizar: ");
        numeroInicial = teclado.nextLong(); 

        if (numeroInicial > 1) { 
            int factor = 2; 
            numero = numeroInicial; 
            System.out.println("Factores Primos"); 
            System.out.print(numero + " = " );
            while (numero > factor) {
                if (numero % factor == 0) {
                    numero /= factor; 
                    System.out.print(factor + " * ");    
                } else {
                    factor++; 
                }
            }
            System.out.println(factor);
        }
    }
}