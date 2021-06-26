package calculator;
import rectangle.retangulo;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        retangulo retangulo = new retangulo();

        System.out.println("Insira a largura e a altura do retângulo: ");
        retangulo.largurta = sc.nextDouble();
        retangulo.altura = sc.nextDouble();
        System.out.println("AREA = " + String.format("%.2f",retangulo.area()));
        System.out.println("PARAMETRO = " + String.format("%.2f",retangulo.perametro()));
        System.out.println("DIAGONAL = " + String.format("%.2f",retangulo.diagonal()));

    }
}
