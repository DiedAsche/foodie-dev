package com.imooc.pojo.vo;

public class OrderVO {

    private String orderId;
    private MerchantOrderVO merchantOrdersVO;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public MerchantOrderVO getMerchantOrdersVO() {
        return merchantOrdersVO;
    }

    public void setMerchantOrdersVO(MerchantOrderVO merchantOrdersVO) {
        this.merchantOrdersVO = merchantOrdersVO;
    }
}