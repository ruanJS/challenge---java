package br.com.fiap.id.repository;

import br.com.fiap.id.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
