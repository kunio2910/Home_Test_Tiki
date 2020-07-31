package com.letran.home_test_tiki.models;

public class Progress {

    private String qty;
    private String qty_ordered;
    private String qty_remain;
    private String percent;
    private String status;

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getQty_ordered() {
        return qty_ordered;
    }

    public void setQty_ordered(String qty_ordered) {
        this.qty_ordered = qty_ordered;
    }

    public String getQty_remain() {
        return qty_remain;
    }

    public void setQty_remain(String qty_remain) {
        this.qty_remain = qty_remain;
    }

    public String getPercent() {
        return percent;
    }

    public void setPercent(String percent) {
        this.percent = percent;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
