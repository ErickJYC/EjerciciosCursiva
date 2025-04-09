package icc.est.cursividad;

public class SumaDeDigitosDeUnNumero {
    public int sumaDeDigitosDeUnNumero(int numero){
        if (numero < 10){
            System.out.print(numero);
            return numero;
        }else {
            System.out.print(numero % 10 +"+");
            return (numero % 10)+ sumaDeDigitosDeUnNumero(numero/10);
        }
    }
}
