public class Vendedor implements Pessoa {

    private int id;
    private String nome;
    private float comissao;

    public Vendedor(int id, String nome, float comissao) {
        this.id = id;
        this.nome = nome;
        this.comissao = comissao;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public float getComissao() {
        return comissao;
    }

    public String aceitar(Visitante visitante) {
        return visitante.exibirVendedor(this);
    }
}