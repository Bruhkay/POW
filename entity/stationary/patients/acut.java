/**
 * This is acut patient class.
 * Acut patients are people who need pills in specific situations such as flu.
 * 
 * >Some pill should be taken in determined time (antibiotics every 12 hours) 
 * >But some of them can be taken when patient need(eg: parol is taken when patient has headache)
 * 
 */
package entity.stationary.patients;
public class Acut extends Patients {

    public Acut(String name, int x, int y){
        
        super(name,x,y);
    }
    
}
