
package logic;

/**
 *
 * @author edwim donaire
 */
public class Ejercicios_Semana2_PracticasEnClases {

    public Ejercicios_Semana2_PracticasEnClases() {
    }
    
    public void quiz2A(){
        
    }
    public void quiz2B( int n){
        
        for (int i =1 ; i<= n ; i++){
            
            for (int j =1 ; j<=(n-i) ; j++) {
        System.out.print(" ");
    }
            for (int k =1 ; k<=(2*i-1) ;k++ ) {
                System.out.print("*");
            }
                System.out.println(" ");
        }
        
    }//end metodo
    
    public void ejercicioA( int n){
        
        for (int i =1 ; i<= n ; i++){
            
            for (int j =1 ; j<=(n-i) ; j++) {
        System.out.print("*");
    }
            for (int k =1 ; k<=(2*n) ;k++ ) {
                System.out.println("*");
                for (int m = 1; m >= n ; m++) {
             
                System.out.print(" ");
                for (int l = 1; m >= n ; l++) {
            }
            
            }
                System.out.println("*");
        }
       
    }
    
    }
    
public void imprimirCuadroDinamico(int n) {
    for (int i = 0; i < n; i++) {           
        for (int j = 0; j < 2 * n - 1; j++) { 
            
            if (i == 0 || i == n - 1 || j == 0 || j == 2 * n - 2 || (i == n / 2 && j == (2 * n - 2) / 2)) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            System.out.print(" "); 
        }
        System.out.println(); 
    }
}

}