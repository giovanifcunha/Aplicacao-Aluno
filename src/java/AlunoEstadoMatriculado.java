/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class AlunoEstadoMatriculado implements AlunoEstado{

    @Override
    public String matricular() {
        return "Aluno matriculado não pode matricular!";
    }

    @Override
    public String trancar() {
        return "Aluno trancado!";
    }

    @Override
    public String formar() {
        return "Aluno formado!";
    }

    @Override
    public String expulsar() {
        return "Aluno expulso!";
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
