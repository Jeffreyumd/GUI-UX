/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Jeffrey A
 */
public class CityNode {
    
    public City city;
    public CityNode next;
    
    public CityNode(City city)
    {
        this.city = city;
    }
    
    public void Display(){
        System.out.print(city.getName());
    }
}


