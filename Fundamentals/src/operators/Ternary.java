package operators;

public class Ternary {
	
	public int least() {
		int a=10;
		int b=20;
		int c=30;
		
		int res=(a<b)?(a<c? a:c):(b<c?b:c);
		return res;	
	}
	
	public static void main(String[] args) {
		Ternary z=new Ternary();
		System.out.println(z.least());
		z.least();
	}
	

}
