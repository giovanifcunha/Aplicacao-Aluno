public class Aluno {
    AlunoEstado estado;

    public Aluno(){
       estado = new AlunoEstadoMatriculado();
    }
    
    public void matricular() {
        estado.matricular();
    }

    public void trancar() {
        estado.trancar();
    }
    
    public void formar(){
        estado.formar();
    }
    
    public void expulsar() {
        estado.expulsar();
    }
    
    public void jubilar() {
        estado.jubilar();
    }

    public void evadir() {
        estado.evadir();
    }
}



