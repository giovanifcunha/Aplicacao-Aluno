public class AlunoEstadoTrancado implements AlunoEstado{

    @Override
    public String matricular() {
        return "Aluno matriculado!";
    }

    @Override
    public String trancar() {
        return "Aluno trancado não pode trancar!";
    }

    @Override
    public String formar() {
        return "Aluno trancado não pode formar!";
    }

    @Override
    public String expulsar() {
        return "Aluno trancado não pode ser expulso!";
    }

    @Override
    public String jubilar() {
        return "Aluno jubilado!";
    }

    @Override
    public String evadir() {
        return "Aluno evadido!";
    }

}
