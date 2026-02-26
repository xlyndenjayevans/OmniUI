/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mygame;

/**
 *
 * @author xlyndenjayevans
 */
public class TextGlyph {
    
    Glyph glyph;
    
    public TextGlyph(char text){
    
        if(text == '&'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/Ampersand.glyph");//.loadModel("Models/MyModel.j3o");
   
            
        }
        else if(text == '`'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/Apostraphe.glyph");//.loadModel("Models/MyModel.j3o");
    
        }
        else if(text == '@'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/AtSymbol.glyph");//.loadModel("Models/MyModel.j3o");
    
        }
        else if(text == '\\'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/BackSlash.glyph");//.loadModel("Models/MyModel.j3o");
    
        }
        else if(text == '|'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/Bar.glyph");//.loadModel("Models/MyModel.j3o");
    
        }
          else if(text == '^'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/Carrot.glyph");//.loadModel("Models/MyModel.j3o");
    
        }
         else if(text == '}'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/ClosedBracket.glyph");//.loadModel("Models/MyModel.j3o");
    
        }
        else if(text == ')'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/ClosedParenthesis.glyph");//.loadModel("Models/MyModel.j3o");
    
        }
         else if(text == ']'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/ClosedPhone.glyph");//.loadModel("Models/MyModel.j3o");
    
        }
         else if(text == ':'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/Colon.glyph");//.loadModel("Models/MyModel.j3o");
    
        }
          else if(text == ','){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/Comma.glyph");//.loadModel("Models/MyModel.j3o");
    
        }
        
         else if(text == '-'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/Dash.glyph");//.loadModel("Models/MyModel.j3o");
    
        }
         else if(text == '$'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/DollarSign.glyph");//.loadModel("Models/MyModel.j3o");
    
        }
         else if(text == '"'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/DoubleQuote.glyph");//.loadModel("Models/MyModel.j3o");
    
        }
    }
}
