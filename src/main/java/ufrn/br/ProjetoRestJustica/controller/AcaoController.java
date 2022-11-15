package ufrn.br.ProjetoRestJustica.controller;
import org.springframework.web.bind.annotation.*;
import ufrn.br.ProjetoRestJustica.controller.generic.AbstractController;
import ufrn.br.ProjetoRestJustica.model.Acao;
import ufrn.br.ProjetoRestJustica.service.AcaoService;

@RestController
@RequestMapping("/acao")
public class AcaoController extends AbstractController<Acao, AcaoService> {

    public AcaoController(AcaoService service) {
        super(service);
    }
}
