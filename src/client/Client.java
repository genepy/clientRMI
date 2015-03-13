package client;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import interface1.Hello;
import java.rmi.Naming;
import java.rmi.RemoteException;

/**
 *
 * @author jfdenise
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Hello obj = (Hello) Naming.lookup("//localhost/HelloServer");
            String message = obj.sayHello();
            System.out.println("Received Message " + message);
        } catch (Exception e) {
            System.out.println("Client exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
