public class TestaConstrutor {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Amarelo","Camaro",400);
//        meuCarro.setCor("Aamrelo");
//        meuCarro.setModelo("Camaro");
//        meuCarro.setVelocidadeMaxima(400);
        /* Ao criar um novo carro executo o construtor*/
        /* Utilidade do construtor: Forçar quem quer um objeto da sua classe
        instanciá-lo com parâmetros. Ou seja, o novo objeto não pode existir sem os parâmetros necessários
         */
        System.out.println("- Cor: " + meuCarro.getCor());
        System.out.println("- Modelo: " + meuCarro.getModelo());
        System.out.println("- Velocidade Máxima: " + meuCarro.getVelocidadeMaxima());




    }
}
