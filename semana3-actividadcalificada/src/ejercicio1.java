
public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1,y=2,z=3,a1=100,a2=200;
		
		if(6<6*5)
			System.out.println("Hello");
			System.out.println("There");		
		//Resultado 1:
		//Hello
		//There
		
		System.out.println();
		
		if(x>y)
		if(x>z)
			System.out.println("1111");
		else
			System.out.println("2222");
		//Resultado 2:
		//No se imprime nada
			
		System.out.println();
		
		if(x<z)
			System.out.println("*");
		else if(x==z)
			System.out.println("&");
		else
			System.out.println("$");
		//Resultado 3:
		//*
		
		System.out.println();
		
		if(x<y)
			System.out.println("####");
		else 
			System.out.println("&&&&");
			System.out.println("****");
		
		//Resultado 4:
		//####
		//****
		
		System.out.println();
		
		if(x>y)
			System.out.println("####");
		else {
			System.out.println("&&&&");
			System.out.println("****");
		}
		//Resultado 5:
		//&&&&
		//****
		
		System.out.println();
		
		if(a1>100&&a2<=200)
			System.out.println(a1+" "+a2+" "+(a1+a2));
		else
			System.out.println(a1+" "+a2+" "+(2*a1-a2));
		//Resultado 6:
		//100 200 0
		
		System.out.println();
		
		if(++x>y++||x-->0)
			z++;
		else
			z--;
		System.out.println(x+" "+y+" "+z);
		//Resultado 7:
		//1 3 4
		
		x=1;
		y=2;
		z=3;
		
		System.out.println();
		
		if(x<y) {
			System.out.println("####");
			System.out.println("****");
		} else
			System.out.println("&&&&");
		//Resultado 8:
		//####
		//****
		
		System.out.println();
		
		if('x'>'z'||66>(int)('A'))
			System.out.println("#*#");
		//Resultado 9:
		//#*#
		
		System.out.println();
		
		if(x<z)
			System.out.println("*");
		else if(x==z)
			System.out.println("&");
		else
			System.out.println("$");
		//Resultado 10:
		//*
	}
	
}
