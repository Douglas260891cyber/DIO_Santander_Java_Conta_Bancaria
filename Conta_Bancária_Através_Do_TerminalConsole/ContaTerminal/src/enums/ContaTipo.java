package enums;
// Definindo um enum com descrição
public enum ContaTipo {
    CORRENTE(1, "Conta Corrente"),
    POUPANCA(2, "Conta Poupança"),
    SALARIO(3, "Conta Salário");

    private final Integer tipo;
    private final String descricao;

    ContaTipo(Integer tipo, String descricao) {
        this.tipo = tipo;
        this.descricao = descricao;
    }

    public Integer gettTipo() {
        return tipo;
    }

    public String getDescricao() {
        return descricao;
    }
}


