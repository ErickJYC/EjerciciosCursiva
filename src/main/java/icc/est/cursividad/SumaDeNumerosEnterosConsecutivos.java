package icc.est.cursividad;

public class SumaDeNumerosEnterosConsecutivos {
    public int sumadDeNumerosConsecutivos(int numero){
        if (numero == 0){
            System.out.print(numero);
            return 0;
        }else {
            System.out.print(numero+"+");
            return numero + sumadDeNumerosConsecutivos(numero-1);

        }
    }
}
