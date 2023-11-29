package Repo;

import Entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AminRepo extends JpaRepository<Admin, Long> {
    Optional<Admin> findByUsername(String username);
}
