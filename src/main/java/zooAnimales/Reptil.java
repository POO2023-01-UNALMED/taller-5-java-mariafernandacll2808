package zooAnimales;
import java.util.ArrayList;

public class Reptil extends Animal{
    private static ArrayList<Reptil> listado = new ArrayList<Reptil>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
    
	//Constructores
	
	public Reptil(String nombre, int edad, String habitat,String genero,String colorEscamas,int largoCola) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
		listado.add(this);
	}	
	
	public Reptil() {	
	}

    //Set and Get

    public String getColorEscamas() {
        return this.colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getLargoCola() {
        return this.largoCola;
    }

    public void setLargoCola(int largoCola) {
        this.largoCola = largoCola;
    }

    //Metodos

	static public int cantidadReptiles(){
		return listado.size();
	}

    public String movimiento(){
        return "reptar";
    }

	public static Reptil crearIguana(String nombre, int edad, String genero){
		iguanas ++;	
		return new Reptil(nombre, edad, "humedal", genero,"verde",3); 	
	}
	
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		serpientes ++;
		return new Reptil(nombre, edad, "jungla", genero,"blanco",1); 
	}
    
}