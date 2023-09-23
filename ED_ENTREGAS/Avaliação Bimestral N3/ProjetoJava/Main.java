import javax.swing.JOptionPane;
public class Main {
	public static void main(String[] args) {
		ArvoreBinaria AB = new ArvoreBinaria();
		while(true) {
			String strnumero = JOptionPane.showInputDialog(null, "Digite o número");
			int numero = 0;
			try {
				numero = Integer.parseInt(strnumero);
			} catch(Exception e){
				JOptionPane.showMessageDialog(null, e);
			}
			AB.comeca(numero);
			int sair = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
			if(sair == JOptionPane.NO_OPTION || sair == JOptionPane.CANCEL_OPTION) {
				break;
			}
		}
        AB.exibirEmOrdem();
	}
}