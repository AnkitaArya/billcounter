package com.app.billcounter.dao;

import com.app.billcounter.dao.entity.ProductEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;


@Repository
public interface ProductBillDao {

    public List<ProductEntity> getProductsByIds(Set<String> productIds);
}
