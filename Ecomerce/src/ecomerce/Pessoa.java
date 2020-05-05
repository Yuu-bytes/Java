
package ecomerce;

import java.util.Date;

public class Pessoa {
    private String Nome;
    private Date Nascimento;

    /**
     * @return the Nome
     */
    public String getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * @return the Nascimento
     */
    public Date getNascimento() {
        return Nascimento;
    }

    /**
     * @param Nascimento the Nascimento to set
     */
    public void setNascimento(Date Nascimento) {
        this.Nascimento = Nascimento;
    }
}
