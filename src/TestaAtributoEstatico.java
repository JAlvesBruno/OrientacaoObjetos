public class TestaAtributoEstatico {
    public static void main(String[] args) {
        System.out.println("Quantidade de carros criados: " + Carro.getQuantidadeDeCarros());
        Carro carro1 = new Carro("Branco", "c4",140);
        Carro carro2 = new Carro("Vermelho", "Uno", 100);
        System.out.println("Quantidade de carros criados: " + Carro.getQuantidadeDeCarros());
        /* variavel estatica tem o mesmo valor para todos os objetos da classe */
        System.out.println("MeuCarro1 Quantidade: " + carro1.getQuantidadeDeCarros());
        System.out.println("MeuCarro2 Quantidade: " + carro2.getQuantidadeDeCarros());

    }
}
