
package libreria;

import java.time.LocalDate;

public class Revista extends Libreria{

	protected String editor;
	
	
	public Revista(String titulo, String editor, int codigo,int precioCompra,LocalDate fechaDePublicacion, boolean fisico) {
		super(titulo,codigo,precioCompra, fechaDePublicacion, fisico);
		this.editor = editor;				
	}
		
	public String getEditor() {
		return this.editor;
	}
	public void setEditor(String editor) {
		this.editor = editor;
	}

	public double getPrecioDeVenta() {
		if (fisico==true) {
		return super.precioCompra + (super.precioCompra*22/100);
	}else {
		return super.precioCompra + (super.precioCompra*12/100);
		}
	}


}