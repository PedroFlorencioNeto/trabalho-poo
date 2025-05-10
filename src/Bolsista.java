public class Bolsista extends Aluno{

    public Bolsista(String _cpf, String _nome, int _idade, String _matricula){
        super(_cpf, _nome, _idade, _matricula);
    }

    @Override // sobrecarga do metodo pagarMensalidade()
    public void pagarMensalidade() {
        System.out.println("Mensalidade do bolsista paga com desconto!");
    }

}