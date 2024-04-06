package ro.mpp2024.salesagentapp.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ro.mpp2024.salesagentapp.domain.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
