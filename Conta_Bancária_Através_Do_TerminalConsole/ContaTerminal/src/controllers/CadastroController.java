package controllers;

import java.util.Scanner;

import components.CadastroComponent;
import entities.Endereco;
import entities.Usuario;
import enums.ContaTipo;

public class CadastroController extends Usuario<ContaTipo> {

    Scanner sc = new Scanner(System.in);

    public Usuario<ContaTipo> cadastrar() {
        System.out.println("Olá! Para abrir uma conta é necessário obter algumas informações.");
        Usuario<ContaTipo> usuario = new Usuario<>();
        CadastroComponent component = new CadastroComponent();

        System.out.println(" ");
        System.out.println("****** DADOS PESSOAIS ******");
        System.out.println(" ");

        System.out.print("Nome completo: ");
        usuario.setNome(sc.nextLine());
        System.out.print("Nacionalidade: ");
        usuario.setNacionalidade(sc.nextLine());
        System.out.print("Idade: ");
        usuario.setIdade(sc.nextInt());

        component.limparTerminal();
        Endereco endereco = new Endereco();

        System.out.println(" ");
        System.out.println("****** ENDEREÇO ******");
        System.out.println(" ");

        System.out.print("Cidade: ");
        endereco.setCidade(sc.next());
        sc.nextLine();
        System.out.print("Estado: ");
        endereco.setUf(sc.nextLine());
        System.out.print("Rua: ");
        endereco.setRua(sc.next());
        System.out.print("Região: ");
        endereco.setRegiao(sc.next());
        System.out.print("Número: ");
        endereco.setNumero(sc.nextInt());
        
        if (endereco != null)
        usuario.setEndereco(endereco);
        
        component.limparTerminal();
        sc.nextLine();

        System.out.println("****** CONTA ******");
        System.out.println("");
        System.out.println("Informe o tipo da conta que será criada.");
        
        ContaTipo conta = null;
        System.out.println("1 - Conta corrente.");
        System.out.println("2 - Conta salário.");
        System.out.println("3 - Conta poupança.");
        Integer contaTipo = sc.nextInt();

        while (contaTipo != 1 || contaTipo != 2 || contaTipo != 3) {
            switch (contaTipo) {
                case 1:
                    conta = ContaTipo.CORRENTE;
                    break;
                case 2:
                    conta = ContaTipo.POUPANCA;
                    break;
                case 3:
                    conta = ContaTipo.SALARIO;
                    break;
                default:
                    System.out.println("Valor inválido. Informe uma das contas listadas");
            }
        }
        usuario.setContaTipo(conta != null ? conta : null);
        component.limparTerminal();

        return usuario;
    }
}
