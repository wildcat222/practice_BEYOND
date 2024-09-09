package com.management.product.model.service;

import com.common.SearchCondition;
import com.management.product.model.dao.ProductDAO;
import com.management.product.model.dto.ProductDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

import static com.common.Template.getSqlSession;

public class ProductService {

    // 1. 자주 사용할 DAO 객체를 선언하세요.
    SqlSession sqlSession;

    public List<ProductDTO> selectAllProductList() {

        // 2. 전체 제품 목록을 조회하는 로직을 작성하세요.
        sqlSession = getSqlSession();
        ProductDAO productDAO = sqlSession.getMapper(ProductDAO.class);

        List<ProductDTO> productList = productDAO.selectAllProductList();
        sqlSession.close();

        return productList;
    }

    public List<ProductDTO> selectProductByCondition(SearchCondition searchCondition) {

        // 3. 조건에 따른 제품 목록을 조회하는 로직을 작성하세요.
        sqlSession = getSqlSession();
        ProductDAO productDAO = sqlSession.getMapper(ProductDAO.class);

        List<ProductDTO> productList = productDAO.selectProductByCondition();
        sqlSession.close();

        return productList;

    }

    public boolean registNewProduct(ProductDTO product) {

        // 4. 제품 정보를 등록하는 로직을 작성하세요.
        SqlSession sqlSession = getSqlSession();
        ProductDAO productDAO = sqlSession.getMapper(ProductDAO.class);

        int result = productDAO.registNewProduct(product);

        return result > 0;

    }

    public boolean modifyProductInfo(ProductDTO product) {

        // 5. 제품 정보를 수정하는 로직을 작성하세요.
        SqlSession sqlSession = getSqlSession();
        ProductDAO productDAO = sqlSession.getMapper(ProductDAO.class);

        int result = productDAO.modifyProductInfo(product);

        return result > 0;

    }

    public boolean deleteProduct(Map<String, String> parameter) {

        // 6. 제품 정보를 삭제하는 로직을 작성하세요.
        SqlSession sqlSession = getSqlSession();
        ProductDAO productDAO = sqlSession.getMapper(ProductDAO.class);

        int result = productDAO.deleteProduct(parameter);
        return false;

    }
}
