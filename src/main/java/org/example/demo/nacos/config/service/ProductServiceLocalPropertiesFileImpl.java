package org.example.demo.nacos.config.service;

import org.example.demo.nacos.config.model.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

//@Service
public class ProductServiceLocalPropertiesFileImpl implements IProductService {

    @Value("#{commonProps['product.url']}")
    private String productUrl;

    @Override
    public Product getProduct(int id) {
        Product product = new Product();
        product.setId(id);
        product.setName("invoke from " + productUrl);
        return product;
    }
}
