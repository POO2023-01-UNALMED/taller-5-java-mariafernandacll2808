package zooAnimales;

import gestion.Zona;

public class Animal {
    private int totalAnimales;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona zona; 

    //Constructores 

    public Animal(String nombre, int edad, String habitat, String genero) {
        totalAnimales ++;
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
    }


    public Animal() {
        totalAnimales ++;
    }

    //Set and Get

    public int getTotalAnimales() {
        return this.totalAnimales;
    }

    public void setTotalAnimales(int totalAnimales) {
        this.totalAnimales = totalAnimales;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHabitat() {
        return this.habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Zona getZona() {
        return this.zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    //Metodos

    public String movimiento(){
        return "desplazarse";
    }

    public String totalPorTipo(){
        return "Mamiferos: " + Mamifero.cantidadMamiferos()+ "\nAves: " + Ave.cantidadAves() + "\nReptiles: " + Reptil.cantidadReptiles()+ "\nPeces: " + Pez.cantidadPeces()+ "\nAnfibios: " + Anfibio.cantidadAnfibios();
    }

    public String toString(){
        if (zona == null) {
			return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + " y mi genero es " + genero;	
		}else{
			return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + " y mi genero es " + genero + ", la zona en la que me ubico es " + zona.getNombre() + ", en el " + zona.getZoo().getNombre();
		}

    }
}




    

