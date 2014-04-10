import java.util.Scanner;


public class Segundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner (System.in);

	System.out.println("Ingrese un numero:");
	Scanner mi_scanner1= new Scanner (System.in);
	int num=mi_scanner1.nextInt();
	
	for (int i=1;i<11;i++)
	{
	System.out.println(num*i);
	}
	}

}
