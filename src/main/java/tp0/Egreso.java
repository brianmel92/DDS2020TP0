package tp0;

import java.util.*;

import tp0.exceptions.AgregaArticuloEnEgresoCerradoException;

public class Egreso {
	
	//valor de la suma de los productos que contiene la lista de articulos
	int valor=0;
	
	//genero un documento asoc. y en el constructor se instancia
	//como remito, hasta que encuentre 1 art que no sea servicio
	DocComercial documentoAsoc = new DocComercial() ;
	
	//armo lista de articulos que van en el egreso.
	  List<Articulo> listaDeArticulos = new ArrayList<Articulo>();
	
	 //bandera cerro
	 boolean cerro = false;
	public void agregarArticulo(Articulo e) throws AgregaArticuloEnEgresoCerradoException {
		if(!cerro) {
			this.listaDeArticulos.add(e);
		}
		else {
			throw new AgregaArticuloEnEgresoCerradoException();
		}
	}
	 
	public void cerrar() {
		//recorro la lista de articulos
		for(Articulo temp : listaDeArticulos) {
			//voy sumando el valor total de los articulos y los marco como usados
			valor += temp.precio;
			temp.setUsadoEnLista(true);
			
			//chequeo que el articulo sea un servicio
			if(documentoAsoc.isRemito()) { 
				if(!temp.servicio) { //si no es un servicio, le saco la propiedad de remito al documento asociado
					documentoAsoc.setRemito(false);
				}
			}
		}
		//levanto bandera cerro
		cerro = true;
	}
	
}
