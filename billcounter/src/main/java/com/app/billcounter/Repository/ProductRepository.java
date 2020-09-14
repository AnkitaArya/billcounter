package com.app.billcounter.Repository;

import com.app.billcounter.dao.entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<ProductEntity, String> {

	/*
	 * @Query("select p from Product p where p.productId in (?)")
	 * List<ProductEntity> getProductsWithMultipleIds(@Param List<String>
	 * productIds);
	 */

	List<ProductEntity> findProductEntityByProductIdIsIn(List<String> productIds);
}
