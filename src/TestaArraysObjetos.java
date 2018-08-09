public class TestaArraysObjetos {
    public static void main(String[] args) {
        Carro[] carros = new Carro[5];

        Carro carro1 = new Carro("verde","HB20",120);
//        carro1.setCor("verde");
//        carro1.setModelo("HB20");
//        carro1.setVelocidadeMaxima(120);

        Carro carro2 = new Carro("branco", "BMW", 320);
//        carro2.setCor("branco");
//        carro2.setModelo("BMW");
//        carro2.setVelocidadeMaxima(320);

        carros[0] = carro1;
        carros[1] = carro2;

        carros[0].setCor("Preto");

        System.out.println("Carro1: " + carros[0].getCor());
        System.out.println("Carro2: " + carros[1].getCor());

        for(Carro carro: carros) {
            System.out.println("Carro: " + carro.getModelo());
        }
    }
}
