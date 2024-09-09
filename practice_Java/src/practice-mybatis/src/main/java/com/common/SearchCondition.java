package com.common;

public class SearchCondition {

    // * 주석을 지우고 검색 조건을 담은 객체를 생성할 java class를 작성하세요.
    // * 모든 필드는 String 타입으로 작성하시고, 필수로 작성해야 하는 필드는 option(검색 조건), value(검색어)입니다.
    private String option;
    private String value;

    public SearchCondition() {
    }

    public SearchCondition(String option, String value) {
        this.option = option;
        this.value = value;
    }

    @Override
    public String toString() {
        return "SearchCondition{" +
                "option='" + option + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
