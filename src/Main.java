import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Auxiliar aux = new Auxiliar();
        Scanner sc = new Scanner(System.in);
        int op = 0;
        boolean v = true;
        Moeda test;
        while (v){
            System.out.println("------- Sistema Conversor de Moedas -------");

            System.out.println("1) Dólar =>>> Peso Argentino");
            System.out.println("2) Peso Argentino =>>> Dólar");
            System.out.println("3) Dólar =>>> Real Brasileiro");
            System.out.println("4) Real Brasileiro =>>> Dólar");
            System.out.println("5) Dólar =>>> Peso Colombiano");
            System.out.println("6) Peso Colombiano =>>> Dólar");
            System.out.println("7) Sair");
            op = sc.nextInt();
            switch (op){
                case 1:
                    test = new Moeda(aux.buscaMoeda("USD","ARS"));
                    System.out.println("Digite o valor: ");
                    System.out.println("Valor Convertido : " + test.convertE(sc.nextDouble()));
                    System.out.println(test.toString());
                    break;
                case 2:
                    test = new Moeda(aux.buscaMoeda("ARS","USD"));
                    System.out.println("Digite o valor: ");
                    System.out.println("Valor Convertido : " + test.convertE(sc.nextDouble()));
                    System.out.println(test.toString());
                    break;
                case 3:
                    test = new Moeda(aux.buscaMoeda("USD","BRL"));
                    System.out.println("Digite o valor: ");
                    System.out.println("Valor Convertido : " + test.convertE(sc.nextDouble()));
                    System.out.println(test.toString());
                    break;
                case 4:
                    test = new Moeda(aux.buscaMoeda("BRL","USD"));
                    System.out.println("Digite o valor: ");
                    System.out.println("Valor Convertido : " + test.convertE(sc.nextDouble()));
                    System.out.println(test.toString());
                    break;
                case 5:
                    test = new Moeda(aux.buscaMoeda("USD","COP"));
                    System.out.println("Digite o valor: ");
                    System.out.println("Valor Convertido : " + test.convertE(sc.nextDouble()));
                    System.out.println(test.toString());
                    break;
                case 6:
                    test = new Moeda(aux.buscaMoeda("COP","USD"));
                    System.out.println("Digite o valor: ");
                    System.out.println("Valor Convertido : " + test.convertE(sc.nextDouble()));
                    System.out.println(test.toString());
                    break;
                case 7:
                    v = false;
                    break;
                default:
                    System.out.println("Escolha uma opção válida");
            }
        }


    }
}