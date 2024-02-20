/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstrakk;

/**
 *
 * @author SMK TELKOM 09
 */
public class Cicrle extends Shape {
    
 private float radius;

    public Cicrle(float radius) {
        this.radius = radius;
    }


    @Override
    float getArea() {
        return (float) (Math.PI * radius * radius);
    }

}
