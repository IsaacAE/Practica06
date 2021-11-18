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
    //Pasamos al método un parámetro por valor (el valor de la variable x), por lo que cual se toma una "copia" del valor contenido en la variable x (este valor se almacena en un espacio de memoria distinto)
     public static double cuadrado(double x){
	 //Asignamos al parámetro el valor de multiplicarse por sí mismo
	x=x*x;
	//Regresamos el valor de x, al estar contenido en otro espacio de memoria, no se afecta el valor original de la variable x dentro del método main
	return x;

    }
 /**
 *Método que calcula la potencia 2 de un número
 *@author Alcántara Estrada Kevin Isaac
 *@version 1.0
 *@param n Objeto de la clase Num
 *@return double Devuelve el valor del atributo "valor" del objeto de la clase Num
 */
    //En este caso pasamos al método un parámetro por referencia, la referencia corresponde al espacio de memoria donde se encuentra almacenado el objeto
     public static double potencia2(Num n){
	 //Se le asigna el valor de multiplicarse por sí mismo al atributo "valor" del objeto de la clase Num, (este valor se guarda en el mismo espacio de memoria que donde estaba el valor original del atributo "valor" del objeto de la clase)
	 n.setValor((n.getValor()*n.getValor()));
	 //Se regresa el valor del atributo "valor" del objeto de la clase, como trabajamos con la referencia del objeto, este valor que devolvemos también estará presente en el valor del atributo "valor" del objeto de la clase dentro del método main
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
	  System.out.println("/nAhora el valor de la variable que pasamos como parámetro por valor es de: "+ x);

	 
     }

   
}
