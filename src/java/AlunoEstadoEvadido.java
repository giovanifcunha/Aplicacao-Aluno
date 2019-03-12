/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class AlunoEstadoEvadido implements AlunoEstado{

    @Override
    public String matricular() {
        return "Aluno matriculado!";
    }

    @Override
    public String trancar() {
        return "Aluno evadido não pode trancar!";
    }

    @Override
    public String formar() {
        return "Aluno evadido não pode formar!";
    }

    @Override
    public String expulsar() {
        return "Aluno evadido não pode ser expulso!";
    }

    @Override
    public String jubilar() {
        return "Aluno jubilado!";
    }

    @Override
    public String evadir() {
        return "Aluno evadido não pode evadir!";
    }

}

