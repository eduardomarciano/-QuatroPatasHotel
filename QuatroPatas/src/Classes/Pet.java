package Classes;

public class Pet {
    // Atrubutos do Pet
    private int     peso;
    private int     idade;
    private long    id;
    private String  Nome;
    private String  raca;
    private String  sexo;
    
    //Atributos de Relacionamento
    private Tutor tutorDoPet;
    
    //Contrutores

    public Pet() {
    }

    public Pet(int peso, int idade, long id, String Nome, String raca, String sexo, Tutor tutorDoPet) {
        this.peso = peso;
        this.idade = idade;
        this.id = id;
        this.Nome = Nome;
        this.raca = raca;
        this.sexo = sexo;
        this.tutorDoPet = tutorDoPet;
    }
    
    // Metodos
    
    
    //Get and Setters

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Tutor getTutorDoPet() {
        return tutorDoPet;
    }

    public void setTutorDoPet(Tutor tutorDoPet) {
        this.tutorDoPet = tutorDoPet;
    }
    
    
}
