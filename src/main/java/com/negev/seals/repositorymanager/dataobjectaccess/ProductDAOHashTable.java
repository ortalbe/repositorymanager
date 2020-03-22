package com.negev.seals.repositorymanager.dataobjectaccess;

import com.negev.seals.repositorymanager.beans.Product;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
@Profile("dev")
public class ProductDAOHashTable implements ProductDAO {

    private HashMap<String, Product> repository;

    public ProductDAOHashTable( ) {
        this.repository = new  HashMap<String, Product> ();
        Product iptv = new Product(1,"IPTV",100,20,"AB20");
        Product broadBand = new Product(2,"BB",10.3,5,"BB20");
        Product toip = new Product(3,"TOIP",16.0,1,"C20");
        Product hsia = new Product(4,"HSIA",106.80,20,"H50");

        this.repository.put("IPTV",iptv);
        this.repository.put("BB",broadBand);
        this.repository.put("TOIP",toip);
        this.repository.put("HSIA",hsia);
    }

    public Product getProductByName(String name)
    {
        return this.repository.get(name);
    }

    public boolean addProduct (Product product)
    {
        this.repository.put(product.getProductName(),product);

        return false;
    }

    public boolean updateProduct (Product product)
    {
        if(this.repository.get(product.getProductName())!=null)
        {
            this.repository.put(product.getProductName(),product);
            return true;
        }

        return false;
    }

    public boolean deleteProduct (Product product)
    {
        if(this.repository.get(product.getProductName())!=null)
        {
            this.repository.remove(product.getProductName());
            return true;
        }

        return false;
    }

}
