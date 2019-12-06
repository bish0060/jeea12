/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cbishop.ass1;

import java.awt.Color;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
/**
 *
 * @author Chris
 */
@FacesConverter("com.cbishop.ass1.ColorConverter")
public class ColorConverter implements Converter{

    private int red = 0;
    private int green = 0;
    private int blue = 0;
    
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
            value = value.replaceAll(" ", "");
            String[] rgb = value.split(","); //split on ,
            if(rgb.length >= 3){
              for(int i =0; i < rgb.length; i++){//remove non #
                  rgb[i] = rgb[i].replaceAll("\\D", "");
              }
              red = Integer.parseInt(rgb[0]);
              green = Integer.parseInt(rgb[1]);
              blue = Integer.parseInt(rgb[2]);
              if(red <= 255 && green <= 255 & blue <= 255){
              return new Color(
                    red,
                    green,
                    blue,
                      1 //alpha value always completly opaque
              );
              }else{
                  return new Color(0,0,0,1);
              }
        }else{
                return new Color(0,0,0,1);
            }
        }

    @Override
    public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
        StringBuilder colorString = new StringBuilder();//java.awt.Color[r=0,g=0,b=255]
        colorString.append("java.awt.Color[r=").append(red).append(",g=").append(green).append(",b=").append(blue).append("]");
        return colorString.toString();
    }
    
}



