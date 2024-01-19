import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N, i;
        double gastos, soma = 0, media, meses;
        String Janeiro, Fevereiro, Março;
        double gastosJaneiro = 15000.00;
        double gastosFevereiro = 23000.00;
        double gastosMarco = 17000.00;
        double gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;


        System.out.println("Gastos por trimestre : R$" + String.format("%.2f", gastosTrimestre));
        double mediaPorMes = gastosTrimestre / 3;
        System.out.println("Média mensal: R$" + String.format("%.2f", mediaPorMes));

        //Daqui para baixo eu fiz por conta para obter o resultado igual ao de cima,
         // e permitindo calcular um balanço semestral ou anual por exemplo!!

        System.out.println("Digite quantos meses serão lançados:");
        N = sc.nextInt();
        for (i = 0; i < N; i++) {
            System.out.println("Digite o mês referente:");
            String String = sc.next();
            System.out.println("Digite o valor gasto:");
            gastos = sc.nextDouble();
            soma = soma + gastos;
        }

            System.out.println("Gastos por trimestre: R$ " + String.format("%.2f", soma));
            System.out.println("Média mensal de gastos no trimestre: R$ " + String.format("%.2f" , soma / N) );

    }


}








