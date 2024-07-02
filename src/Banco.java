import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Banco {

    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        setNome(nome);
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do banco não pode ser nulo ou vazio");
        }
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return Collections.unmodifiableList(contas);
    }

    public void adicionarConta(Conta conta) {
        if (conta == null) {
            throw new IllegalArgumentException("A conta não pode ser nula");
        }
        contas.add(conta);
    }

    public void removerConta(Conta conta) {
        if (conta == null) {
            throw new IllegalArgumentException("A conta não pode ser nula");
        }
        contas.remove(conta);
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nome='" + nome + '\'' +
                ", contas=" + contas +
                '}';
    }
}