package ufrn.br.ProjetoRestJustica.model.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ufrn.br.ProjetoRestJustica.model.generic.AbstractEntity;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Endereco extends AbstractEntity {

    private String rua;

    private String numero;

    private String bairro;

    private String municipio;


    @OneToOne
    @JoinColumn(name = "cliente_id")
    private PessoaFisica pessoa_fisica;

    public String getEnderecoCompleto(Long id) {

        return ("Rua" + rua + ", "+numero+ ", " + bairro + ", " + municipio);
    }
}
