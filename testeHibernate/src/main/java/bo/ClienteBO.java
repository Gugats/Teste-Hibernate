/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import dao.ClienteDAOImpl;

/**
 *
 * @author gustavomaia
 */
public class ClienteBO extends GenericBO<Cliente> {
    
    public ClienteBO(){
        dao = new ClienteDAOImpl();
    }
    
}
