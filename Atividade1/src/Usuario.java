//Pedro Henrique Sant Anna Hein 20.00134-7
public class Usuario {
    private String nome;
    private Veiculo veiculo;
    public Usuario(String nome, String Veiculo) {
        this.nome = nome;
        this.veiculo = new Veiculo("12345", 10, Veiculo);
    }
    
    public String getNome() {
        return nome;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    @Override
    public String toString() {
        return "Usuario [nome=" + nome + ", veiculo=" + veiculo + "]";
    }
}
