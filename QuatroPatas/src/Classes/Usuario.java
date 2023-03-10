package Classes;

public abstract class Usuario {
    
    //Atributos do Usuário
    
    private String CPF;
    private String nome;
    private String login;
    private String senha;
   
    //Contrutores

    public Usuario() {
    }

    public Usuario(String CPF, String nome, String login, String senha) {
        this.CPF = CPF;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }
    
    
    // Metodos
  
    
    //Get and Setters

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
}
