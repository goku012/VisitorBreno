public class Cliente implements Pessoa {

    private int id;
    private String nome;
    private float saldo;

    public Cliente(int id, String nome, float saldo) {
        this.id = id;
        this.nome = nome;
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public String aceitar(Visitante visitante) {
        return visitante.exibirCliente(this);
    }
}