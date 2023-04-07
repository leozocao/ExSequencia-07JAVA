import java.util.Scanner;

public class dobroareaquadrado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double lado, area, dobroarea;

        System.out.print("Digite o valor do lado do quadrado: ");
        lado = teclado.nextDouble();

        area = lado * lado;
        dobroarea = area * 2;

        System.out.print("O dobro da área desse quadrado é: " + dobroarea);

        teclado.close();

    }

    
}