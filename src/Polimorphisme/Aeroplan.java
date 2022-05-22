/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorphisme;

/**
 *
 * @author ASUSVivoBook
 */
public class Aeroplan extends Vehide {
    @Override
    public void walk(){
        System.out.println("Aeroplan Flying");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Aeroplan garuda = new Aeroplan();
        garuda.function();
        garuda.fuel();
        garuda.walk();

}
}
