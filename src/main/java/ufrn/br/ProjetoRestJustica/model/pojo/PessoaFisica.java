package ufrn.br.ProjetoRestJustica.model.pojo;

import lombok.*;
import ufrn.br.ProjetoRestJustica.model.generic.AbstractEntity;
import ufrn.br.ProjetoRestJustica.model.Acao;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class PessoaFisica extends AbstractEntity {

    @NotBlank(message = "É necessário preencher o nome")
    private String name;
    @Email(message = "e-mail não válido")
    private String email;

    @OneToMany(mappedBy = "solicitante", fetch = FetchType.LAZY, orphanRemoval = true,
    cascade = CascadeType.ALL)
    private List<Acao> acao = new ArrayList<>();

    public PessoaFisica(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void addAcao(Acao inseriracao){
        acao.add(inseriracao);
        inseriracao.setSolicitante(this);
    }

}
