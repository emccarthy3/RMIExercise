/**
 * Product.java 1.0 Oct 29, 2015
 *
 * Copyright (c) 2015 David J. Powell. All Rights Reserved
 */
package edu.elon.product;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Start each class or interface with summary description line
 * 
 * @author dpowell2
 * @version 1.0
 * 
 */
public interface Product extends Remote {

  String getDescription() throws RemoteException;

}
