package Classes;

public class Pet {
    // Atrubutos do Pet
    private int     idade;
    private long    id;
    private String  nome;
    private String  raca;
    private String  sexo;
    private String  cor;
    private String  obs;
    
    //Atributos de Relacionamento
    private Tutor tutorDoPet;
    
    //Contrutores

    public Pet() {
    }

    public Pet(int idade, long id, String nome, String raca, String sexo, String cor, String obs, Tutor tutorDoPet) {
        this.idade = idade;
        this.id = id;
        this.nome = nome;
        this.raca = raca;
        this.sexo = sexo;
        this.cor = cor;
        this.obs = obs;
        this.tutorDoPet = tutorDoPet;
    }


    
    // Metodos
    
    
    //Get and Setters

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
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Tutor getTutorDoPet() {
        return tutorDoPet;
    }

    public void setTutorDoPet(Tutor tutorDoPet) {
        this.tutorDoPet = tutorDoPet;
    }


    
    
}
