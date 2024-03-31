import java.util.Scanner;

public class SequenciaFibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicita ao usuário que informe um número
        System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = sc.nextInt();

        // Calcula e imprime a sequência de Fibonacci até o número informado
        calcularFibonacci(numero);

        // Verifica se o número informado pertence à sequência de Fibonacci e exibe uma mensagem correspondente
        if (verificarFibonacci(numero)){
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }

        sc.close();
    }

    // Função para calcular e imprimir a sequência de Fibonacci até o número informado
    public static void calcularFibonacci(int numero) {
        int primeiro = 0;
        int segundo = 1;

        // Imprime os dois primeiros números da sequência de Fibonacci
        System.out.print("Sequência de Fibonacci até " + numero + ": ");
        System.out.print(primeiro + ", " + segundo);

        // Calcula e imprime os próximos números da sequência de Fibonacci até atingir ou ultrapassar o número informado
        int proximo = primeiro + segundo;
        while (proximo <= numero){
            System.out.print(", " + proximo);
            primeiro = segundo;
            segundo = proximo;
            proximo = primeiro + segundo;
        }
        System.out.println();
    }

    // Função para verificar se um número pertence à sequência de Fibonacci
    public static boolean verificarFibonacci(int numero){
        int primeiro = 0;
        int segundo = 1;

        // Verifica se o número informado é igual a um dos dois primeiros números da sequência de Fibonacci
        if (numero == primeiro || numero == segundo) {
            return true;
        }

        // Calcula os próximos números da sequência de Fibonacci até atingir ou ultrapassar o número informado
        int proximo = primeiro + segundo;
        while (proximo <= numero){
            if (proximo == numero) {
                return true;
            }
            primeiro = segundo;
            segundo = proximo;
            proximo = primeiro + segundo;
        }
        return false;
    }
}
