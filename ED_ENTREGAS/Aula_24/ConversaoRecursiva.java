import javax.swing.JOptionPane;

public class ConversaoRecursiva {
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

        if (baseChoice.equals("Binário")) {
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
        if (decimalNumber == 0) {
            return "";
        } else {
            int remainder = decimalNumber % 2;
            steps.append("Quociente: ").append(decimalNumber / 2).append(", Resto: ").append(remainder).append("\n");
            return decimalToBinary(decimalNumber / 2, steps) + remainder;
        }
    }

    public static String decimalToOctal(int decimalNumber, StringBuilder steps) {
        if (decimalNumber == 0) {
            return "";
        } else {
            int remainder = decimalNumber % 8;
            steps.append("Quociente: ").append(decimalNumber / 8).append(", Resto: ").append(remainder).append("\n");
            return decimalToOctal(decimalNumber / 8, steps) + remainder;
        }
    }

    public static String decimalToHexadecimal(int decimalNumber, StringBuilder steps) {
        if (decimalNumber == 0) {
            return "";
        } else {
            int remainder = decimalNumber % 16;
            String hexDigit = "";
            if (remainder < 10) {
                hexDigit = Integer.toString(remainder);
            } else {
                char hexChar = (char) ('A' + (remainder - 10));
                hexDigit = Character.toString(hexChar);
            }
            steps.append("Quociente: ").append(decimalNumber / 16).append(", Resto: ").append(remainder).append("\n");
            return decimalToHexadecimal(decimalNumber / 16, steps) + hexDigit;
        }
    }
}
