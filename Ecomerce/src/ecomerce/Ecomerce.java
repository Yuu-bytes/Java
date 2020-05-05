
package ecomerce;


public class Ecomerce {
    
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.setNome("TV LG");
        p1.setMarca("LG");
        String p1Nome = p1.getNome();
        System.out.println(p1Nome);
        
        Professor prof = new Professor();
        prof.setNome("Maurício");
        
        Aluno aluno = new Aluno();
        aluno.setMatricula("0066053");
        aluno.setNome("Francisco");
    }
    
}
