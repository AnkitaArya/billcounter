package com.app.billcounter.service;


import com.app.billcounter.domain.BillResource;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface ProductBillService {

    public BillResource getBillByProductId(Set<String> productIds);
}
