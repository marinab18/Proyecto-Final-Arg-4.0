/*package libreria;

import java.util.Scanner;
import java.time.LocalDate;
public class Servicios {

    public Libro altaLibro() {
        //instanciar un objeto de nuevo libro 
        Libro l1 = new Libro();
        //lleno los atributos
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese Titulo del libro");
        l1.setTitulo(leer.nextLine());
        System.out.println("Ingrese Autor del libro");
        l1.setAutorPrincipal(leer.nextLine());
        System.out.println("Ingrese Editorial");
        l1.setEditorial(leer.nextLine());
        System.out.println("Ingrese Precio de compra");
        l1.setPrecioCompra(leer.nextDouble());
        System.out.println("Ingrese Numero de codigo");
        l1.setCodigo(leer.nextInt());
        l1.setFechaDePublicacion(LocalDate.now());
        System.out.println("El libro que desea es fisico? Responda si o no ");
        String name =leer.nextLine();
        if (name=="si") {l1.setFisico(true);}
        else if(name=="no") {l1.setFisico(false);}
 
        return l1;
    }

    public void imprimirlibro(Libro l1) {

        System.out.println( l1.getTitulo());
}
    
    public Revista altaRevista() {
        //instanciar un objeto de nuevo libro 
        Revista r1 = new Revista();
        //lleno los atributos
        //titulo,codigo,precioCompra, fechaDePublicacion, fisico
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese Nombre del revista");
        r1.setTitulo(leer.nextLine());
        System.out.println("Ingrese Editor");
        r1.setEditor(leer.nextLine());
        System.out.println("Ingrese Precio de compra");
        r1.setPrecioCompra(leer.nextDouble());
        System.out.println("Ingrese Numero de codigo");
        r1.setCodigo(leer.nextInt());
        r1.setFechaDePublicacion(LocalDate.now());
        System.out.println("El libro que desea es fisico? Responda si o no ");
        String name =leer.nextLine();
        if (name=="si") {r1.setFisico(true);}
        else if(name=="no") {r1.setFisico(false);}
 
        return r1;
    }

    public void imprimirRevista(Revista r1) {

        System.out.println( r1.getTitulo());
}}*/