/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.toulouse.facades;

import fr.miage.toulouse.entities.Operation;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author AntonyLaget
 */
@Local
public interface OperationFacadeLocal {

    void create(Operation operation);

    void edit(Operation operation);

    void remove(Operation operation);

    Operation find(Object id);

    List<Operation> findAll();

    List<Operation> findRange(int[] range);

    int count();
    
}
