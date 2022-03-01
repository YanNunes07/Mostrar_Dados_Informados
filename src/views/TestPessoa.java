package views;

import model.Pessoa;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class TestPessoa {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Pessoa p1 = new Pessoa();

        Pessoa p2 = new Pessoa("yan", 18, 80, 1.89);


        System.out.println("Digite o nome");
        p1.setNome(ler.nextLine());

        System.out.println("Digite a idade:");
        p1.setIdade(ler.nextInt());

        System.out.println("Digite seu peso:");
        p1.setPeso(ler.nextDouble());

        System.out.println("Digite sua altura:");
        p1.setAltura(ler.nextDouble());



        System.out.println(p1.toString());
        System.out.println(p2.toString());


    }
}
