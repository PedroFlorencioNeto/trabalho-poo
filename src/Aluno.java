public class Aluno extends Pessoa{

    protected String matricula;

    public Aluno(String _cpf, String _nome, int _idade, String matricula){
        super(_cpf, _nome, _idade);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void pagarMensalidade(){
        System.out.println("Mensalidade paga!");
    }
}
