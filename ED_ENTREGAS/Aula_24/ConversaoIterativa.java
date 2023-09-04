import javax.swing.JOptionPane;

public class ConversaoIterativa {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite um número decimal:");
        int decimalNumber = Integer.parseInt(input);

        
        String[] choices = {"Binário", "Octal", "Hexadecimal"};
        String baseChoice = (String) JOptionPane.showInputDialog(null, "Escolha a base de conversão:",
                "Conversão de base", JOptionPane.QUESTION_MESSAGE, null,
                choices, choices[0]);

                String result = "";
        int base = 0;
        StringBuilder steps = new StringBuilder();

        if (baseChoice.equals("Bin�rio")) {
            base = 2;
            result = decimalToBinary(decimalNumber, steps);
        } else if (baseChoice.equals("Octal")) {
            base = 8;
            result = decimalToOctal(decimalNumber, steps);
        } else if (baseChoice.equals("Hexadecimal")) {
            base = 16;
            result = decimalToHexadecimal(decimalNumber, steps);
        }

        JOptionPane.showMessageDialog(null, "O número decimal " + decimalNumber +
                " convertido para a base " + base + " é: " + result + "\n\nEtapas:\n" + steps.toString());
    }

    public static String decimalToBinary(int decimalNumber, StringBuilder steps) {
        String binaryNumber = "";
        int quotient = decimalNumber;
        while (quotient > 0) {
            int remainder = quotient % 2;
            binaryNumber = remainder + binaryNumber;
            quotient /= 2;
            steps.append("Quociente: ").append(quotient).append(", Resto: ").append(remainder).append("\n");
        }
        return binaryNumber;
    }

    // M�todo para converter um n�mero decimal em octal usando um loop while
    public static String decimalToOctal(int decimalNumber, StringBuilder steps) {
        String octalNumber = "";
        int quotient = decimalNumber;
        while (quotient > 0) {
            int remainder = quotient % 8;
            octalNumber = remainder + octalNumber;
            quotient /= 8;
            steps.append("Quociente: ").append(quotient).append(", Resto: ").append(remainder).append("\n");
        }
        return octalNumber;
    }

    public static String decimalToHexadecimal(int decimalNumber, StringBuilder steps) {
        String hexadecimalNumber = "";
        int quotient = decimalNumber;
        while (quotient > 0) {
            int remainder = quotient % 16;
            if (remainder < 10) {
                hexadecimalNumber = remainder + hexadecimalNumber;
            } else {
                char hexChar = (char) ('A' + (remainder - 10));
                hexadecimalNumber = hexChar + hexadecimalNumber;
            }
            quotient /= 16;
            steps.append("Quociente: ").append(quotient).append(", Resto: ").append(remainder).append("\n");
        }
        return hexadecimalNumber;
    }
}
