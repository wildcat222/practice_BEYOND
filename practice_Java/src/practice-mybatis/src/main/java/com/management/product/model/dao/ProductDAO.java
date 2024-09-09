package com.management.product.model.dao;

import com.management.product.model.dto.ProductDTO;

import java.util.List;
import java.util.Map;

public interface ProductDAO {
    // * 주석을 지우고 Mapper interface(= DAO class) 역할을 하도록 내용을 작성하세요.
    List<ProductDTO> selectAllProductList();

    List<ProductDTO> selectProductByCondition();

    int registNewProduct(ProductDTO product);

    int modifyProductInfo(ProductDTO product);

    int deleteProduct(Map<String, String> parameter);
}
