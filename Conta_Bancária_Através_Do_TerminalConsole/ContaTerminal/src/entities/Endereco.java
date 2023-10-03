package entities;

public class Endereco {

    private String cidade;
    private String uf;
    private String rua;
    private String regiao;
    private Integer numero;
    private String complemento;

    public Endereco() {

    }

    public Endereco(String cidade, String uf, String rua, String regiao, Integer numero, String complemento) {
        this.cidade = cidade;
        this.uf = uf;
        this.rua = rua;
        this.regiao = regiao;
        this.numero = numero;
        this.complemento = complemento;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return this.uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getRua() {
        return this.rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getRegiao() {
        return this.regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public Integer getNumero() {
        return this.numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return this.complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}
