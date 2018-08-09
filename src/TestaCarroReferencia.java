public class TestaCarroReferencia {

    public static void main(String[] args) {
        Carro meuCarro = new Carro("Vermelho", "Ka", 100);

        meuCarro.setCor("Vermelho");
        meuCarro.setModelo("Ka");
        meuCarro.setVelocidadeMaxima(100);

        Carro amigoCarro = meuCarro;

//        amigoCarro.cor = "Vermelho";
//        amigoCarro.modelo = "Ka";
//        amigoCarro.velocidadeMaxima = 100;

        System.out.println("Meu carro:" + meuCarro.getCor() + " - " + meuCarro.getModelo());
        System.out.println("AmigoCarro:" + amigoCarro.getCor() + " - " + amigoCarro.getModelo());

        if(meuCarro == amigoCarro) {
            System.out.println("Sao iguais");
        } else {
            System.out.println("Nao sao iguais");
        }

    }
}
