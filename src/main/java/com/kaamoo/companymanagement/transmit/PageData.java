package com.kaamoo.companymanagement.transmit;

import java.util.List;

public class PageData <T> {
    private long total;//查询出的记录数
    private List<T> rows;//数据

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
