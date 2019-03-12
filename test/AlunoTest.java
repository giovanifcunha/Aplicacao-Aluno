import junit.framework.TestCase;
import org.junit.Test;

public class AlunoTest extends TestCase{
    public AlunoTest() {}
    
   Aluno aluno = new Aluno();
   
    @Override
   protected void setUp() throws Exception{
       aluno = new Aluno();
   }
  
    //---------- AlunoEstadoMatriculado ----------\\
   
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
   
    //---------- AlunoEstadoTrancado ----------\\
   
   @Test
   public void testTrancado_Matricular(){
       aluno.setEstado(new AlunoEstadoTrancado());
       assertEquals("Aluno matriculado!", aluno.estado.matricular());
   }   
   
   @Test
   public void testTrancado_Trancar(){
       aluno.setEstado(new AlunoEstadoTrancado());
       assertEquals("Aluno trancado não pode trancar!", aluno.estado.trancar());
   }
   
   @Test
   public void testTrancado_Formar(){
       aluno.setEstado(new AlunoEstadoTrancado());
       assertEquals("Aluno trancado não pode formar!", aluno.estado.formar());
   }
   
   @Test
   public void testTrancado_Expulsar(){
       aluno.setEstado(new AlunoEstadoTrancado());
       assertEquals("Aluno trancado não pode ser expulso!", aluno.estado.expulsar());
   }

   @Test
   public void testTrancado_Jubilar(){ 
       aluno.setEstado(new AlunoEstadoTrancado());
       assertEquals("Aluno jubilado!", aluno.estado.jubilar());
   }
   
   @Test
   public void testTrancado_Evadir(){
       aluno.setEstado(new AlunoEstadoTrancado());
       assertEquals("Aluno evadido!", aluno.estado.evadir());
   }
   
    //---------- AlunoEstadoEvadido ----------\\
   
   @Test
   public void testEvadido_Matricular(){
       aluno.setEstado(new AlunoEstadoEvadido());
       assertEquals("Aluno matriculado!", aluno.estado.matricular());
   }
   
   @Test
   public void testEvadido_Trancar(){
       aluno.setEstado(new AlunoEstadoEvadido());
       assertEquals("Aluno evadido não pode trancar!", aluno.estado.trancar());
   }
   
   @Test
   public void testEvadido_Formar(){
       aluno.setEstado(new AlunoEstadoEvadido());
       assertEquals("Aluno evadido não pode formar!", aluno.estado.formar());
   }
   
   @Test
   public void testEvadido_Expulsar(){
       aluno.setEstado(new AlunoEstadoEvadido());
       assertEquals("Aluno evadido não pode ser expulso!", aluno.estado.expulsar());
   }
   
   @Test
   public void testEvadido_Jubilar(){
       aluno.setEstado(new AlunoEstadoEvadido());
       assertEquals("Aluno jubilado!", aluno.estado.jubilar());
   }
   
   @Test
   public void testEvadido_Evadir(){
       aluno.setEstado(new AlunoEstadoEvadido());
       assertEquals("Aluno evadido não pode evadir!", aluno.estado.evadir());
   }
   
   //---------- AlunoEstadoExpulso ----------\\
   
   @Test
   public void testExpulso_Matricular(){
       aluno.setEstado(new AlunoEstadoExpulso());
       assertEquals("Aluno expulso não pode matricular!", aluno.estado.matricular());
   }
   
   @Test
   public void testExpulso_Trancar(){
       aluno.setEstado(new AlunoEstadoExpulso());
       assertEquals("Aluno expulso não pode trancar!", aluno.estado.trancar());
   }
   
   @Test
   public void testExpulso_Formar(){
       aluno.setEstado(new AlunoEstadoExpulso());
       assertEquals("Aluno expulso não pode formar!", aluno.estado.formar());
   }
   
   @Test
   public void testExpulso_Expulsar(){
       aluno.setEstado(new AlunoEstadoExpulso());
       assertEquals("Aluno expulso não pode ser expulso!", aluno.estado.expulsar());
   }
   
   @Test
   public void testExpulso_Jubilar(){
       aluno.setEstado(new AlunoEstadoExpulso());
       assertEquals("Aluno expulso não pode ser jubilado!", aluno.estado.jubilar());
   }
   
   @Test
   public void testExpulso_Evadir(){
       aluno.setEstado(new AlunoEstadoExpulso());
       assertEquals("Aluno expulso não pode evadir!", aluno.estado.evadir());
   }
   
   //---------- AlunoEstadoFormado ----------\\
   
   @Test
   public void testFormado_Matricular(){
       aluno.setEstado(new AlunoEstadoFormado());
       assertEquals("Aluno formado não pode matricular!", aluno.estado.matricular());
   }
   
   @Test
   public void testFormado_Trancar(){
       aluno.setEstado(new AlunoEstadoFormado());
       assertEquals("Aluno formado não pode trancar!", aluno.estado.trancar());
   }
   
   @Test
   public void testFormado_Formar(){
       aluno.setEstado(new AlunoEstadoFormado());
       assertEquals("Aluno formado não pode formar!", aluno.estado.formar());
   }
   
   @Test
   public void testFormado_Expulsar(){
       aluno.setEstado(new AlunoEstadoFormado());
       assertEquals("Aluno formado não pode ser expulso!", aluno.estado.expulsar());
   }
   
   @Test
   public void testFormado_Jubilar(){
       aluno.setEstado(new AlunoEstadoFormado());
       assertEquals("Aluno formado não pode ser jubilado!", aluno.estado.jubilar());
   }
   
   @Test
   public void testFormado_Evadir(){
       aluno.setEstado(new AlunoEstadoFormado());
       assertEquals("Aluno formado não pode evadir!", aluno.estado.evadir());
   }
   
   //---------- AlunoEstadoJubilado ----------\\
   
   @Test
   public void testJubilado_Matricular(){
       aluno.setEstado(new AlunoEstadoJubilado());
       assertEquals("Aluno jubilado não pode matricular!", aluno.estado.matricular());
   }
   
   @Test
   public void testJubilado_Trancar(){
       aluno.setEstado(new AlunoEstadoJubilado());
       assertEquals("Aluno jubilado não pode trancar!", aluno.estado.trancar());
   }
   
   @Test
   public void testJubilado_Formar(){
       aluno.setEstado(new AlunoEstadoJubilado());
       assertEquals("Aluno jubilado não pode formar!", aluno.estado.formar());
   }
   
   @Test
   public void testJubilado_Expulsar(){
       aluno.setEstado(new AlunoEstadoJubilado());
       assertEquals("Aluno jubilado não pode ser expulso!", aluno.estado.expulsar());
   }
   
   @Test
   public void testJubilado_Jubilar(){
       aluno.setEstado(new AlunoEstadoJubilado());
       assertEquals("Aluno jubilado não pode ser jubilado!", aluno.estado.jubilar());
   }
   
   @Test
   public void testJubilado_Evadir(){
       aluno.setEstado(new AlunoEstadoJubilado());
       assertEquals("Aluno jubilado não pode evadir!", aluno.estado.evadir());
   }
   
}