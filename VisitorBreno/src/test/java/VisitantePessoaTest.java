import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VisitantePessoaTest {

    @Test
    void deveExibirCliente() {
        Cliente cliente = new Cliente(1, "Ana", 1000.0f);

        VisitantePessoa visitante = new VisitantePessoa();
        assertEquals("Cliente{id=1, nome='Ana', saldo=1000.0}", visitante.exibir(cliente));
    }

    @Test
    void deveExibirVendedor() {
        Vendedor vendedor = new Vendedor(1, "Maria", 500.0f);

        VisitantePessoa visitante = new VisitantePessoa();
        assertEquals("Vendedor{id=1, nome='Maria', comissao=500.0}", visitante.exibir(vendedor));
    }

    @Test
    void deveExibirFuncionario() {
        Funcionario funcionario = new Funcionario(1, "Pedro", 5000.0f);

        VisitantePessoa visitante = new VisitantePessoa();
        assertEquals("Funcionário{código=1, nome='Pedro', salário=5000.0}", visitante.exibir(funcionario));
    }
}