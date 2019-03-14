public class AlunoEstadoTrancado implements AlunoEstado{

    @Override
    public String matricular(Aluno aluno) {
         aluno.setEstado(new AlunoEstadoMatriculado());
        return "Aluno matriculado!";
    }

    @Override
    public String trancar(Aluno aluno) {
        return "Aluno trancado não pode trancar!";
    }

    @Override
    public String formar(Aluno aluno) {
        return "Aluno trancado não pode formar!";
    }

    @Override
    public String expulsar(Aluno aluno) {
        return "Aluno trancado não pode ser expulso!";
    }

    @Override
    public String jubilar(Aluno aluno) {
         aluno.setEstado(new AlunoEstadoJubilado());
        return "Aluno jubilado!";
    }

    @Override
    public String evadir(Aluno aluno) {
         aluno.setEstado(new AlunoEstadoEvadido());
        return "Aluno evadido!";
    }

}
