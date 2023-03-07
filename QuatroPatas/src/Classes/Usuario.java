package Classes;

public abstract class Usuario {
    
    //Atributos do Usuário
    
    private String CPF;
    private String nome;
    private String telefone;
    private String email;
    private String login;
    private String senha;
   
    //Contrutores

    public Usuario() {
    }

    public Usuario(String CPF, String nome, String telefone, String email, String login, String senha) {
        this.CPF = CPF;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
