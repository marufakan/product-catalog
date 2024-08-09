package com.example.product_catalog.services;

import com.example.product_catalog.entities.Product;
import com.example.product_catalog.repostories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    /**
     * Bütün ürünleri döner.
     * @return
     */
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    /**
     * parametre olarak verilen id'ye ait kaydı bulursa geri döner.Bulamazsa hata döner.
     * @param id
     * @return
     */
    public Product getProductById(Long id){
        return productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
    }

    /**
     * Parametre olarak verilen product bilgilerini tabloya kayıt eder.
     * @param product
     * @return
     */
    public Product createProduct(Product product){
        return productRepository.save(product);
    }

    /**
     * Parametre olarak verilen id ile eşleşen kaydı siler.
     * @param id
     */
    public void deleteProduct(Long id){
        productRepository.deleteById(id);
    }
}
