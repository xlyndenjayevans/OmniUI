/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mygame;

import com.jme3.math.Vector2f;
import java.util.HashMap;

/**
 *
 * @author xlyndenjayevans
 */
public class Omni {
    
    public HashMap<String, Omni> omnis;
    public enum Symbol {UPPERCASE, LOWERCASE, DOWNLOWERCASE, NUMBER, APOSTRAPHE};
    public String text;
    public Vector2f start;
    public Vector2f end;
    public Vector2f cursor;
    public float textSize;
    
    public Omni(String text, float textSize, Vector2f start, Vector2f end, Glyph backgroundImage){
    
        this.start = start;
        this.end = end;
        this.cursor = new Vector2f(start.x, end.y);
        this.textSize = textSize;
        omnis = new HashMap<>();
        setText(text);
        
    }
    
    public void setText(String text){
        this.text = text;
        boolean started = false;
        for (char c:  this.text.toCharArray()){
        System.out.println(c);
            if (!started){
            
              TextGlyph tx = new TextGlyph(c, 0, cursor.add(new Vector2f(this.textSize, -this.textSize)), new Vector2f(this.textSize, this.textSize), start, end); 
            cursor = cursor.add(new Vector2f((tx.glyphMesh.end.subtract(tx.glyphMesh.start)).x, 0));
            } else {
            
                 
                   TextGlyph tx = new TextGlyph(c, 0, cursor, new Vector2f(this.textSize, this.textSize), start, end); 
             cursor = cursor.add(new Vector2f((tx.glyphMesh.end.subtract(tx.glyphMesh.start)).x, 0));
         
            }
            
        }
    }
    
    public void move(Vector2f distance){
    
    }
}
