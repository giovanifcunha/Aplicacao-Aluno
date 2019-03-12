/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class AlunoEstadoExpulso implements AlunoEstado{

    @Override
    public String matricular() {
        return "Aluno expulso não pode matricular!";
    }

    @Override
    public String trancar() {
        return "Aluno expulso não pode trancar!";
    }

    @Override
    public String formar() {
        return "Aluno expulso não pode formar!";
    }

    @Override
    public String expulsar() {
        return "Aluno expulso não pode ser expulso!";
    }

    @Override
    public String jubilar() {
        return "Aluno expulso não pode ser jubilado!";
    }

    @Override
    public String evadir() {
        return "Aluno expulso não pode evadir!";
    }

}

