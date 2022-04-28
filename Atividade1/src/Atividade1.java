//Pedro Henrique Sant Anna Hein 20.00134-7
public class Atividade1 {
    public static void run(){
        Usuario usuario1 = new Usuario("All Might", "Bicicleta");
        Usuario usuario2 = new Usuario("One For All", "Carro");

        usuario1.getVeiculo().testar("Moto");
        usuario2.getVeiculo().testar("Bicicleta");

        System.out.println("Usuario 1:" + usuario1.getVeiculo());
        System.out.println("Usuario 2:" + usuario2.getVeiculo());
    }

    @Override
    public String toString() {
        return "Atividade1 []";
    }

    public boolean testar(String tipo){
        this.tipo = tipo;
        return true;
    }
}


