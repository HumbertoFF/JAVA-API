package ufrn.br.ProjetoRestJustica.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ufrn.br.ProjetoRestJustica.controller.generic.AbstractController;
import ufrn.br.ProjetoRestJustica.model.pojo.Servidor;
import ufrn.br.ProjetoRestJustica.service.ServidorService;

@RestController
@RequestMapping("/servidor")
public class ServidorController extends AbstractController<Servidor, ServidorService> {
    public ServidorController(ServidorService service) {
        super(service);
    }
}
