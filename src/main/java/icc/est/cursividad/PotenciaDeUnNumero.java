package icc.est.cursividad;

public class PotenciaDeUnNumero {
    public int PotenciaDeUnNumero(int base, int exponente){
        if (exponente == 0){
            return 1;
        }else {
            return base * PotenciaDeUnNumero(base,exponente-1);
        }
    }
}
