public class Grados{

    private String tipo;
    private double cantidad;

    public Grados(){
	tipo = "Centigrados";
	cantidad = 50;

    }

    public String getTipo(){

	return this.tipo;
    }

    public void setTipo(String tipo){
	this.tipo = tipo;
    }

     public double getCantidad(){

	return this.cantidad;
    }

    public void setCantidad(double cantidad){
	this.cantidad = cantidad;
    }

}
