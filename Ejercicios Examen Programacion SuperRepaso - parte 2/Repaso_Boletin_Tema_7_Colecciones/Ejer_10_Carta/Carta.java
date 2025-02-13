package Ejer_10_Carta;
/*
 * 10. Realiza un programa que escoja al azar 10 cartas de la baraja espa�ola (10 objetos de la clase Carta). 
 * Emplea un objeto de la clase ArrayList para almacenarlas y aseg�rate de que no se repite ninguna. 
 * La clase Carta tendr� los siguientes atributos:
 * private static String[] n = {"as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "sota", "caballo", "rey"};
 * private static String[] p = {"bastos", "copas", "espadas", "oros"};
 * private String numero;
 * private String palo;
 * Y un constructor vac�o, donde se generar� aleatoriamente el valor de sus atributos numero y palo.
 */
public class Carta {

	//ATRIBUTOS
	private static String[] n = {"as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "sota", "caballo", "rey"};
	private static String[] p = {"bastos", "copas", "espadas", "oros"};
	private String numero;
	private String palo;
	
	//CONSTRUCTOR vac�o
	public Carta() {
		//super(); //no hace falta??
		//OJO, cuando me dispongo a hacer esto, no puedo poner el getN... porque aun no tengo los GETTERS generados!!
		this.numero = Carta.getN()[(int)(Math.random()*10)]; //los 10 posibles n�meros/valores 
		this.palo = Carta.getP()[(int)(Math.random()*4)]; //los 4 posibles palos 
	}

	//CONSTRUCTOR Lleno
	public Carta(String numero, String palo) {
		super();
		this.numero = numero;
		this.palo = palo;
	}

	//GETTER Y SETTER
	public static String[] getN() {
		return n;
	}

	public static void setN(String[] n) {
		Carta.n = n;
	}

	public static String[] getP() {
		return p;
	}

	public static void setP(String[] p) {
		Carta.p = p;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	//To String
	@Override
	public String toString() {
		return "Carta [numero=" + numero + ", palo=" + palo + "]";
	}
	
	
}
