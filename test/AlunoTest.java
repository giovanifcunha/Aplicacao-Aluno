import junit.framework.TestCase;
import org.junit.Test;

public class AlunoTest extends TestCase{
    public AlunoTest() {}
    
   Aluno aluno = new Aluno();
   
    @Override
   protected void setUp() throws Exception{
       aluno = new Aluno();
   }
   
    @Test
    public void testMatricula_Trancado() {
       assertEquals("Aluno matriculado!", aluno.matricula("trancado"));
    }
    
    @Test
    public void testMatricula_Evadido() {
       assertEquals("Aluno matriculado!", aluno.matricula("evadido"));
    }
    
    @Test
    public void testMatricula_Matriculado() {
       assertEquals("Aluno matriculado não pode matricular!", aluno.matricula("matriculado"));
    }
    
    @Test
    public void testMatricula_Expulso() {
       assertEquals("Aluno expulso não pode matricular!", aluno.matricula("expulso"));
    }
    
    @Test
    public void testMatricula_Formado() {
       assertEquals("Aluno formado não pode matricular!", aluno.matricula("formado"));
    }
    
    @Test
    public void testMatricula_Jubilado() {
       assertEquals("Aluno jubilado não pode matricular!", aluno.matricula("jubilado"));
    }
    
    @Test
    public void testTranca_Matriculado() {
       assertEquals("O aluno trancou a matrícula!", aluno.tranca("matriculado"));
    }
    
    @Test
    public void testTranca_Trancado() {
       assertEquals("Aluno trancado não pode trancar!", aluno.tranca("trancado"));
    }
    
    
    @Test
    public void testTranca_Formado() {
       assertEquals("Aluno formado não pode trancar!", aluno.tranca("formado"));
    }
    
    @Test
    public void testTranca_Expulso() {
       assertEquals("Aluno expulso não pode trancar!", aluno.tranca("expulso"));
    }
    
    @Test
    public void testTranca_Jubilado() {
       assertEquals("Aluno jubilado não pode trancar!", aluno.tranca("jubilado"));
    }
    
    @Test
    public void testTranca_Evadido() {
       assertEquals("Aluno evadido não pode trancar!", aluno.tranca("evadido"));
    }
    
    @Test
    public void testForma_Matriculado() {
       assertEquals("O aluno formou!", aluno.forma("matriculado"));
    }
    
    @Test
    public void testForma_Formado() {
       assertEquals("Aluno formado não pode formar!", aluno.forma("formado"));
    }
    
    @Test
    public void testForma_Trancado() {
       assertEquals("Aluno trancado não pode formar!", aluno.forma("trancado"));
    }
    
    @Test
    public void testForma_Expulso() {
       assertEquals("Aluno expulso não pode formar!", aluno.forma("expulso"));
    }
    
    @Test
    public void testForma_Jubilado() {
       assertEquals("Aluno jubilado não pode formar!", aluno.forma("jubilado"));
    }
    
    @Test
    public void testForma_Evadido() {
       assertEquals("Aluno evadido não pode formar!", aluno.forma("evadido"));
    }
    
    @Test
    public void testExpulso_Matriculado() {
       assertEquals("Aluno expulso!", aluno.expulso("matriculado"));
    }
    
    @Test
    public void testExpulso_Expulso() {
       assertEquals("Aluno expulso não pode ser expulso!", aluno.expulso("expulso"));
    }
    
    @Test
    public void testExpulso_Trancado() {
       assertEquals("Aluno trancado não pode ser expulso!", aluno.expulso("trancado"));
    }
    
    @Test
    public void testExpulso_Formado() {
       assertEquals("Aluno formado não pode ser expulso!", aluno.expulso("formado"));
    }
    
    @Test
    public void testExpulso_Jubilado() {
       assertEquals("Aluno jubilado não pode ser expulso!", aluno.expulso("jubilado"));
    }
    
    @Test
    public void testExpulso_Evadido() {
       assertEquals("Aluno evadido não pode ser expulso!", aluno.expulso("evadido"));
    }

    @Test
    public void testJubila_Matriculado() {
       assertEquals("Aluno jubilado!", aluno.jubila("matriculado"));
    }
    
    @Test
    public void testJubila_Evadido() {
       assertEquals("Aluno jubilado!", aluno.jubila("evadido"));
    }
    
    @Test
    public void testJubila_Trancado() {
       assertEquals("Aluno jubilado!", aluno.jubila("trancado"));
    }
    
    @Test
    public void testJubila_Jubilado() {
       assertEquals("Aluno jubilado não pode ser jubilado!", aluno.jubila("jubilado"));
    }
    
    @Test
    public void testJubila_Formado() {
       assertEquals("Aluno formado não pode ser jubilado!", aluno.jubila("formado"));
    }
    
    @Test
    public void testJubila_Expulso() {
       assertEquals("Aluno expulso não pode ser jubilado!", aluno.jubila("expulso"));
    }
    
    @Test
    public void testEvade_Matriculado() {
       assertEquals("Aluno evadido!", aluno.evade("matriculado"));
    }
    
    @Test
    public void testEvade_Trancado() {
       assertEquals("Aluno evadido!", aluno.evade("trancado"));
    }
    
    @Test
    public void testEvade_Evadido() {
       assertEquals("Aluno evadido não pode evadir!", aluno.evade("evadido"));
    }
    
    
    @Test
    public void testEvade_Formado() {
       assertEquals("Aluno formado não pode evadir!", aluno.evade("formado"));
    }
    
    @Test
    public void testEvade_Expulso() {
       assertEquals("Aluno expulso não pode evadir!", aluno.evade("expulso"));
    }
    
    @Test
    public void testEvade_Jubilado() {
       assertEquals("Aluno jubilado não pode evadir!", aluno.evade("jubilado"));
    }
}
