/**
 *Clase para ver cómo funciona pasar parámetros por valor y por referencia
 *@author Alcántara Estrada Kevin Isaac
 *@version 2
 */

public class PasoParam{
    /**
 *Método que sirve para calcular la potencia 2 de un número
 *@author Alcántara Estrada Kevin Isaac
 *@version 1.0
 *@param x Valor de tipo double que representa el valor de un número real
 */
    //Pasamos al método un parámetro por valor (el valor de la variable x), por lo que cual se toma una "copia" del valor contenido en la variable x (este valor se almacena en un espacio de memoria distinto)
     public static void pasoParamValor(double x){
	 //Asignamos al parámetro el valor de multiplicarse por sí mismo
	x=x*x;
    }
    
     /**
 *Método que sirve para calcular la potencia 2 de un número
 *@author Alcántara Estrada Kevin Isaac
 *@version 1.0
 *@param x Valor de tipo double que representa el valor de un número real
 *@return double x
 */
    //Este método funciona de manera similar al método "pasoParamValor", pero este devuelve el valor del parámetro que recibió tras pasar por las operaciones que realiza el método, de esta manera podemos usarlo para modificar el valor del parámetro que le pasamos al método modifPasoParamValor  dentro del método main
     public static double modifPasoParamValor(double x){
	 //Asignamos al parámetro el valor de multiplicarse por sí mismo
	x=x*x;
	return x;
    }
    
 /**
 *Método que calcula la potencia 2 de un número
 *@author Alcántara Estrada Kevin Isaac
 *@version 1.0
 *@param n Objeto de la clase Num
 */
    //En este caso pasamos al método un parámetro por referencia, la referencia corresponde al espacio de memoria donde se encuentra almacenado el objeto
     public static void  pasoParamRef(Num n){
	 //Se le asigna el valor de multiplicarse por sí mismo al atributo "valor" del objeto de la clase Num, (este valor se guarda en el mismo espacio de memoria que donde estaba el valor original del atributo "valor" del objeto de la clase)
	 n.setValor((n.getValor()*n.getValor()));

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
	 //Se muestra en pantalla que se hace el paso de parámetro por valor
	 
	 	 System.out.println("\n---Se hace el paso de parámetro por valor al método 'pasoParamValor' donde el parámetro es el valor de la variable---\n");
		 //Se realiza el paso de parámetro por valor
		  pasoParamValor(x);
	 //Se muestra el valor del parámetro después de haber trabajado con este
	
	 System.out.println("Ahora el valor del parámetro que pasamos al método es de: "+ x);
	  //Paso de parámetros por referencia
	 	 System.out.println("\n---PASO DE PARÁMETRO POR REFERENCIA---");
		  //Se muestra el valor del parámetro antes de trabajar con este
	 System.out.println("\nEl valor del parámetro que pasamos por referencia  es de: " + n.getValor());
	 //Se muestra en pantalla que se hace el paso de parámetro por referencia
	  System.out.println("\n---Se efectua el paso de parámetro por referencia al método 'pasoParamRef' donde el parámetro es un objeto de la clase Num y se trabajará con el valor de uno de sus atributos (el atributo valor)---\n");
	 	 //Se realiza el paso de parámetro por referencia
	  pasoParamRef(n);
	 System.out.println("Ahora valor del parámetro que habíamos pasado referencia  es de: " +n.getValor());
	 //Se muestra cómo se hace para que se modifique el valor original de la variable que pasamos como parámetro por valor
	  System.out.println("\n---MODIFICAR EL VALOR DEL PARÁMETRO QUE USAMOS EN EL PASO DE PARÁMETRO POR VALOR--- \n");
	   //Se muestra cómo se hace para que se modifique el valor original de la variable que pasamos como parámetro por valor
	  System.out.println("Para que el parámetro que pasamos por valor sea modificado, debemos asignar el valor que devuelve el método en donde lo implementamos a la variable que pasamos como parámetro, es decir: x=modifPasoParamValor(x);");
	  //Para esto, dicho método debe devolver un valor del mismo tipo de dato que la variable a la cual queremos asignar el valor que regresa el método, es decir, para esta caso particular el método debe tener un return x tal que x es double");
	  //Asignamos a la variable x el valor que devuelve el método modifPasoParamValor para que la modificación del valor de x hecha dentro del método se vea también refeljada en el método main
	   x=modifPasoParamValor(x);
	   //Se muestra el nuevo valor del parámetro
	  System.out.println("\nAhora el valor de la variable que pasamos como parámetro por valor es de: "+ x);

	 
     }

   
}
