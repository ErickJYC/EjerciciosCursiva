package icc.est.cursividad;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        boolean contunuar = true;
        Scanner scanner = new Scanner(System.in);


        while (contunuar) {
            System.out.println("selecione el metodo");
            System.out.println("1. Suma de numeros enteros consecutivos");
            System.out.println("2. Potencia de numeros");
            System.out.println("3. Suma de digitos de un numero");
            int metodo = scanner.nextInt();
            int numero = 0;
            int resultado = 0;
            if (metodo == 4) {
                contunuar = false;
                break;
            }
            switch (metodo) {
                case 1:
                    System.out.println("Suma de numeros enteros consecutivos");
                    SumaDeNumerosEnterosConsecutivos sumaDeNumerosEnterosConsecutivos = new SumaDeNumerosEnterosConsecutivos();
                    System.out.println("Ingrese el numero: ");
                    numero = scanner.nextInt();
                    resultado = sumaDeNumerosEnterosConsecutivos.sumadDeNumerosConsecutivos(numero);
                    System.out.println("="+resultado);

                    break;
                case 2:
                    System.out.println("Potencia de numeros");
                    PotenciaDeUnNumero potenciaDeUnNumero = new PotenciaDeUnNumero();
                    System.out.println("Ingrese la base");
                    int base = scanner.nextInt();
                    System.out.println("Ingrese el exponente");
                    int exponente = scanner.nextInt();
                    resultado = potenciaDeUnNumero.PotenciaDeUnNumero(base,exponente);
                    System.out.println(base + "^" + exponente + " = " + resultado);


                    break;
                case 3:
                    System.out.println("Suma de digitos de un numero");
                    SumaDeDigitosDeUnNumero sumaDeDigitosDeUnNumero = new SumaDeDigitosDeUnNumero();
                    System.out.println("Ingrese el numero");
                    numero = scanner.nextInt();
                    resultado = sumaDeDigitosDeUnNumero.sumaDeDigitosDeUnNumero(numero);
                    System.out.println(" = "+ resultado);

                    break;


                default:
                    System.out.println("Opcion Incorrecta");
            }
        }
    }
}

