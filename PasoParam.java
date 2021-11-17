/**
 *Clase para ver cómo funciona pasar parámetros por valor y por referencia
 *@author Alcántara Estrada Kevin Isaac
 *@version 1.2
 */

public class PasoParam{
    /**
 *Método que convierte una cantidad de grados centigrados a grados Farenheit
 *@author Alcántara Estrada Kevin Isaac
 *@version 1.0
 *@param centigrados Cantidad de grados centigrados
 *@return double centigrados 
 */
    //Pasamos al método un parámetro por valor (el valor de la variable centigrados)
     public static double centigradosAFarenheit(double centigrados){
	 //Asignamos al parámetro el valor de 100
	centigrados=100;
	//Regresamos el valor de centigrados tras usar la fórmula para convertirlos a fahrenheit
	return centigrados*1.8+32;

    }
 /**
 *Método que convierte una cantidad de grados centigrados a grados Farenheit
 *@author Alcántara Estrada Kevin Isaac
 *@version 1.0
 *@param Grados Objeto de la clase Grados
 *@return double centigrados 
 */
    //En este caso pasamos al método un parámetro por referencia, la referencia corresponde al espacio de memoria donde se encuentra almacenado el objeto
     public static double gradosAFarenheit(Grados c){
	 //Se le asigna el valor de 100 al atributo "cantidad" del objeto de la clase Grados
	 c.setCantidad(100);
	 //Se regresa el valor de la cantidad de grados en el objeto tras usar la fórmula para convertirlos a Farenheit
	 return c.getCantidad()*1.8+32;

    }
   

      /**
 *Método main para ver la diferencia entre paso de parámetros por valor y paso de parámetros por referencia
 *@author Alcántara Estrada Kevin Isaac
 *@version 1.0
 *@param centigrados Cantidad de grados centigrados
 *@return double centigrados 
 */
    public static void main(String[] args){
	//Se crea un nuevo objeto de la clase Grados para su uso
	Grados c = new Grados();
	//Se declara una variable de tipo double para trabajar con esta
	 double centigrados = 50;
	 //Paso de parámetros por valor
	 System.out.println("---PASO DE PARÁMETRO POR VALOR--- \n");
	 //Se muestra el valor del parámetro antes de trabajar con este
	 System.out.println("El valor del parámetro que pasamos por valor actualmente es de: " + centigrados);
	 //Se muestra el resultado de trabajar con el parámetro
	 System.out.println("El valor que se obtiene de trabajar con dicho parámetro es de: " + centigradosAFarenheit(centigrados));
	 //Se muestra el valor del parámetro después de haber trabajado con este 
	 System.out.println("Ahora el valor del parámetro que pasamos al método es de: "+ centigrados);
	  //Paso de parámetros por referencia
	 	 System.out.println("\n---PASO DE PARÁMETRO POR REFERENCIA---");
		  //Se muestra el valor del parámetro antes de trabajar con este
	 System.out.println("\nEl valor del parámetro que pasamos por referencia  es de: " + c.getCantidad());
	 //Se muestra el resultado de trabajar con el parámetro
	 System.out.println("El valor que se obtiene de trabajar con dicho parámetro es de: " + gradosAFarenheit(c));
	 	 //Se muestra el valor del parámetro después de haber trabajado con este
	 System.out.println("Ahora valor del parámetro que habíamos pasado referencia  es de: " +c.getCantidad());
     }

   
}
