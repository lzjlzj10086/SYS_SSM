package com.dao;

import entity.Product;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProductDao {

    @Select("SELECT *from product")
    List<Product> findAll();
}
