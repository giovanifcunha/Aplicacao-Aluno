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
   public void testMatriculado_Matricular(){
       assertEquals("Aluno trancado!", aluno.estado.trancar());
   }
   
   @Test
   public void testMatriculado_Trancar(){
       assertEquals("Aluno trancado!", aluno.estado.trancar());
   }
   
   @Test
   public void testMatriculado_Formar(){
       assertEquals("Aluno formado!", aluno.estado.formar());
   }
   
   @Test
   public void testMatriculado_Expulsar(){
       assertEquals("Aluno expulso!", aluno.estado.expulsar());
   }

   @Test
   public void testMatriculado_Jubilar(){ 
       assertEquals("Aluno jubilado!", aluno.estado.jubilar());
   }
   
   @Test
   public void testMatriculado_Evadir(){
       assertEquals("Aluno evadido!", aluno.estado.evadir());
   }

   @Test
   public void testTrancado_Matricular(){
       aluno.estado = new AlunoEstadoTrancado();
       assertEquals("Aluno matriculado!", aluno.estado.matricular());
   }   
   
   @Test
   public void testTrancado_Trancar(){
       assertEquals("Aluno trancado!", aluno.estado.trancar());
   }
   
   @Test
   public void testTrancado_Formar(){
       assertEquals("Aluno formado!", aluno.estado.formar());
   }
   
   @Test
   public void testTrancado_Expulsar(){
       assertEquals("Aluno expulso!", aluno.estado.expulsar());
   }

   @Test
   public void testTrancado_Jubilar(){ 
       assertEquals("Aluno jubilado!", aluno.estado.jubilar());
   }
   
   @Test
   public void testTrancado_Evadir(){
       assertEquals("Aluno evadido!", aluno.estado.evadir());
   }
   
   
}