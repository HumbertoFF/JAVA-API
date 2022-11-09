package ufrn.br.ProjetoRestJustica.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ufrn.br.ProjetoRestJustica.model.Acao;
import ufrn.br.ProjetoRestJustica.service.AcaoService;

import java.net.URI;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/acao")
public class AcaoController {

    private AcaoService service;
    public AcaoController(AcaoService service){
        this.service = service;
    }

    @GetMapping
    public List<Acao> listAll(){
        return service.listAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Acao> listById(@PathVariable Long id){
        Optional<Acao> acao = service.listById(id);
        if(acao.isEmpty()){
             return ResponseEntity.notFound().build();
        }else {
            Acao a = acao.get();
            return ResponseEntity.ok().body(a);
        }
    }

    @PostMapping
    public ResponseEntity<Acao> insert(@RequestBody Acao a){

        service.insert(a);

        return ResponseEntity.created(URI.create("/acao/"+ a.getId())).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Acao> update(@PathVariable  Long id,@RequestBody Acao a){
        if(!Objects.equals(id, a.getId())){
            return ResponseEntity.badRequest().build();
        }
        return service
                .listById(id)
                .map( data -> {
                    service.update(a);
                    return ResponseEntity.ok().body(a);
        }) .orElse(ResponseEntity.notFound().build()
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleta(@PathVariable  Long id){
       return service.listById(id).map( data -> {service.delete(data);
                           return ResponseEntity.status(202).build();
                       }) .orElse(ResponseEntity.notFound().build()
       );
    }

}
