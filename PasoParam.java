/**
 *Clase para ver cómo funciona pasar parámetros por valor y por referencia
 *@author Alcántara Estrada Kevin Isaac
 *@version 1.2
 */

public class PasoParam{
    /**
 *Método que sirve para calcular la potencia 2 de un número
 *@author Alcántara Estrada Kevin Isaac
 *@version 1.0
 *@param x Valor de tipo double que representa el valor de un número real
 *@return double x
 */
    //Pasamos al método un parámetro por valor (el valor de la variable centigrados)
     public static double cuadrado(double x){
	 //Asignamos al parámetro el valor de 100
	x=x*x;
	//Regresamos el valor de centigrados tras usar la fórmula para convertirlos a fahrenheit
	return x;

    }
 /**
 *Método que convierte una cantidad de grados centigrados a grados Farenheit
 *@author Alcántara Estrada Kevin Isaac
 *@version 1.0
 *@param Grados Objeto de la clase Grados
 *@return double centigrados 
 */
    //En este caso pasamos al método un parámetro por referencia, la referencia corresponde al espacio de memoria donde se encuentra almacenado el objeto
     public static double potencia2(Num n){
	 //Se le asigna el valor de 100 al atributo "cantidad" del objeto de la clase Grados
	 n.setValor((n.getValor()*n.getValor()));
	 //Se regresa el valor de la cantidad de grados en el objeto tras usar la fórmula para convertirlos a Farenheit
	 return n.getValor();

    }
   

      /**
 *Método main para ver la diferencia entre paso de parámetros por valor y paso de parámetros por referencia
 *@author Alcántara Estrada Kevin Isaac
 *@version 1.0
 *@param args 
 */
    public static void main(String[] args){
	//Se crea un nuevo objeto de la clase Num para su uso
	Num n = new Num();
	//Se declara una variable de tipo double para trabajar con esta
	 double x = 8;
	 //Paso de parámetros por valor
	 System.out.println("---PASO DE PARÁMETRO POR VALOR--- \n");
	 //Se muestra el valor del parámetro antes de trabajar con este
	 System.out.println("El valor del parámetro que pasamos por valor actualmente es de: " + x);
	 //Se muestra el resultado de trabajar con el parámetro
	 System.out.println("El valor que se obtiene de trabajar con dicho parámetro es de: " + cuadrado(x));
	 //Se muestra el valor del parámetro después de haber trabajado con este 
	 System.out.println("Ahora el valor del parámetro que pasamos al método es de: "+ x);
	  //Paso de parámetros por referencia
	 	 System.out.println("\n---PASO DE PARÁMETRO POR REFERENCIA---");
		  //Se muestra el valor del parámetro antes de trabajar con este
	 System.out.println("\nEl valor del parámetro que pasamos por referencia  es de: " + n.getValor());
	 //Se muestra el resultado de trabajar con el parámetro
	 System.out.println("El valor que se obtiene de trabajar con dicho parámetro es de: " + potencia2(n));
	 	 //Se muestra el valor del parámetro después de haber trabajado con este
	 System.out.println("Ahora valor del parámetro que habíamos pasado referencia  es de: " +n.getValor());
	 //Se muestra cómo se hace para que se modifique el valor original de la variable que pasamos como parámetro por valor
	  System.out.println("\n---MODIFICAR EL VALOR DEL PARÁMETRO POR PASO DE VALOR--- \n");
	   //Se muestra cómo se hace para que se modifique el valor original de la variable que pasamos como parámetro por valor
	  System.out.println("Para que el parámetro que pasamos por valor sea modificado, debemos asignar el valor que devuelve el método en donde lo implementamos a la variable que pasamos como parámetro, es decir: x=cuadrado(x);");
	  //Asignamos a la variable centigrados el valor que devuelve el método
	  x=cuadrado(x);
	   //Se muestra el nuevo valor del parámetro
	  System.out.println("Ahora el valor de la variabla que pasamos como parámetro por valor es de: "+ x);

	 
     }

   
}
