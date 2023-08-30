package calcular;

public class Fibonacci {
	public static void main(String[] args) {
	double x = 1;
	double y = 0;
	double aux;
	double n = 35;
	int i = 0;

	while(i < n){
		aux = x+y;
		x=y;
		y = aux;
		i++;
		System.out.println(y);
	}
	System.out.println(y);
}
	
}