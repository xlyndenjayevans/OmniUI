/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mygame;

import java.util.HashMap;

/**
 *
 * @author xlyndenjayevans
 */
public class Omni {
    
    public HashMap<String, Omni> omnis;
    public enum Symbol {UPPERCASE, LOWERCASE, DOWNLOWERCASE, NUMBER, APOSTRAPHE};
    
    public Omni(String text, Symbol symbol, Glyph backgroundImage){
    
        omnis = new HashMap<>();
        
    }
}
