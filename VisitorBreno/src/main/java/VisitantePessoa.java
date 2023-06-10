public class VisitantePessoa implements Visitante {

    public String exibir(Pessoa pessoa) {
        return pessoa.aceitar(this);
    }

    @Override
    public String exibirCliente(Cliente cliente) {
        return "Cliente{" +
                "id=" + cliente.getId() +
                ", nome='" + cliente.getNome() + '\'' +
                ", saldo=" + cliente.getSaldo() +
                '}';
    }

    @Override
    public String exibirVendedor(Vendedor vendedor) {
        return "Vendedor{" +
                "id=" + vendedor.getId() +
                ", nome='" + vendedor.getNome() + '\'' +
                ", comissao=" + vendedor.getComissao() +
                '}';
    }

    @Override
    public String exibirFuncionario(Funcionario funcionario) {
        return "Funcionário{" +
                "código=" + funcionario.getCodigo() +
                ", nome='" + funcionario.getNome() + '\'' +
                ", salário=" + funcionario.getSalario() +
                '}';
    }
}
