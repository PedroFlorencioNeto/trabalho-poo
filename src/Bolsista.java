public class Bolsista extends Aluno{

    public Bolsista(String cpf, String nome, int idade, String matricula) {
        super(cpf, nome, idade, matricula);
    }

    // polimorfismo de sobreposicao do metodo pagarMensalidade
    public void pagarMensalidade() {
        System.out.println("Mensalidade do bolsista paga com desconto!");
    }

}