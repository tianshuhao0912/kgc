package cn.kgc.entity;

public class Sku {
    private Long skuId;
    private String title;
    private Long price;
    
    public Long getSkuId(){
     return this.skuId;
    }

    public String getTitle(){
        return this.title;
    }

    public Long getPrice(){
        return  this.price;
    }
}
