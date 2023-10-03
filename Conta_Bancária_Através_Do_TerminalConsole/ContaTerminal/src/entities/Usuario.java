package entities;
public class Usuario<ContaBancaria> extends Endereco {
   private String nome;
   private Integer idade;
   private String nacionalidade;
   private Endereco endereco;
   private ContaBancaria conta; 

   public Usuario() {
   }

   public Usuario(String nome, Integer idade, String nacionalidade, Endereco endereco, ContaBancaria conta) {
      this.nome = nome;
      this.idade = idade;
      this.nacionalidade = nacionalidade;
      this.endereco = endereco;
      this.conta = conta;
   }

   public String getNome() {
      return this.nome;
   }

   public void setContaTipo(ContaBancaria conta) {
      this.conta = conta;
   }

   public ContaBancaria getContaTipo() {
      return this.conta;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public Integer getIdade() {
      return this.idade;
   }

   public void setIdade(Integer idade) {
      this.idade = idade;
   }

   public String getNacionalidade() {
      return this.nacionalidade;
   }

   public void setNacionalidade(String nacionalidade) {
      this.nacionalidade = nacionalidade;
   }

   public Endereco getEndereco() {
      return this.endereco;
   }

   public void setEndereco(Endereco endereco) {
      this.endereco = endereco;
   }

   @Override
   public String toString() {
      return "{" +
            " nome='" + getNome() + "'" +
            ", idade='" + getIdade() + "'" +
            ", nacionalidade='" + getNacionalidade() + "'" +
            ", endereco='" + getEndereco() + "'" +
            "}";
   }

}
