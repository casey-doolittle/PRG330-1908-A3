package edu.stevenshenager.assignment3;

import java.math.BigDecimal;

public class Detail {

    private String showName;
    private BigDecimal ticketPrice, quantity;

    public Detail(String showName, BigDecimal ticketPrice, BigDecimal quantity) {
        this.showName = showName;
        this.ticketPrice = ticketPrice;
        this.quantity = quantity;
    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public BigDecimal getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(BigDecimal ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal total() {
        return ticketPrice.multiply(quantity);
    }
}
