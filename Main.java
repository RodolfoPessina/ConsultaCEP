import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        ConsultaCep consultacep = new ConsultaCep();

        System.out.println("digite o numero de CEP: ");
        var cep = leitura.nextLine();

        try {
            Endereco endereco = consultacep.buscaEndereco(cep);
            System.out.println(endereco);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.salvarJson(endereco);
        } catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        }




    }
}
