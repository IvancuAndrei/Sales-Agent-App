package ro.mpp2024.salesagentapp.service;

import ro.mpp2024.salesagentapp.domain.Product;
import ro.mpp2024.salesagentapp.domain.dto.ProductDTO;

import java.util.List;

public interface ProductService {

    public void addProduct(ProductDTO productDTO);

    public void updateProduct(ProductDTO product, Integer id);

    public void deleteProduct(Product product);

    public List<Product> getAllProducts();

    public Product getProductById(int id);
}
