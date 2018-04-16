package interfaces;

import persons.Visitor;

public interface IRestrictable {
    boolean isAllowedTo(Visitor visitor);
}
