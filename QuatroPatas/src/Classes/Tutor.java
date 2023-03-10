package Classes;

public class Tutor {
    //Atributos do Tutor
    private String nome;
    private String endereco;
    private String telefone;
    private String nomeContatoEmergencia;
    private String NumeroContatoEmergencia;
    
    // Atributo de Relacionamento
    private Pet petDoTutor;
    
    //Contrutores

    public Tutor() {
    }

    public Tutor(String nome, String telefone, String nomeContatoEmergencia, String NumeroContatoEmergencia, Pet petDoTutor) {
        this.nome = nome;
        this.telefone = telefone;
        this.nomeContatoEmergencia = nomeContatoEmergencia;
        this.NumeroContatoEmergencia = NumeroContatoEmergencia;
        this.petDoTutor = petDoTutor;
    }
    
    // Metodos
    
    
    //Get and Setters
    
    
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

    public String getNomeContatoEmergencia() {
        return nomeContatoEmergencia;
    }

    public void setNomeContatoEmergencia(String nomeContatoEmergencia) {
        this.nomeContatoEmergencia = nomeContatoEmergencia;
    }

    public String getNumeroContatoEmergencia() {
        return NumeroContatoEmergencia;
    }

    public void setNumeroContatoEmergencia(String NumeroContatoEmergencia) {
        this.NumeroContatoEmergencia = NumeroContatoEmergencia;
    }

    public Pet getPetDoTutor() {
        return petDoTutor;
    }

    public void setPetDoTutor(Pet petDoTutor) {
        this.petDoTutor = petDoTutor;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
}
