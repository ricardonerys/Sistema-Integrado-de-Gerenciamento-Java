public class Paciente {
    // Atributos da classe
    private String nomePaciente;
    private int idade;
    private String sintoma;
    private boolean planoSaude;
    private String numeroContato;
    private String tipoSanguineo;
    
    public Paciente (String nomePaciente, int idade, String sintoma, boolean planoSaude, String numeroContato, String tipoSanguineo){
        // Construtor da classe
        this.nomePaciente = nomePaciente;
        this.idade = idade;
        this.sintoma = sintoma;
        this.planoSaude = false;
        this.numeroContato = numeroContato;
        this.tipoSanguineo = tipoSanguineo;
    }
    
    // Cria os gets e sets pra acessar os atributos (get para ler  set para editar)
        
    // Gets
    
    public String getNomePaciente() {
        return nomePaciente;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public String getSintoma() {
        return sintoma;
    }
    
    public boolean getPlanoSaude() {
        return planoSaude;
    }
    
    public String getNumeroContato() {
        return numeroContato;
    }
    
    public String getTipoSanguineo() {
        return tipoSanguineo;
    }
    
    // Sets
    
    public void setNomePaciente (String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }
    
    public void setIdade (int idade) {
        this.idade = idade;
    }
    
    public void setSintoma (String sintoma) {
        this.sintoma = sintoma;
    }
    
    public boolean isPlanoSaude (){
        return planoSaude;
    }
    
    public void setPlanoSaude (boolean planoSaude) {
        this.planoSaude = planoSaude;
    }
    
    public void setNumeroContato (String numeroContato) {
        this.numeroContato = numeroContato;
    }
    
    public void setTipoSanguineo (String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }
}