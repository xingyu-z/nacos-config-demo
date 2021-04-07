package org.example.demo.nacos.config.service;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.example.demo.nacos.config.model.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceNacosConfigImpl implements IProductService {

    @NacosValue(value = "${product.url}", autoRefreshed = true)
    private String productUrl;

    @Override
    public Product getProduct(int id) {
        Product product = new Product();
        product.setId(id);
        product.setName("invoke from " + productUrl);
        return product;
    }
}
