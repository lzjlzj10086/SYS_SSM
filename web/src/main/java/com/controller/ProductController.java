package com.controller;

import com.service.ProductService;
import entity.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Resource
    private ProductService productService;
    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        ModelAndView modelAndView = new ModelAndView();
        System.out.println(33);
        List<Product> products = productService.findAll();
        modelAndView.addObject("productlist",products);
        modelAndView.setViewName("productlist");
        return modelAndView;
    }
    @RequestMapping("/save")
    public String save(Product product){
        int count = productService.save(product);
        if(count == 0 ){
            return "";
        }
        return "redirect:/product/findAll";
    }
}
