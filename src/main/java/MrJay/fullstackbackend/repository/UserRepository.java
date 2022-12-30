package MrJay.fullstackbackend.repository;

import MrJay.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long > {
}
