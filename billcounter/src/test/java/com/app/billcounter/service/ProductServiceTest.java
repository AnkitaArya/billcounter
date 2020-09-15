package com.app.billcounter.service;

import com.app.billcounter.dao.ProductBillDao;
import com.app.billcounter.dao.entity.ProductEntity;
import com.app.billcounter.dao.impl.ProductBillDaoImpl;
import com.app.billcounter.domain.BillResource;
import com.app.billcounter.domain.ProductResource;
import com.app.billcounter.service.ProductBillServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.modelmapper.ModelMapper;
import org.springframework.test.util.ReflectionTestUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.anySet;
import static org.mockito.Mockito.when;


public class ProductServiceTest {

    @Mock
    private ProductBillDao productBillDao = Mockito.mock(ProductBillDaoImpl.class);
    @Mock
    private ModelMapper modelMapper = Mockito.mock(ModelMapper.class);;
    @InjectMocks
    private ProductBillServiceImpl productBillService = new ProductBillServiceImpl();

    private BillResource billResource;
    ProductEntity productFromDb;
    ProductResource dummyProductResource;
    private List<ProductEntity> dummyList = new ArrayList<>();

    @Before
    public void setup() {
        ReflectionTestUtils.setField(productBillService, "productBillDao", productBillDao);
        ReflectionTestUtils.setField(productBillService, "modelMapper", modelMapper);
        productFromDb = new ProductEntity("1", "TestData", "TestData", "TestData", 2500);
        dummyProductResource = new ProductResource("1", "TestData", "TestData", "TestData", 0, 2500, 0);
        dummyList.add(productFromDb);
        billResource = new BillResource(Arrays.asList(dummyProductResource), 2500, 0, 2500);
        }

    @Test
    public void getBillByProductIdTest() {
        Set<String> testProductId = new HashSet<String>();
        List<BillResource> billResourceList = Arrays.asList(billResource);
        testProductId.add("1");
        when(productBillDao.getProductsByIds(anySet())).thenReturn(dummyList);
        when(modelMapper.map(Mockito.any(), Mockito.eq(ProductResource.class))).thenReturn(dummyProductResource);
        BillResource returnObject = productBillService.getBillByProductId(testProductId);
        assertNotNull(returnObject);
        assertEquals(billResource.getProducts().size(), returnObject.getProducts().size());



    }


}
