package ufrn.br.ProjetoRestJustica.service;

import org.springframework.stereotype.Service;
import ufrn.br.ProjetoRestJustica.model.pojo.Servidor;
import ufrn.br.ProjetoRestJustica.repository.ServidorRepository;
import ufrn.br.ProjetoRestJustica.service.generic.AbstractService;
@Service
public class ServidorService extends AbstractService<Servidor, ServidorRepository> {
    public ServidorService(ServidorRepository repository) {
        super(repository);
    }
}
