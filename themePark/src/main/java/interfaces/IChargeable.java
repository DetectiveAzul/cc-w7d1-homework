package interfaces;

import persons.Visitor;

public interface IChargeable {
    double priceFor(Visitor visitor);
}
