/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PurchaseSystem;

import javax.ejb.Local;

/**
 *
 * @author jmagalhaes
 */
@Local
public interface SystemPurchaseLocal {

    boolean login(String username, String password);
    
}
