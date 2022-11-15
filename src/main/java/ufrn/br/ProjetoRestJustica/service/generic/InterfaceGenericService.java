package ufrn.br.ProjetoRestJustica.service.generic;

import ufrn.br.ProjetoRestJustica.model.generic.AbstractEntity;

import java.util.List;

public interface InterfaceGenericService <E extends AbstractEntity> {
    List<E> listAll();
    E create(E e);
    E findById(Long id);
    void update(E e);
    void delete(E e);

}
