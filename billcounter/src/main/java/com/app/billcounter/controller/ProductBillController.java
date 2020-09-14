package com.app.billcounter.controller;


import com.app.billcounter.domain.BillResource;
import com.app.billcounter.service.ProductBillServiceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import java.util.Set;
import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/v1/bill", produces = { APPLICATION_JSON_VALUE })
public class ProductBillController {
	final Logger logger = LoggerFactory.getLogger(ProductBillController.class);
    @Autowired
    private ProductBillServiceImpl productBillService;

    @ResponseStatus(OK)
    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public ResponseEntity<BillResource> getBillByProductId(
            @RequestParam Set<String> productIds) {
    	logger.info("fetching bill details");
        BillResource billResource = productBillService.getBillByProductId(productIds);
        return ResponseEntity.ok(billResource);

    }
}
