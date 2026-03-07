/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mygame;

import com.jme3.math.Vector2f;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author xlyndenjayevans
 */
public class Omni {
    
    public HashMap<String, Omni> omnis;
    public String text;
    public Vector2f start;
    public Vector2f end;
    public Vector2f boundStart;
    public Vector2f boundEnd;
   
    public Vector2f cursor;
    public float textSize;
    public ArrayList<TextGlyph> txtGlyphs;
    public float depth;
    
    public Omni(String text, float depth, float textSize, Vector2f start, Vector2f end, Vector2f boundStart, Vector2f boundEnd, Glyph backgroundImage){
    
        this.start = start;
        this.end = end;
        this.boundStart = boundStart;
        this.boundEnd = boundEnd;
        this.depth = depth;
        
        this.cursor = new Vector2f(start.x, end.y);
        this.textSize = textSize;
        omnis = new HashMap<>();
        txtGlyphs = new ArrayList<>();
        setText(text);
        addOmni();
        
    }
    
    public void setText(String text){
        this.text = text;
        boolean started = false;
        for (char c:  this.text.toCharArray()){
        System.out.println(c);
            if (!started){
            
              TextGlyph tx = new TextGlyph(c, depth, cursor.add(new Vector2f(this.textSize, -this.textSize)), new Vector2f(this.textSize, this.textSize), boundStart, boundEnd); 
            cursor = cursor.add(new Vector2f((tx.glyphMesh.end.subtract(tx.glyphMesh.start)).x, 0));
            txtGlyphs.add(tx);
            } else {
            
                 
                   TextGlyph tx = new TextGlyph(c, depth, cursor, new Vector2f(this.textSize, this.textSize), boundStart, boundEnd); 
             cursor = cursor.add(new Vector2f((tx.glyphMesh.end.subtract(tx.glyphMesh.start)).x, 0));
             txtGlyphs.add(tx);
            }
            
        }
    }
    
    public void move(Vector2f distance){
    
        for (TextGlyph tx: txtGlyphs){
        
            tx.glyphMesh.start = tx.glyphMesh.start.add(distance);
            tx.glyphMesh.end = tx.glyphMesh.end.add(distance);
            
            tx.glyphMesh.render();
        }
    }
    
    public void addOmni(){
    
    }
    
    public void scroll(Vector2f distance){
    
        for (Omni omni: omnis.values()){
        
            omni.move(distance);
            omni.scroll(distance);
        }
    }
}
