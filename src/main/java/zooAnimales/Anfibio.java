package zooAnimales;
import java.util.ArrayList;

public class Anfibio extends Animal{
    private static ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
    
	//Constructores
	
	public Anfibio(String nombre, int edad, String habitat,String genero,String colorPiel,boolean venenoso) {
		super(nombre, edad, habitat, genero);
		this.colorPiel = colorPiel;
        this.venenoso = venenoso;
		listado.add(this);
	}	
	
	public Anfibio() {	
	}

    //Set and Get

    public String getColorPiel() {
        return this.colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public boolean getVenenoso() {
        return this.venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }

    //Metodos

	static public int cantidadAnfibios(){
		return listado.size();
	}

    public String movimiento(){
        return "saltar";
    }

	public static Anfibio crearSalmon(String nombre, int edad, String genero){
		ranas ++;	
		return new Anfibio(nombre, edad, "selva", genero,"rojo",true); 	
	}
	
	public static Anfibio crearBacalao(String nombre, int edad, String genero) {
		salamandras ++;
		return new Anfibio(nombre, edad, "selva", genero,"negro y amarillo",false); 
    }
}