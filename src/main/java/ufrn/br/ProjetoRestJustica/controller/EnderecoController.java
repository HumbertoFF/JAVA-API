package ufrn.br.ProjetoRestJustica.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ufrn.br.ProjetoRestJustica.controller.generic.AbstractController;
import ufrn.br.ProjetoRestJustica.model.pojo.Endereco;
import ufrn.br.ProjetoRestJustica.service.EnderecoService;
@RestController
@RequestMapping("/enderecos")
public class EnderecoController extends AbstractController<Endereco, EnderecoService> {
    public EnderecoController(EnderecoService service) {
        super(service);
    }
}
