package com.service;

import com.dao.ProductDao;
import entity.Product;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class ProductService {
    @Resource
    private ProductDao productDao;

    public List<Product> findAll(){
        return productDao.findAll();
    }
    public int save(Product product){
        return  productDao.save(product);
    }
}
