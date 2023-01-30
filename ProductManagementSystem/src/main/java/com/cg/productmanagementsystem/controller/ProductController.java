package com.cg.productmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.productmanagementsystem.entity.Product;
import com.cg.productmanagementsystem.repository.ProductRepository;

@RestController
public class ProductController {
	
	@Autowired
	private ProductRepository productrepo;
	
	@PostMapping("/insertproduct")
	public Product insertMovie(@RequestBody Product pro) {
		return productrepo.save(pro); //insert into product values(?,?,?);
	}
	
	@GetMapping("/getallproduct")
	public List<Product> getAllMovies(){
		return productrepo.findAll(); //select * from product;
	}
	

	@GetMapping("/getproductid/{productid}")
	public Product getProductById(@PathVariable("productid")Long productId){
		return productrepo.findById(productId).get(); 
			//select * from movie where productid = ?;
	}
	@PutMapping("/updateproductid/{productid}")
	public Product UpdateMovieById(@PathVariable("productid")Long productId,@RequestBody Product pro){
		Product existingProduct = getProductById(productId);
		existingProduct.setProductId(pro.getProductId());
		existingProduct.setProductName(pro.getProductName());
		existingProduct.setProductPrice(pro.getProductPrice());
		return productrepo.save(existingProduct);
	}





}
