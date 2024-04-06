package ro.mpp2024.salesagentapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.mpp2024.salesagentapp.domain.Order;
import ro.mpp2024.salesagentapp.domain.Product;
import ro.mpp2024.salesagentapp.repository.OrderRepository;
import ro.mpp2024.salesagentapp.repository.ProductRepository;

@Service
public class OrderServiceImpl implements OrderService{

    private final OrderRepository orderRepository;
    private final ProductRepository productRepository;
    private final ProductServiceImpl productServiceImpl;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository, ProductRepository productRepository, ProductServiceImpl productServiceImpl) {
        this.orderRepository = orderRepository;
        this.productRepository = productRepository;
        this.productServiceImpl = productServiceImpl;
    }

    public void addOrder(Order order) {
        Product product = productRepository.findById(order.getProduct_id());
        product.setQuantity(product.getQuantity() - order.getQuantity());
        productServiceImpl.updateProduct(product);
        orderRepository.save(order);
    }



}
