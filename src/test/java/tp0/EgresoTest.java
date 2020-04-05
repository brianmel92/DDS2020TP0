package tp0;
import org.junit.jupiter.api.*;

import tp0.exceptions.AgregaArticuloEnEgresoCerradoException;


public class EgresoTest {

	@Test 
	//se tratara de agregar un elemento mas a la lista de articulos de una compra que ya cerro, arrojando excepcion.
	public void testAgregarArtEnEgresoCerrado() {
		try{
		Egreso egreso = new Egreso();
		Articulo art1 = new Articulo(50,false);
		Articulo art2 = new Articulo(100,false);
		Articulo art3 = new Articulo(300,false);
		egreso.agregarArticulo(art1);
		egreso.agregarArticulo(art2);
		egreso.cerrar();
		egreso.agregarArticulo(art3);
		}
		catch(AgregaArticuloEnEgresoCerradoException exception) {}
	}
}
	
