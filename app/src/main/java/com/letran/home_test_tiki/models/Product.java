package com.letran.home_test_tiki.models;

import java.util.List;

public class Product {

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl_path() {
        return url_path;
    }

    public void setUrl_path(String url_path) {
        this.url_path = url_path;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getList_price() {
        return list_price;
    }

    public void setList_price(String list_price) {
        this.list_price = list_price;
    }

    public List<String> getBadges() {
        return badges;
    }

    public void setBadges(List<String> badges) {
        this.badges = badges;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getRating_average() {
        return rating_average;
    }

    public void setRating_average(String rating_average) {
        this.rating_average = rating_average;
    }

    public String getReview_count() {
        return review_count;
    }

    public void setReview_count(String review_count) {
        this.review_count = review_count;
    }

    public String getOrder_count() {
        return order_count;
    }

    public void setOrder_count(String order_count) {
        this.order_count = order_count;
    }

    public String getThumbnail_url() {
        return thumbnail_url;
    }

    public void setThumbnail_url(String thumbnail_url) {
        this.thumbnail_url = thumbnail_url;
    }

    public String getIs_visible() {
        return is_visible;
    }

    public void setIs_visible(String is_visible) {
        this.is_visible = is_visible;
    }

    public String getIs_fresh() {
        return is_fresh;
    }

    public void setIs_fresh(String is_fresh) {
        this.is_fresh = is_fresh;
    }

    public String getIs_flower() {
        return is_flower;
    }

    public void setIs_flower(String is_flower) {
        this.is_flower = is_flower;
    }

    public String getIs_gift_card() {
        return is_gift_card;
    }

    public void setIs_gift_card(String is_gift_card) {
        this.is_gift_card = is_gift_card;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public String getUrl_attendant_input_form() {
        return url_attendant_input_form;
    }

    public void setUrl_attendant_input_form(String url_attendant_input_form) {
        this.url_attendant_input_form = url_attendant_input_form;
    }

    public String getMaster_id() {
        return master_id;
    }

    public void setMaster_id(String master_id) {
        this.master_id = master_id;
    }

    public String getSeller_product_id() {
        return seller_product_id;
    }

    public void setSeller_product_id(String seller_product_id) {
        this.seller_product_id = seller_product_id;
    }

    public String getPrice_prefix() {
        return price_prefix;
    }

    public void setPrice_prefix(String price_prefix) {
        this.price_prefix = price_prefix;
    }
}
