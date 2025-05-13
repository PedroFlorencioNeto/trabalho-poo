public class Aluno extends Pessoa{

    // atributo unico que representa um aluno
    protected String matricula;

    // metodo construtor da classe Aluno
    public Aluno(String cpf, String nome, int idade, String matricula) {
        super(cpf, nome, idade);
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
