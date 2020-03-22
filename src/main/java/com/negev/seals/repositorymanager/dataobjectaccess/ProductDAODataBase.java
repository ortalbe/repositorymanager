package com.negev.seals.repositorymanager.dataobjectaccess;

import com.negev.seals.repositorymanager.beans.Product;
import com.negev.seals.repositorymanager.repository.ProdutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("production")
public class ProductDAODataBase implements ProductDAO{

    @Autowired
    ProdutRepository productRepository;

    public Product getProductByName(String name)
    {
       return productRepository.findByProductName(name);
    }

    public boolean addProduct (Product product)
    {
        productRepository.save(product);
        return true;
    }

    public boolean updateProduct (Product product)
    {
        productRepository.save(product);
        return true;
    }

    public boolean deleteProduct (Product product)
    {
        productRepository.delete(product);
        return true;
    }

}
