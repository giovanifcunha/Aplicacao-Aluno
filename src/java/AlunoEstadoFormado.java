/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class AlunoEstadoFormado implements AlunoEstado{

    @Override
    public String matricular() {
        return "Aluno formado não pode matricular!";
    }

    @Override
    public String trancar() {
        return "Aluno formado não pode trancar!";
    }

    @Override
    public String formar() {
        return "Aluno formado não pode formar!";
    }

    @Override
    public String expulsar() {
        return "Aluno formado não pode ser formado!";
    }

    @Override
    public String jubilar() {
        return "Aluno formado não pode ser jubilado!";
    }

    @Override
    public String evadir() {
        return "Aluno formado não pode evadir!";
    }

}
