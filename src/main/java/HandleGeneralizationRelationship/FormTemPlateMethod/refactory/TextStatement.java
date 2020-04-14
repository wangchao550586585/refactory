package HandleGeneralizationRelationship.FormTemPlateMethod.refactory;

import case1.prototype.Rental;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by Administrator on 2017/5/16.
 */
public class TextStatement extends Statement {

    public String getRentalString(Rental nextElement) {
        return nextElement.getMovie().getTitle();
    }

    public String getString(Customer customer) {
        return "Amount owed is " + String.valueOf(customer.getTotalAmount()) + "\n" + "You earned " + String.valueOf(customer.getFrequentRenterPoints());
    }
}
