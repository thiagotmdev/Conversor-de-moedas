package Menu;

import Conversor.Conversor;

import java.io.IOException;
import java.util.Scanner;

public class Menu extends Conversor {
    Scanner req = new Scanner(System.in);

    public Menu() throws IOException, InterruptedException {
        int op = 0;
        String moeda1;
        String moeda2;
        double valor;

        while(op != 7){
            switch (op){

                case 0:
                    System.out.println("""
                                *************** Conversor de moedas ***************
                                1- Dolar para Real Brasileiro.
                                2- Real Brasileiro para Dolar.
                                3- Yens para Real Brasileiro.
                                4- Real Brasileiro para Yens.
                                5- Peso Argentino para Dolar.
                                6- Peso Argentino para Real.
                                7- Sair.
                                """);

                    System.out.println("Digite a opção: ");
                    op = req.nextInt();
                    break;
                case 1:
                    System.out.println("Digite a quantidade de dolares a converter: ");
                    moeda1 = "USD";
                    moeda2 = "BRL";
                    setMoeda1(moeda1);
                    setMoeda2(moeda2);
                    valor = req.nextDouble();
                    System.out.println("\n");
                    setValor(valor);
                    converter();
                    op = 0;
                    break;
                case 2:
                    System.out.println("Digite a quantidade de Reais a converter: ");
                    moeda1 = "BRL";
                    moeda2 = "USD";
                    setMoeda1(moeda1);
                    setMoeda2(moeda2);
                    valor = req.nextDouble();;
                    System.out.println("\n");
                    setValor(valor);
                    converter();
                    op = 0;
                    break;

                case 3:
                    System.out.println("Digite a quantidade de Yens a converter: ");
                    moeda1 = "JPY";
                    moeda2 = "BRL";
                    setMoeda1(moeda1);
                    setMoeda2(moeda2);
                    valor = req.nextDouble();
                    System.out.println("\n");
                    setValor(valor);
                    converter();
                    op = 0;
                    break;

                case 4:
                    System.out.println("Digite a quantidade de Reais Brasileiros a converter: ");
                    moeda1 = "BRL";
                    moeda2 = "JPY";
                    setMoeda1(moeda1);
                    setMoeda2(moeda2);
                    valor = req.nextDouble();
                    System.out.println("\n");
                    setValor(valor);
                    converter();
                    op = 0;
                    break;

                case 5:
                    System.out.println("Digite a quantidade de Pesos Argentinos a converter: ");
                    moeda1 = "ARS";
                    moeda2 = "USD";
                    setMoeda1(moeda1);
                    setMoeda2(moeda2);
                    valor = req.nextDouble();
                    System.out.println("\n");
                    setValor(valor);
                    converter();
                    op = 0;
                    break;
                case 6:
                    System.out.println("Digite a quantidade de Pesos Argentinos a converter: ");
                    moeda1 = "ARS";
                    moeda2 = "BRL";
                    setMoeda1(moeda1);
                    setMoeda2(moeda2);
                    valor = req.nextDouble();
                    System.out.println("\n");
                    setValor(valor);
                    converter();
                    op = 0;
                    break;
                case 7:
                    op = 7;
                    break;

                default:
                    System.out.println("Erro, digite uma opção válida!");
                    op = 0;
                    break;
            }
        }
    }
}
