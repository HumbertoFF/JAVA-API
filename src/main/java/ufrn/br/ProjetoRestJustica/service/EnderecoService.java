package ufrn.br.ProjetoRestJustica.service;

import org.springframework.stereotype.Service;
import ufrn.br.ProjetoRestJustica.model.pojo.Endereco;
import ufrn.br.ProjetoRestJustica.repository.EnderecoRepository;
import ufrn.br.ProjetoRestJustica.service.generic.AbstractService;
@Service
public class  EnderecoService extends AbstractService<Endereco, EnderecoRepository> {
    public EnderecoService(EnderecoRepository repository){
        super(repository);
    }
}
