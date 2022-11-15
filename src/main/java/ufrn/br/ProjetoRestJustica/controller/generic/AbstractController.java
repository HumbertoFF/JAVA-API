package ufrn.br.ProjetoRestJustica.controller.generic;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ufrn.br.ProjetoRestJustica.model.generic.AbstractEntity;
import ufrn.br.ProjetoRestJustica.service.generic.InterfaceGenericService;

import java.net.URI;
import java.util.List;
import java.util.Objects;

public class AbstractController< E extends AbstractEntity, S extends InterfaceGenericService<E>> implements InterfaceGenericController<E>{

    protected final S service;

    public AbstractController(S service) {
        this.service = service;
    }
    @Override
    @GetMapping
    public List<E> listAll(){
        return service.listAll();
    }

    @Override
    @PostMapping
    public ResponseEntity<E> create(@RequestBody E e) {
        service.create(e);
        return ResponseEntity.created(URI.create("/"+e.getClass().getSimpleName().toLowerCase()+"s/"+e.getId())).body(e);
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<E> findById(@PathVariable Long id) {
        E entity = (E)  service.findById(id);
        entity.add(
                linkTo(AbstractController.class)
                        .slash(entity.getClass().getSimpleName().toLowerCase()+"s/"+entity.getId())
                        .withSelfRel()

        );
        entity.add(
                linkTo(AbstractController.class)
                        .slash(entity.getClass().getSimpleName().toLowerCase()+"s/"+entity.getId())
                        .withRel("delete")

        );
        return (ResponseEntity<E>) ResponseEntity.ok().body(service.findById(id));
    }

    @Override
    @PutMapping("/{id}")
    public ResponseEntity<E> update(@PathVariable Long id, @RequestBody E e) {
        if(!Objects.equals(id, e.getId())){
        return ResponseEntity.badRequest().build();
        }
        service.findById(id);

        service.update(e);

        return ResponseEntity.ok().body(e);
    }


    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        E e = (E) service.findById(id);
        service.delete(e);
        return ResponseEntity.status(202).build();
    }
}
