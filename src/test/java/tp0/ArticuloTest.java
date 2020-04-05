package tp0;

import org.junit.jupiter.api.*;
import tp0.exceptions.CambiaPrecioEnArticuloUsadoEnListaException;

public class ArticuloTest {
	
		
/*
	@Test (expected=typeof(ArticuloUsadoEnListaException))
	public void testCambiarPrecioOk() {
		Articulo aysa = new Articulo(550,true);	
		aysa.setUsadoEnLista(true);
		aysa.cambiarPrecio(20);	
	}
*/	
	@Test
	public void testCambiarPrecioArtEnLista() {
		try {
			Articulo aysa = new Articulo(550,true);	
			aysa.setUsadoEnLista(true);
			aysa.cambiarPrecio(20);	
		}
		catch(CambiaPrecioEnArticuloUsadoEnListaException exception){}
	}
}
