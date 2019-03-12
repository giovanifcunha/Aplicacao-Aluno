public class Aluno {
    String estado;

    public Aluno(){}
    
public String matricula(String estado){
    if (estado == "trancado" || estado == "evadido"){
        return "Aluno matriculado!";
    }
    return "Aluno " + estado + " não pode matricular!";
}

public String tranca(String estado){
    if (estado=="matriculado"){
        return "O aluno trancou a matrícula!";
    }
    return "Aluno " + estado + " não pode trancar!";
}

public String forma(String estado){
    if(estado=="matriculado"){
        return "O aluno formou!";
    }
    return "Aluno " + estado + " não pode formar!";
}

public String expulso(String estado){
    if(estado=="matriculado"){
        return "Aluno expulso!";
    }
    return "Aluno " + estado + " não pode ser expulso!";
}

public String jubila(String estado){
    if (estado == "matriculado" || estado == "evadido" || estado == "trancado"){
        return "Aluno jubilado!";
    }
    return "Aluno " + estado + " não pode ser jubilado!";
}
public String evade(String estado){
    if (estado == "matriculado" || estado == "trancado"){
        return "Aluno evadido!";
    }
    return "Aluno " + estado + " não pode evadir!";
}
}



