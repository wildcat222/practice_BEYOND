package com.management.product.model.dto;

public class ProductDTO {

    // * 주석을 지우고 제품 정보를 담는 객체를 만들 java class를 작성하세요.
    // * 모든 필드는 String 타입으로 작성하시고, 'PRODUCT_INFO' 테이블과 매핑 가능해야 합니다.

    private String productCode; // 제품코드(pk)
    private String productName; // 제품명
    private String originCost;  // 원가
    private String releaseDate; //출시일
    private String discountRate;    // 할인율
    private String salesQuantity;   //판매량
    private String stockQuantity;   // 재고량
    private String categoryCode;    // 카테고리 코드
    private String productionStatus;    // 생산 상태

    public ProductDTO() {
    }

    public ProductDTO(String productCode
            , String productName
            , String originCost
            , String releaseDate
            , String discountRate
            , String stockQuantity
            , String categoryCode
    ) {
        this.productCode = productCode;
        this.productName = productName;
        this.originCost = originCost;
        this.releaseDate = releaseDate.replaceAll("-", "");
        this.discountRate = discountRate;
        this.salesQuantity = "0";
        this.stockQuantity = stockQuantity;
        this.categoryCode = categoryCode;
        this.productionStatus = "Y";
    }

    public ProductDTO(String productCode, String productName
            , String originCost, String releaseDate
            , String discountRate, String salesQuantity
            , String stockQuantity, String categoryCode
            , String productionStatus
    ) {
        this.productCode = productCode;
        this.productName = productName;
        this.originCost = originCost;
        this.releaseDate = releaseDate.replaceAll("-", "");
        this.discountRate = discountRate;
        this.salesQuantity = "0";
        this.stockQuantity = stockQuantity;
        this.categoryCode = categoryCode;
        this.productionStatus = "Y";
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getOriginCost() {
        return originCost;
    }

    public void setOriginCost(String originCost) {
        this.originCost = originCost;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(String discountRate) {
        this.discountRate = discountRate;
    }

    public String getSalesQuantity() {
        return salesQuantity;
    }

    public void setSalesQuantity(String salesQuantity) {
        this.salesQuantity = salesQuantity;
    }

    public String getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(String stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getProductionStatus() {
        return productionStatus;
    }

    public void setProductionStatus(String productionStatus) {
        this.productionStatus = productionStatus;
    }

    @Override
    public String toString() {
        return "ProductDTO{" +
                "productCode='" + productCode + '\'' +
                ", productName='" + productName + '\'' +
                ", originCost='" + originCost + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", discountRate='" + discountRate + '\'' +
                ", salesQuantity='" + salesQuantity + '\'' +
                ", stockQuantity='" + stockQuantity + '\'' +
                ", categoryCode='" + categoryCode + '\'' +
                ", productionStatus='" + productionStatus + '\'' +
                '}';
    }
}
