/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administrador;

import PurchaseSystem.SystemPurchaseLocal;
import javax.ejb.EJB;
import javax.ejb.Stateful;

/**
 *
 * @author jmagalhaes
 */
@Stateful
public class Administrador implements AdministradorRemote {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @EJB
    private SystemPurchaseLocal systemPurchase;

    @Override
    public boolean login(String username, String password) {
        return this.systemPurchase.login(username, password);
    }
    
   
}
