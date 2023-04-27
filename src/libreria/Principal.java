
package libreria;
import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		LocalDate fecha = LocalDate.now();
		
		Libro l1= new Libro("Caperusita Roja","autor anonimo","Quiero",123,310,fecha,false);
		Libro l2= new Libro("Rebelion en la granja","El Rusito","pasear",123,255,fecha,false);
		Libro l3= new Libro("Lord of The Ring","Tolkien","por",123,220,fecha,false);
		Libro l4= new Libro("Harry Potter","JK Rowling","la",123,120,fecha,true);
		Libro l5= new Libro("Manual de la ciencia politica","Miquel caminal Badia","montaña",123,200,fecha,true);
		
		Revista r1= new Revista("Gente","Marquitos",123,134,fecha,true);
		Revista r2= new Revista("Barcelona","Pepe",123,134,fecha,true);
		Revista r3= new Revista("Hombres","Alfredo",123,134,fecha,false);
		Revista r4= new Revista("Cosmopolitan","Raul",123,134,fecha,true);
		Revista r5= new Revista("Perseo","Christian",123,134,fecha,true);
		CarritoCompra c = new CarritoCompra();
		
		//Se agregaron  libros al carrito
		c.agregarLibro(l1);
		c.agregarLibro(l2);
		c.agregarLibro(l3);
		c.agregarLibro(l4);
		c.agregarLibro(l5);
		//Se agregaron  revistas al carrito
		c.agregarRevista(r1);
		c.agregarRevista(r2);
		c.agregarRevista(r3);
		c.agregarRevista(r4);
		c.agregarRevista(r5);
		//Se probó que quitar libros/revistas funcione
		c.quitarLibro(l2);
		c.quitarRevista(r5);
		//Se probó mostrar titulos de libros cargados
		c.mostrarCarrito();
		//Se pidió mostrar el precio total a pagar
		c.mostrarTotal();
	}
}

