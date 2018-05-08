
package principal;

//Clase Numero
public class Numero {
    int numero;
    boolean respuesta;
    
    /*
    * Metodo que retorna verdadero si el número es multiplo de 3,
    * de lo contrario retorna falso
    */
    public boolean multiploDeTres(int numero){
        if (numero % 3 == 0){
            respuesta = true;
        }else{
            respuesta = false;
        }
        return respuesta;
    }
    
    /*
    * Metodo que retorna verdadero si el número es multiplo de 5,
    * de lo contrario retorna falso
    */
    public boolean multiploDeCinco(int numero){
        if (numero % 5 == 0){
            respuesta = true;
        }else{
            respuesta = false;
        }
        return respuesta;
    }
    
    /*
    * Metodo que retorna verdadero si el número es multiplo de 3 y de 5,
    * de lo contrario retorna falso
    */
    public boolean esMultiploAmbos(int numero){
        if (numero % 3 == 0 && numero % 5 == 0){
            respuesta = true;
        }else{
            respuesta = false;
        }
        return respuesta;
    }
}
