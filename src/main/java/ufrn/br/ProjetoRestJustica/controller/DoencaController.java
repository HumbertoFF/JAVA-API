package ufrn.br.ProjetoRestJustica.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ufrn.br.ProjetoRestJustica.controller.generic.AbstractController;
import ufrn.br.ProjetoRestJustica.model.pojo.Doenca;
import ufrn.br.ProjetoRestJustica.service.DoencaService;

@RestController
@RequestMapping("/doenca")
public class DoencaController extends AbstractController<Doenca, DoencaService> {

    public DoencaController(DoencaService service) {
        super(service);
    }
}
