package Ejer_17_Proyecto_Cilindro;

/* 
 * 17. PROYECTO CILINDRO:
A. Clase Punto (atributos double: x e y; void trasladar(double,double) ;double distancia())
B. Clase Circulo (atributos Punto centro y double radio:)
C. Clase Cuadrado (atributos Punto puntoInicial, int lado y float inclinaci�n)
D. Clase Cilindro (atributos Circulo base y double altura)
La clase abstracta FiguraGeometrica implementa la interfaz DosDimensiones, ya que cualquier
figura tiene una posici�n en el plano.
Punto hereda de FiguraGeometrica, con lo que impl�citamente implementa DosDimensiones,
pero adem�s implementa Movible.
Circulo implementa Movible y Escalable, pero no Rotable.
Cuadrado implementa Movible, Escalable y Rotable.ROTAR RESPECTO AL ORIGEN: 90� (-y,x) 180� (-x,-y) 270� (y,-x) 360� (x,y)
 */

public class Cilindro extends FiguraGeometrica{

	//ATRIBUTOS
	private Circulo base;
	private double altura;
	
	//CONSTRUCTOR Lleno
	public Cilindro(Circulo base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	//CONSTRUCTOR Vac�o
	public Cilindro() {
		super();
	}

	//GETTER Y SETTER
	public Circulo getBase() {
		return base;
	}

	public void setBase(Circulo base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	//To String
	@Override
	public String toString() {
		return "Cilindro [base=" + base + ", altura=" + altura + "]";
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	//M�TODOS
	
}
