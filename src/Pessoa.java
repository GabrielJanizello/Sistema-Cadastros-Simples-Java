public class Pessoa {
    // atributos privados
    private String nome;
    private int idade;
    private String email;

    // getter para nome
    public String getNome() {
        return nome;
    }

    // setter para nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    //getter para idade
    public int getIdade() {
        return idade;
    }

    // setter para idade com validação
    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida! A idade não pode ser negativa.");
        }
    }

    // getter para email
    public String getEmail() {
        return email;
    }

    // setters para email com validação
    public void setEmail(String email) {
        if (email == null || email.isEmpty()) {
            System.out.println("E-mail inválido: O campo está vazio.");
            return;
        }

        if (!email.contains("@") || !email.contains(".")) {
            System.out.println("E-mail inválido: formato incorreto.");
        }

        this.email = email;
    }
}
