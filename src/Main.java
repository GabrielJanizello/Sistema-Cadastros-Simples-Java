import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Sistema gerenciadorPessoas = new Sistema();

        int opcao;

        do {
            System.out.println("MENU CADASTROS SIMPLES");
            System.out.println("1 - Cadastrar Pessoa");
            System.out.println("2 - Listar Pessoas");
            System.out.println("3 - Excluir Pessoa Cadastrada");
            System.out.println("4 - Sair");
            opcao = entrada.nextInt();
            entrada.nextLine(); // consumir o enter

            switch (opcao) {
                case 1: {
                    System.out.println("Digite o nome da Pessoa: ");
                    String nome = entrada.nextLine();

                    System.out.println("Digite a idade da Pessoa: ");
                    int idade = entrada.nextInt();
                    entrada.nextLine();

                    System.out.println("Digite o email da Pessoa: ");
                    String email = entrada.nextLine();

                    Pessoa p = new Pessoa();
                    p.setNome(nome);
                    p.setIdade(idade);
                    p.setEmail(email);

                    gerenciadorPessoas.cadastrarPessoa(p);
                    break;
                }

                case 2: {
                    gerenciadorPessoas.listarPessoas();
                    break;
                }

                case 3: {
                    System.out.println("Digite o email da Pessoa a ser excluída: ");
                    String emailExcluir = entrada.nextLine();
                    gerenciadorPessoas.excluirPessoa(emailExcluir);
                    break;
                }

                case 4: {
                    System.out.println("Saindo do programa...");
                    break;
                }

                default: {
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
                }
            }
            System.out.println(); // linha em branco para separar interações
        } while (opcao != 4);

        entrada.close();
    }
}
