package ufrn.br.ProjetoRestJustica.repository.generic;

import org.springframework.data.jpa.repository.JpaRepository;
import ufrn.br.ProjetoRestJustica.model.generic.AbstractEntity;

public interface GenericRepository <E extends AbstractEntity> extends JpaRepository<E, Long> {

}
