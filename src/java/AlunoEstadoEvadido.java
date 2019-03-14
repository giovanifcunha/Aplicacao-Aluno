

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class AlunoEstadoEvadido implements AlunoEstado{

    @Override
    public String matricular(Aluno aluno) {
        aluno.setEstado(new AlunoEstadoMatriculado());
        return "Aluno matriculado!";
    }

    @Override
    public String trancar(Aluno aluno) {
        return "Aluno evadido não pode trancar!";
    }

    @Override
    public String formar(Aluno aluno) {
        return "Aluno evadido não pode formar!";
    }

    @Override
    public String expulsar(Aluno aluno) {
        return "Aluno evadido não pode ser expulso!";
    }

    @Override
    public String jubilar(Aluno aluno) {
        aluno.setEstado(new AlunoEstadoJubilado());
        return "Aluno jubilado!";
    }

    @Override
    public String evadir(Aluno aluno) {
        return "Aluno evadido não pode evadir!";
    }

}

