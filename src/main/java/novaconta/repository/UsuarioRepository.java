package novaconta.repository;

import novaconta.aulaspring01.model.UsuarioModel;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer>{ }
