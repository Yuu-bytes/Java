
package Package;



/**
 *
 * @author Yuu-bytes
 */
public class Main {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Professor professor = new Professor();
        
        aluno.setCpf("145155");
        aluno.setIdade(15);
        aluno.setMatricula(54534);
        aluno.setNome("Michael");
        aluno.setEspecial(false);
        
        professor.setNome("Mauricio");
        professor.setIdade(26);
        professor.setFormacao("Programação");
        professor.setCpf("145513");
        
        System.out.println("========================");
        System.out.println(aluno.getNome());
        System.out.println(aluno.getIdade());
        System.out.println(aluno.getCpf());
        System.out.println(aluno.getMatricula());
        System.out.println("========================");
        System.out.println("");
        System.out.println("========================");
        System.out.println(professor.getNome());
        System.out.println(professor.getIdade());
        System.out.println(professor.getFormacao());
        System.out.println(professor.getCpf());
        System.out.println("========================");
        
        
        
        
    }
    
}
