package tp0;

import tp0.exceptions.CambiaPrecioEnArticuloUsadoEnListaException;

public class Articulo {
	 int precio;
	 boolean usadoEnLista = false;
	 boolean servicio;
	 
	 public  Articulo(int p, boolean s) {	
		 this.precio=p;
		 this.servicio=s;
	 }
	 
	 
	public void cambiarPrecio (int nuevoPrecio) throws CambiaPrecioEnArticuloUsadoEnListaException {
		 if	(!usadoEnLista) {
			 precio = nuevoPrecio;
		 }
		 else {
			 throw new CambiaPrecioEnArticuloUsadoEnListaException()  ;
		 }
	 }


	public void setUsadoEnLista(boolean usadoEnLista) {
		this.usadoEnLista = usadoEnLista;
	}
}


