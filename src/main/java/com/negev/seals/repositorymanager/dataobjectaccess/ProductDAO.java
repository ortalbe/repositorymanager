package com.negev.seals.repositorymanager.dataobjectaccess;

import com.negev.seals.repositorymanager.beans.Product;
import org.springframework.stereotype.Component;

public interface ProductDAO {

    Product getProductByName(String name);

    boolean addProduct (Product product);

    boolean updateProduct (Product product);

    boolean deleteProduct (Product product);

}
