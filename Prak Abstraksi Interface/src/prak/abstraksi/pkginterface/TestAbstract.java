/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prak.abstraksi.pkginterface;

/**
 *
 * @author udaxd
 */
public class TestAbstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Weapon knife = new Knife();
        Weapon gun = new Gun(10);

        knife.attack();
        
        gun.attack();
        gun.attack();

        Knife knife2 = new Knife();
        Weapon gun2 = new Gun(10);

        knife2.attack();
        
        gun2.attack();
        gun2.attack();
    }
}
    

