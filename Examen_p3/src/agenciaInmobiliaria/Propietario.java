package agenciaInmobiliaria;

import java.util.ArrayList;

public class Propietario {
    private String nombre;
    private String apellidos;
    private String dni;
    private String telefono;
    private ArrayList<Propiedad> propiedades;

    public Propietario(String nombre, String apellidos, String dni, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.telefono = telefono;
        this.propiedades = new ArrayList<>();
    }

    public String getDni() {
        return dni;
    }

    public void agregarPropiedad(Propiedad propiedad) {
        propiedades.add(propiedad);
    }

    public ArrayList<Propiedad> getPropiedades() {
        return propiedades;
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setPropiedades(ArrayList<Propiedad> propiedades) {
		this.propiedades = propiedades;
	}
}

