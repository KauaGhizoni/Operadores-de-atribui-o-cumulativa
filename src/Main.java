import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int resultado = 50;
        System.out.println("Digite a quantidade de minutos consumidos: ");
        int minutos = sc.nextInt();

        if (minutos <= 100){
            System.out.println(resultado + " reais");
        } else {
            resultado += (minutos - 100) * 2; // "resultado +=" = "resultado = resultado +"
            System.out.println(resultado+ " reais");
        }
        sc.close();
//a += b === a = a + b;
//a -= b === a = a - b;
//a *= b === a = a * b;
//a /= b === a = a / b;
//a %= b === a = a % b;
    }
}