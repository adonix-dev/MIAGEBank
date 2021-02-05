/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.toulouse.metier;

import fr.miage.toulouse.entities.Compte;
import fr.miage.toulouse.entities.Operation;
import fr.miage.toulouse.facades.CompteFacadeLocal;
import fr.miage.toulouse.facades.OperationFacadeLocal;
import java.util.Calendar;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author AntonyLaget
 */
@Stateless
public class GestionCompte implements GestionCompteLocal {

    @EJB
    private OperationFacadeLocal operationFacade;

    @EJB
    private CompteFacadeLocal compteFacade;

    @Override
    public void crediter(double montant, long dest) {
        Compte c = compteFacade.find(dest);
        c.setSolde(montant+c.getSolde());
        Operation op = new Operation();
        op.setDateOp(Calendar.getInstance());
        op.setTypeOp("credit");
        op.setCompte(c);
        operationFacade.create(op);
    }

}
