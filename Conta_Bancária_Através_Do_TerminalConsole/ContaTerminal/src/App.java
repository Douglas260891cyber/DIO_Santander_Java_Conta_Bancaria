import controllers.CadastroController;
import entities.Usuario;
import enums.ContaTipo;

public class App {
    public static void main(String[] args) throws Exception {
        CadastroController c = new CadastroController();
        try { 
            Usuario<ContaTipo> u = c.cadastrar();
            if (u != null) 
                System.out.println("Conta criada com sucesso!");
        } catch (Exception e) {
            throw new Exception("Erro ao criar a conta! " + e.getMessage());
        }
    }
}
