package com.tarea1.repository;

import com.tarea1.entity.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

   public Usuario findByEmail(String email);
    
   public Optional<Usuario> findByemail(String email);
}
