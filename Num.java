/**
 *Clase Num que simula un número en el conjunto de los número reales
 *@author Alcántara Estrada Kevin Isaac
 *@version 1.2
 */
public class Num{
    //Atributo que representa el tipo de número (Natural, Entero, Racional...)
    private String tipo;
    //Atributo que representa el valor del número 
    private double valor;
/**
 *Método constructor sin parámetros que cre un objeto de la clase Num con valores de sus atributos previamente establecidos por el autor
 *@author Alcántara Estrada Kevin Isaac
 *@version 1.0
 */
    public Num(){
	tipo = "Entero";
	valor = 8;

    }
   
/**
 *Método para obtener el valor del atributo "tipo" de un objeto de la clase Num
 *@author Alcántara Estrada Kevin Isaac
 *@version 1.0
 *@return String tipo
 */
    public String getTipo(){

	return this.tipo;
    }
/**
 *Método para modificar el valor del atributo "tipo" de un objeto de la clase Num
 *@author Alcántara Estrada Kevin Isaac
 *@version 1.0
 *@param tipo Parámetro que representa el tipo de número que es el objeto de la clase
 */
    public void setTipo(String tipo){
	this.tipo = tipo;
    }
/**
 *Método para obtener el valor del atributo "valor" de un objeto de la clase Num
 *@author Alcántara Estrada Kevin Isaac
 *@version 1.0
 *@return String valor
 */
     public double getValor(){

	return this.valor;
    }
/**
 *Método para modificar el valor del atributo "valor" de un objeto de la clase Num
 *@author Alcántara Estrada Kevin Isaac
 *@version 1.0
 *@param valor Parámetro que representa el valor del número del objeto de la clase
 */
    public void setValor(double valor){
	this.valor = valor;
    }

}
