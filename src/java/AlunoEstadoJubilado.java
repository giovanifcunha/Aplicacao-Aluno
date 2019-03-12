/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class AlunoEstadoJubilado implements AlunoEstado{

    @Override
    public String matricular() {
        return "Aluno jubilado não pode matricular!";
    }

    @Override
    public String trancar() {
        return "Aluno jubilado não pode trancar!";
    }

    @Override
    public String formar() {
        return "Aluno jubilado não pode formar!";
    }

    @Override
    public String expulsar() {
        return "Aluno jubilado não pode ser expulso!";
    }

    @Override
    public String jubilar() {
        return "Aluno jubilado não pode ser jubilado!";
    }

    @Override
    public String evadir() {
        return "Aluno jubilado não pode evadir!";
    }

}