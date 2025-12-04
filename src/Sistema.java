import java.util.ArrayList;

public class Sistema {

    //lista para armazenar as pessoas
    private ArrayList<Pessoa> pessoas;

    // construtor: inicializa a lista
    public Sistema() {
        pessoas = new ArrayList<>();
    }

    // metodo para cadastrar uma pessoa com verificação de email duplicado
    public void cadastrarPessoa(Pessoa p){
        // verifica se já existe alguém com o mesmo email
        for (Pessoa pessoaExistente : pessoas) {
            if (pessoaExistente.getEmail().equalsIgnoreCase(p.getEmail())) {
                System.out.println("ERRO: já existe uma pessoa cadastrada com este email!");
                return; // sai do metodo sem adicionar
            }
        }

        // se não existe duplicado ele adiciona a pessoa
        pessoas.add(p);
        System.out.println("Pessoa cadastrada com sucesso!");
    }

    // metodo para listar todas as pessoas
    public void listarPessoas(){
        if (pessoas.isEmpty()){
            System.out.println("Nenhum Pessoa Cadastrada!");
            return;
        }

        System.out.println("Lista de pessoas cadastradas:");
        for (Pessoa p : pessoas){
            System.out.println("Nome: " + p.getNome());
            System.out.println("Idade: " + p.getIdade());
            System.out.println("Email: " + p.getEmail());
            System.out.println("------------------------");
        }
    }

    // metodo para excluir pessoa cadastrada através do email
    public void excluirPessoa(String email){
        boolean removida = false;

        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getEmail().equalsIgnoreCase(email)) {
                pessoas.remove(i);
                System.out.println("Pessoa com email " + email + " removida com sucesso!");
                removida = true;
                break;
            }
        }

        if (!removida) {
            System.out.println("Nenhuma pessoa encontrada com o email " + email);
        }
    }
}
