/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class AlunoEstadoMatriculado implements AlunoEstado{

    @Override
    public String matricular(Aluno aluno) {
        return "Aluno matriculado não pode matricular!";
    }

    @Override
    public String trancar(Aluno aluno) {
        return "Aluno trancado!";
    }

    @Override
    public String formar(Aluno aluno) {
        return "Aluno formado!";
    }

    @Override
    public String expulsar(Aluno aluno) {
        return "Aluno expulso!";
    }

    @Override
    public String jubilar(Aluno aluno) {
        return "Aluno jubilado!";
    }

    @Override
    public String evadir(Aluno aluno) {
        return "Aluno evadido!";
    }

}
