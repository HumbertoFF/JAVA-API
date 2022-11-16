package ufrn.br.ProjetoRestJustica.model.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ufrn.br.ProjetoRestJustica.model.generic.AbstractEntity;

import javax.persistence.Entity;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Usuario extends AbstractEntity {


    String nome;
    String email;
    String username ;
    String password;
    String role;


}
