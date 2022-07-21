package aula7;

import java.util.Scanner;

public class Executor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Delta delta = new Delta();
        EqXn x = new EqXn();

        System.out.println("Considere a Equacao: Ax^2 Bx C = 0 informe os valores.");
        System.out.println("Valor de A?");
        delta.setA(entrada.nextDouble());
        System.out.println("Valor de B?");
        delta.setB(entrada.nextDouble());
        System.out.println("Valor de C?");
        delta.setC(entrada.nextDouble());

        delta.calculaDelta();
        System.out.println("O Delta é: " + delta.getDelta());
        if (delta.getDelta() < 0) {
            System.out.println("Equação sem raízes reais.");
        } else {
            System.out.println("xn :" + x.getXn(delta));
            System.out.println("xp :" + x.getXp(delta));
        }
    }
}
