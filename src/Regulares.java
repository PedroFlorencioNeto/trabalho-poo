public class Regulares extends Aluno{
    //Construtor
    public Regulares(String nome, int idade, String cpf, int matricula) {
        //Chama o construtor da classe Aluno(Classe Pai)
        super(nome, idade, cpf, matricula);
    }


    public void pagarMensalidade () {
        System.out.println("Precisa pagar mensalidade, pois é aluno regular");
    }
}
