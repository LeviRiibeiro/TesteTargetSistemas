import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Variaveis do sistema
        String entrada;
        String invertida;

        // Solicita ao usuario que insira uma String
        System.out.print("Digite uma String: ");
        entrada = sc.nextLine();

        // Chama a função para inverter a String
        invertida = inverterString(entrada);

        // Imprime a String invertida
        System.out.println("String invetida: " + invertida);

        sc.close();
    }

    // Função oara inverter uma String
    public static String inverterString(String str){

        // Converter a string para um array de caracteres.
        char[] caracteres = str.toCharArray();

        // Inverte os caracteres no array
        int inicio = 0;
        int fim = caracteres.length - 1;
        while (inicio < fim) {
            // Troca os caaracteres de posição
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;

            // Move os índices de inicio e fim para o próximo par de caracteres.
            inicio++;
            fim--;
        }

        // Converte o array de caracteeres de volta para String
        return new String(caracteres);

    }




}
