package com.app.billcounter.dao.impl;

import com.app.billcounter.Repository.ProductRepository;
import com.app.billcounter.dao.ProductBillDao;
import com.app.billcounter.dao.entity.ProductEntity;
import com.app.billcounter.exceptions.BillCounterDAOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Repository
public class ProductBillDaoImpl implements ProductBillDao {

	@Autowired
	private ProductRepository productRepository;

	/*
	 * @Override public List<ProductEntity> getProductsByIds(Set<String>
	 * productIds){
	 * 
	 * return productRepository.getProductsWithMultipleIds(new
	 * ArrayList<>(productIds)); }
	 */

	@Override
	public List<ProductEntity> getProductsByIds(Set<String> productIds) {
		try {
			return productRepository.findProductEntityByProductIdIsIn(new ArrayList<>(productIds));

		} catch (Exception ex) {
			throw new BillCounterDAOException("Issues while connecting to the database",ex);
		}
	}
}
