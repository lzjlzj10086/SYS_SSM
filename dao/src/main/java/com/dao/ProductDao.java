package com.dao;

import entity.Product;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProductDao {


    List<Product> findAll();

    int save(Product product);
}
