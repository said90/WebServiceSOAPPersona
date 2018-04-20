/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.said.ejb;

import com.said.model.Persona;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author bsf_o
 */
@WebService(serviceName = "PersonaWS")
@Stateless()
public class PersonaWS {

    @EJB
    private PersonaFacadeLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Web Service > Add Operation"

    @WebMethod(operationName = "create")
    @Oneway
    public void create(@WebParam(name = "persona") Persona persona) {
        ejbRef.create(persona);
    }

    @WebMethod(operationName = "find")
    public Persona find(@WebParam(name = "id") Object id) {
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findAll")
    public List<Persona> findAll() {
        return ejbRef.findAll();
    }
    
}
