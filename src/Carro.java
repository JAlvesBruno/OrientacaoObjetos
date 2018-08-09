public class Carro {

    private static int quantidadeDeCarros;

    private String cor;
    private String modelo;
    /* proteger variavel: encapsular */
    /* Encapsular é só mostrar os métodos para quem se utiliza da classe */
    /* Isso se chama interface da classe */
    /* Atributos e corpo dos métodos ninguém consegue ver fora da classe */
    /* Isso faz parte da implementação */
    private double velocidadeAtual;
    private double velocidadeMaxima;
    private boolean ehConversivel;

    public Carro(String cor, String modelo, double velocidadeMaxima) {
        this.cor = cor;
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
        System.out.println("Criando um carro.");
        Carro.quantidadeDeCarros += 1;
    }

    /* Posso ter mais de um construtor */
    public Carro() {
        System.out.println("Criando um carro.");
        Carro.quantidadeDeCarros += 1;
    }

    public void ligar() {
        System.out.println("Carro ligado");
    }

    public void acelera(double velocidade) {
        double novaVelocidade = this.velocidadeAtual + velocidade;
        if(verificaVelocidadeMaxima(novaVelocidade)) {
            this.velocidadeAtual = novaVelocidade;
        } else {
            System.out.println("Velocidade máxima atingida");
        }


    }

    public double getVelocidadeAtual() {
        return this.velocidadeAtual;
    }

    public String getCor() {
        return this.cor;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    private boolean verificaVelocidadeMaxima(double velocidade) {
        return velocidade < velocidadeMaxima;
    }

    public static int getQuantidadeDeCarros() {
        return Carro.quantidadeDeCarros;
    }
}
