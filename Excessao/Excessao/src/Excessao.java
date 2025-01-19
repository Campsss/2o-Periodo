public class Excessao {
    
    public class ConversaoNumeroExemplo {
        public static void main(String[] args) {
            String numeroStr = "123a";  // Esta string causará uma exceção
    
            try {
                int numero = Integer.parseInt(numeroStr);
                System.out.println("O número é: " + numero);
            } 
            catch (NumberFormatException e) {
                System.err.println("Erro: '" + numeroStr + "' não é um número válido.");
            }
        }
    }
    
    }

