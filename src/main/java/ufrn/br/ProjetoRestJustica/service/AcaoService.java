package ufrn.br.ProjetoRestJustica.service;

import org.springframework.stereotype.Service;
import ufrn.br.ProjetoRestJustica.model.Acao;
import ufrn.br.ProjetoRestJustica.repository.AcaoRepository;

import javax.persistence.Id;
import java.util.List;
import java.util.Optional;

@Service
public class AcaoService {
    private AcaoRepository repository;

    public AcaoService(AcaoRepository repository){
        this.repository = repository;
    }

    public Acao insert(Acao a){
        return repository.save(a);
    }
    public Acao update(Acao a){
        return repository.saveAndFlush(a);
    }
    public void delete(Acao a){
        repository.delete(a);
    }
    public void deleteById(Long id){
        repository.deleteById(id);
    }
    public List<Acao> listAll(){
        return repository.findAll();
    }
    public Optional<Acao> listById(Long id){
        return repository.findById(id);
    }


}
