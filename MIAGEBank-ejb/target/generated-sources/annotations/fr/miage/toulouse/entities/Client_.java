package fr.miage.toulouse.entities;

import fr.miage.toulouse.entities.Compte;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-02-05T15:06:03")
@StaticMetamodel(Client.class)
public class Client_ { 

    public static volatile ListAttribute<Client, Compte> listeComptes;
    public static volatile SingularAttribute<Client, Long> id;
    public static volatile SingularAttribute<Client, String> prenom;
    public static volatile SingularAttribute<Client, String> nom;

}