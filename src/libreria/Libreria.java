package libreria;

import java.time.LocalDate;

public abstract class Libreria {
	protected String titulo;
	protected double precioCompra;
	protected int codigo;
	protected LocalDate fechaDePublicacion;
	protected boolean fisico;

	
	//Se declara el constructor
	public Libreria(String titulo,int codigo,double precioCompra,LocalDate fechaDePublicacion,boolean fisico) {
		this.titulo = titulo;
		this.codigo = codigo;
		this.precioCompra = precioCompra;
		this.fechaDePublicacion=fechaDePublicacion;
		this.fisico=fisico;
	} 
	
	//Se declaran los Getters y Setters
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
 	
	public double getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public LocalDate getFechaDePublicacion() {
		return fechaDePublicacion;
	}


	public void setFechaDePublicacion(LocalDate fechaDePublicacion) {
		this.fechaDePublicacion = fechaDePublicacion;
	}


	public boolean isFisico() {
		return fisico;
	}


	public void setFisico(boolean fisico) {
		this.fisico = fisico;
	}


	public abstract double getPrecioDeVenta();
}
