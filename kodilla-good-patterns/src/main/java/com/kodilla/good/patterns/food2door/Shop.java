package com.kodilla.good.patterns.food2door;

public class Shop implements OrderService{

    @Override
    public boolean order(OrderRequest orderRequest) {
        if (orderRequest.getCompanyName().equals("ExtraFoodShop")) {
        System.out.println("Zamówienie - Firma: " + orderRequest.getCompanyName() + " Produkt: " + orderRequest.getProduct()
                + " Ilość: " + orderRequest.getProductQuantity());
        return true;
        } else {
            System.out.println("Zostały wprowadzone niepoprawde dane");
            return false;
        }
    }
}
