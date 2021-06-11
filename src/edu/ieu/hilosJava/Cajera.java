package edu.ieu.hilosJava;

import java.util.Iterator;

public class Cajera {
	private String nombre;

	public Cajera(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void procesarCompra(Cliente cliente, long timeStramp) {
		
		System.out.println("La cajera "+ this.nombre +"Comienza la compra del cliente "+ cliente.getNombre()+
				"En el tiempo "+ (System.currentTimeMillis()- timeStramp)/1000+"segs");
		
	      for(int i=0; i < cliente.getCarroCompra().length; i++) {

	          this.esperarXsegundos(cliente.getCarroCompra()[i]);

	          System.out.println("Procesando el producto " + (i + 1) +

	                " ->Tiempo: " + (System.currentTimeMillis() - timeStramp ) / 1000 +

	                "seg" );

	       }

	       System.out.println("La cajera " + this.nombre + " HA TERMINADO DE PROCESAR " +

	       cliente.getNombre() + " EN EL TIEMPO: " + 

	       (System.currentTimeMillis() - timeStramp ) / 1000 + "segs");

	    }
	private void esperarXsegundos(int segundos) {
		try {
			Thread.sleep(segundos *1000);
			
		}catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		
	}
	}

}
