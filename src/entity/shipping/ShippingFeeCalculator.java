package entity.shipping;

import entity.order.Order;

//Nguyễn Năng Sơn 20194158
public interface ShippingFeeCalculator {
    int calculateShippingFee(Order order);
}
