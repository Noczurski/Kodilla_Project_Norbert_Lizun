package com.kodilla.good.patterns.food2door;

public class SendInfo implements InformationService{

    @Override
    public void sendInfo(OrderRequest orderRequest) {
        System.out.println("Wiadomość Mail - Firma: " + orderRequest.getCompanyName() + " Produkt: " + orderRequest.getProduct()
                + " Ilość: " + orderRequest.getProductQuantity());
    }
}
