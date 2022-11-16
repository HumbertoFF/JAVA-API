package ufrn.br.ProjetoRestJustica.repository;

import ufrn.br.ProjetoRestJustica.model.pojo.Usuario;
import ufrn.br.ProjetoRestJustica.repository.generic.GenericRepository;

import java.util.Optional;

public interface UsuarioRepository extends GenericRepository<Usuario> {
    Optional<Usuario> findUsuarioByUsername(String username);
}

