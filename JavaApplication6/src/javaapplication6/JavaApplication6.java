/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.ArrayList;

/**
 *
 * @author alend
 */
public class JavaApplication6
{

    public static void main(String[] args)
    {
        ArrayList<Color> Colorsss = new ArrayList<>();
        
        
        Color SkyBlue = new Color();
        SkyBlue.setCol("Sky blue");
        
        Color DeepBrown = new Color();
        DeepBrown.setCol("Deep brown");
        
        Color BrightRed = new Color();
        BrightRed.setCol("Bright red");
        
        Color RedOrange = new Color();
        RedOrange.setCol("Red orange");
        
        Color Green = new Color();
        Green.setCol("Green");
        
        Color PaleRose = new Color();
        PaleRose.setCol("Pale Rose");
        
        Colorsss.add(SkyBlue);
        Colorsss.add(DeepBrown);
        Colorsss.add(BrightRed);
        Colorsss.add(RedOrange);
        Colorsss.add(Green);
        Colorsss.add(PaleRose);
        
        for(Color g : Colorsss )
        {
           System.out.println(g.getCol());
            
        }
        
        
        
    }
    
}
