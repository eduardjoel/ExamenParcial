import java.util.Scanner;
public class Febrero {
	
	public static void main(String[] args) {
		/*Scanner babas=new Scanner(System.in);
		System.out.print("Ingrese el primer Numero:");
		double num1=babas.nextDouble();
		System.out.print("Ingrese el Segundo Numero:");
		double num2=babas.nextDouble();
		
		
		System.out.print("LA SUMA ES:");
		System.out.println(num1+num2);
		System.out.print("La Resta es;");
		System.out.println(num1-num2);
		System.out.print("la Division es:");
		System.out.println(num1/num2);
		System.out.print("La MUltiplicacion es:");
		System.out.println(num1*num2);*/
		
		/*Scanner babas=new Scanner(System.in);
		String str;
		str="Hola como estas?";
		System.out.println(str);
		str=babas.next();
		System.out.println(str);*/
		
		/*Scanner babas=new Scanner(System.in);
		Character letra;
		letra="t";
		System.out.prinln(letra);
		letra= babas.next().charAt(0);
		System.out.println(letra);*/

		/*for( int i=0; i<5;i++);
		Scanner dangerous=new Scanner (System.in);
		int x=dangerous.nextInt();
		if (x==10)
		{
			System.out.println("Es igual a 10");
		}
		else 
			System.out.println("Es diferente a 10");*/
			
		Scanner Eduard=new Scanner(System.in);
		for(int i=0;i<3;i=i+1);
		System.out.println("Ingrese Nota");
		int nota= Eduard.nextInt();
		
		if (nota>=90)
			
			System.out.println("Excelencia");
		
		else if (nota >=80)
		
		System.out.print("Sobresaliente!");
			
		else if (nota>=60)
			System.out.println("Aprobado");
		else 
			System.out.println("Reprobado");

	}

}
