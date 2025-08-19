
package logic;

/**
 *
 * @author edwim
 */
public class Ejercicios {
    
    public Ejercicios() {
    }
    

    public boolean capicua(int n) {
        
        int numOriginal = 0;
        int numInvertido = 0;
        int digito = 0;
        while (n > 0) {
            digito = n % 10;
            numInvertido = (numInvertido * 10) + digito;
            n = n / 10;
        }

        if (numInvertido == numOriginal) {

        }
     return true;

    
     
       
    }
public void sunNum(int n){
     int numOriginal = n;
        int numSumado = 0;
        int digito = 0;
        while (n > 0) {
            digito = n % 10;
            numSumado = numSumado + digito;
            n = n / 10;
        }
        System.out.println("La suma de los digitos sumados: " +numOriginal+ "Es: " + numSumado);
}

}
    

