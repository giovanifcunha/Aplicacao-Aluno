public class Aluno {
    AlunoEstado estado;

    public AlunoEstado getEstado() {
        return estado;
    }

    public void setEstado(AlunoEstado estado) {
        this.estado = estado;
    }

    public Aluno(){
       estado = new AlunoEstadoMatriculado();
    }
    
    public void matricular() {
        estado.matricular(this);
    }

    public void trancar() {
        estado.trancar(this);
    }
    
    public void formar(){
        estado.formar(this);
    }
    
    public void expulsar() {
        estado.expulsar(this);
    }
    
    public void jubilar() {
        estado.jubilar(this);
    }

    public void evadir() {
        estado.evadir(this);
    }
}



