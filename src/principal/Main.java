
package principal;

//Principal
public class Main {
    
    public static void main(String[] args) {
        Numero numero = new Numero(); //Instancia de la clase Numero
        for (int i = 1; i <= 100 ; i++){ //Ciclo para imprimir los números del 1 al 100
            if (numero.esMultiploAmbos(i)){ //Llamada al metodo multiplo ambos
                System.out.println("FizzBuzz");
            }else if (numero.multiploDeTres(i)){ //Llamada al metodo multiplo de 3
                System.out.println("Fizz");
            }else if (numero.multiploDeCinco(i)){ //Llamada al metodo multiplo de 5
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }
}
