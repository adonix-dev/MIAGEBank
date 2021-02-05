package fr.miage.toulouse.entities;

import fr.miage.toulouse.entities.Compte;
import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-02-05T15:06:03")
@StaticMetamodel(Operation.class)
public class Operation_ { 

    public static volatile SingularAttribute<Operation, String> typeOp;
    public static volatile SingularAttribute<Operation, Long> id;
    public static volatile SingularAttribute<Operation, Calendar> dateOp;
    public static volatile SingularAttribute<Operation, Double> montantOp;
    public static volatile SingularAttribute<Operation, Compte> compte;

}