public class Professor extends Pessoa{
    protected String centro;

    public Professor(String _cpf, String _nome, int _idade){
        super(_cpf, _nome, _idade);
    }

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

    public void darAula(){
        System.out.println("Aula dada!");
    }
}