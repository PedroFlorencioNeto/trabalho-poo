public class Main {
    public static void main(String[] args) {
        Disciplina disciplina_1 = new Disciplina("01","POO","2025.1");
        Disciplina disciplina_2 = new Disciplina("02","Raciocinio Logico", "2025.1");
        Disciplina disciplina_3 = new Disciplina("03", "Matematica", "2025.1");

        Regular regular_1 = new Regular("123","Felipe",30,"01");
        Regular regular_2 = new Regular("345","Fernanda",25,"02");
        Bolsista bolsista_1 = new Bolsista("678","Pedro",30,"03");

        Professor professor_1 = new Professor("546","Andre",36);

        Visitante visitante_1 = new Visitante("537","Joao",23);
        Visitante visitante_2 = new Visitante("567","Luis",34);

        Turma turma_1 = new Turma();

        // PARAMOS AQUI
        /*turma_1.adicionarAluno(regular_1);
        turma_1.adicionarAluno(regular_2);
        turma_1.adicionarAluno(bolsista_1);*/

        turma_1.setProfessor(professor_1);

        turma_1.setDisciplina(disciplina_1);

        System.out.println("Hello!");

    }
}