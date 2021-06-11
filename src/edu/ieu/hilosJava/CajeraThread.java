package edu.ieu.hilosJava;

public class CajeraThread extends Thread {
	
   private String nombre;
   private Cliente cliente;
   private long initialtime;
   
   
public CajeraThread(String nombre, Cliente cliente, long initialtime) {
	super();
	this.nombre = nombre;
	this.cliente = cliente;
	this.initialtime = initialtime;
}

public void run() {
	System.out.println("La cajera " + this.nombre + "Comienza a procesar la compra del cliente " +

	       cliente.getNombre() + " EN EL TIEMPO: " + 

	       (System.currentTimeMillis() - initialtime ) / 1000 + "segs"
	       );
	
	 for(int i=0; i < cliente.getCarroCompra().length; i++) {

         this.esperarXsegundos(cliente.getCarroCompra()[i]);

         System.out.println("Procesando el producto " + (i + 1) +

               " ->Tiempo: " + (System.currentTimeMillis() - initialtime ) / 1000 +

               "seg" );
         System.out.println("La cajera "+ this.nombre+"ha terminado de procesar"+ cliente.getNombre()+ "en el tiempo: "
        		 +(System.currentTimeMillis()- initialtime)/1000+"segs");
	 }

}

private void esperarXsegundos(int segundos) {
	try {
		Thread.sleep(segundos *1000);
		
	}catch(InterruptedException ex) {
		Thread.currentThread().interrupt();
	
}}


public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public Cliente getCliente() {
	return cliente;
}
public void setCliente(Cliente cliente) {
	this.cliente = cliente;
}
public long getInitialtime() {
	return initialtime;
}
public void setInitialtime(long initialtime) {
	this.initialtime = initialtime;
}
   
   
   
}
