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

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        String[] temp;
        temp = value.split("\\,");
        Color color = new Color(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]), Integer.parseInt(temp[2]));
        return color;
        
        // Color.decode((string)value); used if you do #FFFFFF
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        String colorAsString;
        colorAsString = value.toString();
        colorAsString = colorAsString.replace("java.awt.Color[r=", "");
        colorAsString = colorAsString.replace("g=", "");
        colorAsString = colorAsString.replace("b=", "");
        colorAsString = colorAsString.replace("]", "");
        return colorAsString;
    }
    
}
