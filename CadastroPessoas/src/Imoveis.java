public class Imoveis {
    private String endereco;
    private String tipo;
    private double valorAluguel;
    private int area;
    private boolean disponivel;

    public Imoveis(String endereco, String tipo, double valorAluguel, int area, boolean disponivel) {
        this.endereco = endereco;
        this.tipo = tipo;
        this.valorAluguel = valorAluguel;
        this.area = area;
        this.disponivel = disponivel;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "Endereço: " + endereco + ", Tipo: " + tipo + ", Valor do Aluguel: R$ " + valorAluguel + ", Área: " + area + " m², Disponível: " + disponivel;
    }
}
