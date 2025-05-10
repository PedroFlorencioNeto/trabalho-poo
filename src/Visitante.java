public class Visitante extends Pessoa{
    public Visitante(String _cpf, String _nome, int _idade){
        super(_cpf, _nome, _idade);
    }

    public void exibeVisitante(){
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("CPF: "+cpf);
    }
}