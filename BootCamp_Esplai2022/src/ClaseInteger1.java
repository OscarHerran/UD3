public class ClaseInteger1 {
	public class mainClase{
		

	public static void main(String[] args) {
		//creacion de un objeto Integer usando el segundo contructor
		Integer num1=new Integer("125");
		//Creacion de un objeto Integer usando el preimer constructor
		Integer num2=new Integer(20);
		
		//Obtencion del entero que almacena cada objeto Integer.
		//si no se hace esto. las lineas siguiente casusaran error
		int n1=num1.intValue();
		int n2=num2.intValue();
		System.out.println("suma de "+n1+" y "+n2+" vale "+(n1+n2));
		if (n1+n2>130)
		          n1++;
		else
		          n1--;
		System.out.println(n1);
				
		

	}

}
}