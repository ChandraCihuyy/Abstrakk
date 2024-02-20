/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstrakk;

/**
 *
 * @author SMK TELKOM 09
 */
public class Triagle  extends Shape  {
     
    private float base;
    private float height;

    public Triagle(int base, int height) {
        this.base = base;
        this.height = height;
    }


    @Override
    float getArea() {
        return 0.5f * base * height;
    }

}
