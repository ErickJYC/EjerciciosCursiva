package icc.est.cursividad;

public class SumaDeNumerosEnterosConsecutivos {
    public int llamadasRecursivas = 1;
    public int sumadDeNumerosConsecutivos(int numero){
        int idActual = llamadasRecursivas++;

        System.out.println("Llamada a "+ idActual +
                            " con numero = " + numero);

        if (numero == 1){
            System.out.println(" Llamada a " + idActual +
                                " caso base alcanzado n=1 ");
            System.out.println(numero);
            return 1;
        }else {
            //System.out.print(numero+"+");
            //return numero + sumadDeNumerosConsecutivos(numero-1);
            System.out.println(" Lamada a " + idActual +
                                " Llamado recursivamente  con n= " + (numero-1));
            int resultadoParcial = sumadDeNumerosConsecutivos(numero-1);
            int resultado = numero + resultadoParcial;
            System.out.println(" Llamado " + idActual + " suamndo " + numero +
                                " al resultado de "+ resultadoParcial + " = " + resultado);
            System.out.println(" Lamada a " + idActual + " Retorno " + resultado);
            return resultado;


        }


    }

}
