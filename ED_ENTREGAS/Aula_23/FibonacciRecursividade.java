package calcular;
import javax.swing.JOptionPane;

public class FibonacciRecursividade {
		private static void fibonacci(int val, int anterior, int repeater) {
			if(repeater == 0) {
				return;
			}
			val = val + anterior;
			anterior = val - anterior;
			System.out.println(val);
			fibonacci(val, anterior, (repeater - 1));
		}

		public static void main(String[] args) {

String resultado = JOptionPane.showInputDialog(null, "Digite quantos números quer exibir:");

			int res = 0;
			try {
				res = Integer.parseInt(resultado);
			}
			catch(Exception e) {
				System.out.println("Valor não é um numero");
			}
			fibonacci(0, 1, res);
		}
	}