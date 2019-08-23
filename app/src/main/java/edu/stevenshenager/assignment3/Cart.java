package edu.stevenshenager.assignment3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Cart {

    private String firstName, lastName;
    private List<Detail> details;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Detail> getDetails() {
        return details;
    }

    public void addDetail(Detail detail) {
        if (details == null) {
            details = new ArrayList<>();
        }
        details.add(detail);
    }

    public BigDecimal total() {
        BigDecimal total  = BigDecimal.ZERO;
        for (Detail detail : details) {
            total = total.add(detail.total());
        }
        return total;
    }
}
