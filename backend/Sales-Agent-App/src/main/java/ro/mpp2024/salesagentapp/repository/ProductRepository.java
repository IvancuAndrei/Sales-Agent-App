package ro.mpp2024.salesagentapp.repository;

import ro.mpp2024.salesagentapp.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    public Product findById(int id);

}
