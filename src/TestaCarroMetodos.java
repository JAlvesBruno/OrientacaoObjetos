public class TestaCarroMetodos {

    public static void main(String[] args) {
        Carro meuCarro = new Carro("verde","HB20",120);
//        meuCarro.setCor("verde");
//        meuCarro.setModelo("HB20");
//        meuCarro.setVelocidadeMaxima(120);

        System.out.println("Meu Carro:");
        System.out.println("Cor: " + meuCarro.getCor());
        System.out.println("Modelo: " + meuCarro.getModelo());
        System.out.println("-V. atual: " + meuCarro.getVelocidadeAtual());

        meuCarro.ligar();
        meuCarro.acelera(110);

        System.out.println("Meu carro acelerando: " );
        System.out.println("-Cor: " + meuCarro.getCor());
        System.out.println("-Modelo: " + meuCarro.getModelo());
        System.out.println("-V atual: " + meuCarro.getVelocidadeAtual());




    }
}
