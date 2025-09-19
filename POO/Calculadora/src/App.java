import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Calculadora calc = new Calculadora();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = sc.nextInt();

        System.out.println("Escolha uma opção\n 1. Adição \n 2. Subtração \n 3. Multiplicação \n 4. Divisão");

        int escolha = sc.nextInt();
        while (escolha != 1 && escolha != 2 && escolha != 3 && escolha != 4){
            System.out.println("Erro: Digite '1' para Adição. '2' para Subtração '3' para Multiplicação '4' para Divisão");
            escolha = sc.nextInt();
        }

        int resultado = 0;
        double resultadoDouble = 0;


        switch (escolha) {
            case 1:
                resultado = calc.somar(num1, num2);
                System.out.println("Resultado: " + resultado);
                break;
            case 2:
                resultado = calc.subtrair(num1, num2);
                System.out.println("Resultado: " + resultado);
                break;
            case 3:
                resultado = calc.multiplicar(num1, num2);
                System.out.println("Resultado: " + resultado);
                break;
            case 4:
                resultadoDouble = calc.dividir(num1, num2);
                System.out.println("Resultado: " + resultadoDouble);
                break;
            default:
                System.out.println("Opção Ínvalida!");
                return;
        }
        sc.close();
    }
}
