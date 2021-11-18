public class Num{

    private String tipo;
    private double cantidad;

    public Num(){
	tipo = "Real";
	cantidad = 8;

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
