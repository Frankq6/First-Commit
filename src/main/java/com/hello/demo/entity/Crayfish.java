package com.hello.demo.entity;

public class Crayfish {
    private Integer fid;//小龙虾序号

    private String name;

    private Integer price;

    private String goodsImgUrl;

    private Integer moreStandard;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getGoodsImgUrl() {
        return goodsImgUrl;
    }

    public void setGoodsImgUrl(String goodsImgUrl) {
        this.goodsImgUrl = goodsImgUrl;
    }

    public Integer getMoreStandard() {
        return moreStandard;
    }

    public void setMoreStandard(Integer moreStandard) {
        this.moreStandard = moreStandard;
    }
}
