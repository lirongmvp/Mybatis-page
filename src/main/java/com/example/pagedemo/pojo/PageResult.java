package com.example.pagedemo.pojo;

import java.util.List;

/**
 * @author lirong
 * @create 2018/1/1
 * @since 1.0.0
 */
public class PageResult {
    private Integer total;
    private List<?> rows;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }


}
