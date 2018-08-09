public class TestaAcesso {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.setCor("Branco");
        meuCarro.setModelo("c4");
        meuCarro.setVelocidadeAtual(0);
        /* Metodos que consigo ver com a instancia meuCarro fazem parte da interface da classe Carro */
        meuCarro.setVelocidadeMaxima(120);

        meuCarro.acelera(100);
        System.out.println("MeuCarro Acelerando: " + meuCarro.getVelocidadeAtual());
        System.out.println("MeuCarro modelo: " + meuCarro.getModelo());

        meuCarro.acelera(30);

        System.out.println("MeuCarro Acelerando: " + meuCarro.getVelocidadeAtual());

    }
}
