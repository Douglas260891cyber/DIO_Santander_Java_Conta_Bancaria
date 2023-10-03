package entities;

import java.util.Random;

public class ContaBancaria<ContaTipo> {
    private Integer agencia;
    private Integer conta;
    private ContaTipo tipo;

    public ContaBancaria() {
    }

    public ContaBancaria(Integer agencia, ContaTipo tipo) {
        this.agencia = agencia;
        this.conta = gerarNumeroConta();
        this.tipo = tipo;
    }

    public Integer getAgencia() {
        return this.agencia;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }

    public Integer getConta() {
        return this.conta;
    }

    public void setConta(Integer conta) {
        this.conta = conta;
    }

    public ContaTipo getTipo() {
        return this.tipo;
    }

    public void setTipo(ContaTipo tipo) {
        this.tipo = tipo;
    }

    public Integer gerarNumeroConta() {
        Random random = new Random();
        Integer valorRandomico = random.nextInt(1000);
        return valorRandomico;
    }
}
