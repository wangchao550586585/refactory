package HandleGeneralizationRelationship.FormTemPlateMethod;

import case1.prototype.Rental;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 塑造模板函数372
 * 一些子类,其中某些函数以先相同顺序执行类似操作,但各个操作的细节不同
 * 将这些操作分别放进独立函数中,保证他们相同签名,原函数就相同了,将原函数上移超类
 * Created by Administrator on 2017/5/16.
 */
public class Customer {
    private String name;
    private Vector<Rental> rentals = new Vector<Rental>();
    double totalAmount = 0;
    int frequentRenterPoints = 0;

    public String Statement() {
        String result="";
        Enumeration<Rental> elements = rentals.elements();
        while (elements.hasMoreElements()) {
            double thisAmount = 0;
            Rental nextElement = elements.nextElement();
            result += nextElement.getMovie().getTitle();
        }
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints);
        return result;
    }
    public String htmlStatement(){
        String result="";
        Enumeration<Rental> elements = rentals.elements();
        while (elements.hasMoreElements()) {
            double thisAmount = 0;
            Rental nextElement = elements.nextElement();
            result += nextElement.getMovie().getTitle()+":"+nextElement.getDaysRented();
        }
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints);
        return result;
    }
}
