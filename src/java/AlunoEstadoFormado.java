/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class AlunoEstadoFormado implements AlunoEstado{

    @Override
    public String matricular(Aluno aluno) {
        return "Aluno formado não pode matricular!";
    }

    @Override
    public String trancar(Aluno aluno) {
        return "Aluno formado não pode trancar!";
    }

    @Override
    public String formar(Aluno aluno) {
        return "Aluno formado não pode formar!";
    }

    @Override
    public String expulsar(Aluno aluno) {
        return "Aluno formado não pode ser expulso!";
    }

    @Override
    public String jubilar(Aluno aluno) {
        return "Aluno formado não pode ser jubilado!";
    }

    @Override
    public String evadir(Aluno aluno) {
        return "Aluno formado não pode evadir!";
    }

}
