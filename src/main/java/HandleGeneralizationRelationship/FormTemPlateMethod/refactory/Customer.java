package HandleGeneralizationRelationship.FormTemPlateMethod.refactory;

import case1.prototype.Rental;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String name;
    private Vector<Rental> rentals = new Vector<Rental>();
    double totalAmount = 0;
    int frequentRenterPoints = 0;

    public String getName() {
        return name;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public int getFrequentRenterPoints() {
        return frequentRenterPoints;
    }

    public Vector<Rental> getRentals() {
        return rentals;
    }

    public String Statement() {
        return new TextStatement().value(this);
    }

    public String htmlStatement() {
        return new HtmlStatement().value(this);
    }

}
