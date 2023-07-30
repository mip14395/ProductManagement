package domain;

import java.util.List;

import domain.model.Product;

public interface ProductService {
    void addProduct(Product product);

    void updateProduct(Product product);

    void deleteProduct(Product product);

    void searchProduct(Product product);

    List<Product> getAllProduct();
}
