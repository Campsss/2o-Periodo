import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.io.IOException;



public class log {
    private static final Logger LOGGER = Logger.getLogger(log.class.getName());

    public static void main(String[] args) {
       
        try {
            FileHandler fileHandler = new FileHandler("app.log");
            LOGGER.addHandler(fileHandler);
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Erro ao configurar o arquivo de log", e);
        }

        
        Scanner scanner = new Scanner(System.in);
        while (true) {
            LOGGER.info("Por favor, digite seu nome:");
            String nome = scanner.nextLine();
            LOGGER.info("Por favor, digite sua idade:");
            int idade = scanner.nextInt();

            
            LOGGER.info("Nome: " + nome);
            LOGGER.info("Idade: " + idade);

            
            scanner.nextLine(); 

            LOGGER.info("Deseja adicionar mais informações? (S/N)");
            String continuar = scanner.nextLine();
            if (!continuar.equalsIgnoreCase("S")) {
                break; 
            }
        }

    
        scanner.close();
    }
    
}
