import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CadastroLocatario {
    private static final String ARQUIVO_LOCATARIOS = "cadastro_locatario.csv";
    private static final String ARQUIVO_IMOVEIS = "cadastro_imoveis.csv";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = "s";

        try (FileWriter writerLocatario = new FileWriter(ARQUIVO_LOCATARIOS, true);
             FileWriter writerImoveis = new FileWriter(ARQUIVO_IMOVEIS, true)) {
            while (continuar.equalsIgnoreCase("s")) {
                System.out.println("Deseja cadastrar um locatário ou um imóvel? (locatario/imovel)");
                String opcao = scanner.nextLine();

                if (opcao.equalsIgnoreCase("locatario")) {
                    System.out.println("Digite o nome do Locatário:");
                    String nome = scanner.nextLine();

                    System.out.println("Digite o CPF do locatário:");
                    String cpf = scanner.nextLine();

                    System.out.println("Digite o endereço do locatário:");
                    String endereco = scanner.nextLine();

                    System.out.println("Digite o telefone do locatário:");
                    String telefone = scanner.nextLine();

                    System.out.println("Digite o nome da loja:");
                    String nomeLoja = scanner.nextLine();

                    Locatario locatario = new Locatario(nome, cpf, endereco, telefone, nomeLoja);

                    writerLocatario.write(locatario.toString() + "\n");

                    System.out.println("Locatário cadastrado com sucesso!");

                } else if (opcao.equalsIgnoreCase("imovel")) {
                    System.out.println("Digite o endereço do imóvel:");
                    String endereco = scanner.nextLine();

                    System.out.println("Digite o tipo do imóvel (apartamento, casa, sala comercial, etc.):");
                    String tipo = scanner.nextLine();

                    System.out.println("Digite o valor do aluguel do imóvel:");
                    double valorAluguel = Double.parseDouble(scanner.nextLine());

                    System.out.println("Digite a área do imóvel em metros quadrados:");
                    int area = Integer.parseInt(scanner.nextLine());

                    System.out.println("O imóvel está disponível? (true/false)");
                    boolean disponivel = Boolean.parseBoolean(scanner.nextLine());

                    Imoveis imovel = new Imoveis(endereco, tipo, valorAluguel, area, disponivel);

                    writerImoveis.write(imovel.toString() + "\n");

                    System.out.println("Imóvel cadastrado com sucesso!");
                } else {
                    System.out.println("Opção inválida. Tente novamente.");
                }

                System.out.println("Deseja cadastrar outro locatário ou imóvel? (s/n)");
                continuar = scanner.nextLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar dados: " + e.getMessage());
        }

        scanner.close();
    }
}
