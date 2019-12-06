/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cbishop.ass1;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.awt.Color;
import java.io.IOException;

/**
 *
 * @author Chris
 */
public class ColorJsonSerializer extends StdSerializer<Color>{
    
    public ColorJsonSerializer() {
        this(null);
    }
    
    public ColorJsonSerializer(Class<Color> c){
        super(c);
    }
    
    @Override
    public void serialize(Color t, JsonGenerator jg, SerializerProvider sp) throws IOException, JsonGenerationException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    }
    
}
