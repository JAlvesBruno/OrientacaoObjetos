public class TestaArrays {
    public static void main(String[] args) {

        String[] pessoas = new String[5];
        pessoas[0] = "Joao";
        pessoas[1] = "Maria";
        pessoas[2]  = "Felipe";
        pessoas[3] = "Jaqueline";
        pessoas[4] = "Carol";

        int[] idades = new int[5];
        idades[0] = 18;
        idades[1] = 20;
        idades[2] = 25;
        idades[3] = 17;
        idades[4] = 19;

        System.out.println(pessoas[2] + " - " + idades[3]);

        for(int i=0; i<pessoas.length; i++) {
            System.out.println("Pessoa: " + pessoas[i]);
        }

        for(int idade: idades) {
            System.out.println("Idade: " + idade);
        }
    }

}
