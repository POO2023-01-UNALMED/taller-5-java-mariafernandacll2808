package gestion;

import java.util.ArrayList;

public class Zoologico {
    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> zonas= new ArrayList<Zona>();


    //Constructores

    public Zoologico(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }    

    public Zoologico() {
    }

    //Set and Get

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return this.ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public ArrayList<Zona> getZonas() {
        return this.zonas;
    }

    public void setZonas(ArrayList<Zona> zonas) {
        this.zonas = zonas;
    }
    

    //Metodos
    public void agregarZonas(Zona zona){
        zonas.add(zona);
    }

    public int cantidadTotalAnimales() {
		int c = 0;
        for (int i=0; i<zonas.size(); i++){
            c=+zonas.get(i).cantidadAnimales();
        }
        return c;
	}
    
}
