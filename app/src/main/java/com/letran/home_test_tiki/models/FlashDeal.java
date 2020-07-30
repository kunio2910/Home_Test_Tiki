package com.letran.home_test_tiki.models;

import java.util.List;

public class FlashDeal {
    private String status;
    private String url;
    private String tags;
    private String discount_percent;
    private String special_price;
    private String special_from_date;
    private String from_date;
    private String special_to_date;
    private Progress progress;
    private Product product;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getDiscount_percent() {
        return discount_percent;
    }

    public void setDiscount_percent(String discount_percent) {
        this.discount_percent = discount_percent;
    }

    public String getSpecial_price() {
        return special_price;
    }

    public void setSpecial_price(String special_price) {
        this.special_price = special_price;
    }

    public String getSpecial_from_date() {
        return special_from_date;
    }

    public void setSpecial_from_date(String special_from_date) {
        this.special_from_date = special_from_date;
    }

    public String getFrom_date() {
        return from_date;
    }

    public void setFrom_date(String from_date) {
        this.from_date = from_date;
    }

    public String getSpecial_to_date() {
        return special_to_date;
    }

    public void setSpecial_to_date(String special_to_date) {
        this.special_to_date = special_to_date;
    }

    public Progress getProgress() {
        return progress;
    }

    public void setProgress(Progress progress) {
        this.progress = progress;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    private class Progress{
        private String qty;
        private String qty_ordered;
        private String qty_remain;
        private String percent;
        private String status;
    }

    private class Product{
        private String id;
        private String sku;
        private String name;
        private String url_path;
        private String price;
        private String list_price;
        private List<String> badges;
        private String discount;
        private String rating_average;
        private String review_count;
        private String order_count;
        private String thumbnail_url;
        private String is_visible;
        private String is_fresh;
        private String is_flower;
        private String is_gift_card;
        private Inventory inventory;
        private String url_attendant_input_form;
        private String master_id;
        private String seller_product_id;
        private String price_prefix;
    }

    private class Inventory{
        private String product_virtual_type;
        private String fulfillment_type;
    }
}
