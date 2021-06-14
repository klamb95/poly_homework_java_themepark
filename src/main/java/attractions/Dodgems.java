package attractions;

import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    @Override
    public double defaultPrice() {
        return 4.50;
    }

    @Override
    public double defaultPriceForVisitor(Visitor visitor) {
        if(visitor.age < 12){
            return (4.50)/2;

        }
    }
}
