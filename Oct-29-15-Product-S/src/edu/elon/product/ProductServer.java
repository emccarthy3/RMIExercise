/**
 @version 1.20  
 @author Cay Horstmann
 */

package edu.elon.product;

import javax.naming.Context;
import javax.naming.InitialContext;

/**
 * This server program instantiates two remote objects, registers them
 * with the naming service, and waits for clients to invoke methods on
 * the remote objects.
 */
public class ProductServer {
  public static void main(String args[]) {
    try {
      System.out.println("Constructing server implementations...");

      Product p1 = new ProductImpl("Blackwell Toaster");
      Product p2 = new ProductImpl("ZapXpress Microwave Oven");

      System.out.println("Binding server implementations to registry...");
      Context namingContext = new InitialContext();
      namingContext.bind("rmi:toaster", p1);
      namingContext.bind("rmi:microwave", p2);
      System.out.println("Waiting for invocations from clients...");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
