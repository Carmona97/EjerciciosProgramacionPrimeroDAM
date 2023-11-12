package ejercicio9;

import java.util.ArrayList;
import java.util.HashMap;

//Realizado por Juan Manuel Carmona Ruiz 1DAM el 27-03-2023

public class Cliente {

    private String nombre;
    private String email;
    private ArrayList<String> telefonos;
    private HashMap<String, Integer> compras;

    public Cliente(String nombre, String email) {
    	
        this.nombre = nombre;
        this.email = email;
        this.telefonos = new ArrayList();
        this.compras = new HashMap();
        
    }

	    public String getNombre() {
	    	
	        return nombre;
	        
	    }

	    public void setNombre(String nombre) {
	    	
	        this.nombre = nombre;
	        
	    }

	    public String getEmail() {
	    	
	        return email;
	        
	    }
	    

	    public void setEmail(String email) {
	    	
	        this.email = email;
	        
	    }

		@Override
		public String toString() {
			
			return "Cliente [nombre=" + nombre + ", email=" + email + ", telefonos=" + telefonos + ", compras="
					+ compras + "]";
			
		}
	    

		public void addTelefono(String numeroTlf) {
			
	        if (telefonos.contains(numeroTlf)) {
	        	
	            telefonos.add(null);
	            
	        }else {
	        	
	        	telefonos.add(numeroTlf);
	        	
	        }
	        
	    }

	    public String getTelefono(int indice) {
	    	
	    	if(telefonos.get(indice)==null) {
	    		
	    		return " ";
	    		
	    	}else {
	    		
	    		return telefonos.get(indice);
	    		
	    	}
	    	        
	    }
	    
	    public String buscarTelefono(String cadena) {
	    	
	        ArrayList<String> resultados = new ArrayList();
	        
	        for (String i : telefonos) {
	        	
	            if (i.contains(cadena)) {
	                resultados.add(i);
	                
	            }
	        }
	        
	        return resultados.toString();
	        
	    }
	    
	    public void addCompra(String producto, int cantidad) {
	    	
	        if (compras.containsKey(producto)) {
	        	
	            int cantidadActual = compras.get(producto);	            
	            compras.put(producto, cantidadActual + cantidad);
	            
	        } else {
	        	
	            compras.put(producto, cantidad);
	            
	        }
	    }

	    public void eliminarProducto(String producto) {
	    	
	        compras.remove(producto);
	        
	    }

	    public String verProductos() {
	    	
	        ArrayList<String> productos = new ArrayList<>(compras.keySet());
	        
	        return productos.toString();
	    }

	    public int totalUnidades() {
	    	
	        int total = 0;
	        
	        for (int cantidad : compras.values()) {
	        	
	            total += cantidad;
	            
	        }
	        
	        return total;
	    }
	    
	    

}
