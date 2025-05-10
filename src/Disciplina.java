public class Disciplina{
    protected String codigo;
    protected String nome;
    protected String semestre;

    public Disciplina(String _codigo, String _nome, String _semestre){
        codigo = _codigo;
        nome = _nome;
        semestre = _semestre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
}
