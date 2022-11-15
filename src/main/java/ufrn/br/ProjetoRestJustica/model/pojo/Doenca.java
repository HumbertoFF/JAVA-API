package ufrn.br.ProjetoRestJustica.model.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ufrn.br.ProjetoRestJustica.model.generic.AbstractEntity;
import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Doenca extends AbstractEntity {

    private String codigo;
    private String nome;
}
