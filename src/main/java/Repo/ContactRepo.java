package Repo;

import Entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepo  extends JpaRepository<Contact, Long> {
}

}
