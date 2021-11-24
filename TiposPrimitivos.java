import java.lang.*;
import java.util.*;

public class TiposPrimitivos{

public static void main(String[]args){

	byte b=120;
	short y=29450;
	int entero=89657456;
	String cadena="Aldo";
	double x; //Declara la variable X
	double suma;
	suma=b+entero;
	x=5; //Asignar valor a la variable
	
	System.out.println("El valor de x actual es: "+x);
	
	x=7;
	System.out.println("Ahora x vale: "+x);
	x=1000000000.23;
	System.out.println("Ahora x vale?:"+x);
	System.out.println("Byte es igual:"+b);
	System.out.println("Short es igual:"+y);
	System.out.println("Mi entero es:"+entero);
	System.out.println("La suma de byte + entero ="+suma);
	System.out.println("Mi nombre es:"+cadena);
	}

}
