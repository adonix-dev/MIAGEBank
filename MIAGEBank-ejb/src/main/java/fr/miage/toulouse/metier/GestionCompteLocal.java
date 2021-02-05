/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.toulouse.metier;

import javax.ejb.Local;

/**
 *
 * @author AntonyLaget
 */
@Local
public interface GestionCompteLocal {

    void crediter(double montant, long dest);
    
}
