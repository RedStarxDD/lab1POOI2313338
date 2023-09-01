
public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numA=-1,numB=-10,
			signoA=Integer.signum(numA),
			signoB=Integer.signum(numB);
		
		if(signoA==0) signoA=1;
		if(signoB==0) signoB=1;
		
		if(signoA==signoB) {
			System.out.println("Tienen el mismo signo");
		} else
			System.out.println("No tienen el mismo signo");
	}

}
