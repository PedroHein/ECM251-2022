//Pedro Henrique Sant Anna Hein 20.00134-7
public class Veiculo {
    private String id;
    private int custo;
    private String tipo;

    public Veiculo(String id, int custo, String tipo) {
        this.id = id;
        this.custo = custo;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCusto() {
        return custo;
    }

    public void setCusto(int custo) {
        this.custo = custo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Veiculo [custo=" + custo + ", id=" + id + ", tipo=" + tipo + "]";
    }
}
