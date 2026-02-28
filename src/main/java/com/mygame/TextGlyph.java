/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mygame;

import com.jme3.math.Vector2f;

/**
 *
 * @author xlyndenjayevans
 */
public class TextGlyph {
    
    public Glyph glyph;
    public GlyphMesh glyphMesh;
    public Symbol symbolic;
    
    public TextGlyph(char text, float depth, Vector2f center, Vector2f size, Vector2f boundStart, Vector2f boundEnd){
    
        if(text == '&'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/Ampersand.glyph");//.loadModel("Models/MyModel.j3o");
   
            symbolic = Symbol.UPPERCASE;
            
        }
        else if(text == '`'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/Apostraphe.glyph");//.loadModel("Models/MyModel.j3o");
            symbolic = Symbol.APOSTRAPHE;
        }
        else if(text == '@'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/AtSymbol.glyph");//.loadModel("Models/MyModel.j3o");
            symbolic = Symbol.UPPERCASE;
        }
        else if(text == '\\'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/BackSlash.glyph");//.loadModel("Models/MyModel.j3o");
            symbolic = Symbol.UPPERCASE;
        }
        else if(text == '|'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/Bar.glyph");//.loadModel("Models/MyModel.j3o");
            symbolic = Symbol.NUMBER;
        }
          else if(text == '^'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/Carrot.glyph");//.loadModel("Models/MyModel.j3o");
            symbolic = Symbol.APOSTRAPHE;
        }
         else if(text == '}'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/ClosedBracket.glyph");//.loadModel("Models/MyModel.j3o");
            symbolic = Symbol.NUMBER;
        }
        else if(text == ')'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/ClosedParenthesis.glyph");//.loadModel("Models/MyModel.j3o");
            symbolic = Symbol.NUMBER;
        }
         else if(text == ']'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/ClosedPhone.glyph");//.loadModel("Models/MyModel.j3o");
            symbolic = Symbol.NUMBER;
        }
         else if(text == ':'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/Colon.glyph");//.loadModel("Models/MyModel.j3o");
            symbolic = Symbol.NUMBER;
        }
          else if(text == ','){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/Comma.glyph");//.loadModel("Models/MyModel.j3o");
            symbolic = Symbol.HANGINGLOWERCASE;
        }
        
         else if(text == '-'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/Dash.glyph");//.loadModel("Models/MyModel.j3o");
            symbolic = Symbol.NUMBER;
        }
         else if(text == '$'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/DollarSign.glyph");//.loadModel("Models/MyModel.j3o");
            symbolic = Symbol.UPPERCASE;
        }
         else if(text == '"'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/DoubleQuote.glyph");//.loadModel("Models/MyModel.j3o");
            symbolic = Symbol.APOSTRAPHE;
        }
         else if(text == '8'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/Eight.glyph");//.loadModel("Models/MyModel.j3o");
            symbolic = Symbol.NUMBER;
        }
         else if(text == '='){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/Equals.glyph");//.loadModel("Models/MyModel.j3o");
            symbolic = Symbol.UPPERCASE;
        }
         else if(text == '!'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/Exclamation.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.NUMBER;
        }
         else if(text == '5'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/Five.glyph");//.loadModel("Models/MyModel.j3o");
            symbolic = Symbol.NUMBER;
        }
          else if(text == '/'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/ForeSlash.glyph");//.loadModel("Models/MyModel.j3o");
            symbolic = Symbol.UPPERCASE;
        }
          else if(text == '4'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/Four.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.NUMBER;
        }
          else if(text == '>'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/Greater.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.UPPERCASE;
        }
          else if(text == '<'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/Less.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.UPPERCASE;
        }
          else if(text == 'a'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/LowerCaseA.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.LOWERCASE;
        }
          else if(text == 'b'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/LowerCaseB.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.LOWERCASE;
        }
          else if(text == 'c'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/LowerCaseC.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.LOWERCASE;
        }
          else if(text == 'd'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/LowerCaseD.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.LOWERCASE;
        }
          else if(text == 'e'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/LowerCaseE.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.LOWERCASE;
        }
          else if(text == 'f'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/LowerCaseF.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.LOWERCASE;
        }
          else if(text == 'g'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/LowerCaseG.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.HANGINGLOWERCASE;
        }
          else if(text == 'h'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/LowerCaseH.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.UPPERCASE;
        }
          else if(text == 'i'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/LowerCaseI.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.UPPERCASE;
        }
          else if(text == 'j'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/LowerCaseJ.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.HANGINGLOWERCASE;
        }
          else if(text == 'k'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/LowerCaseK.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.LOWERCASE;
        }
          else if(text == 'l'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/LowerCaseL.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.UPPERCASE;
        }
          else if(text == 'm'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/LowerCaseM.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.LOWERCASE;
        }
          else if(text == 'n'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/LowerCaseN.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.LOWERCASE;
        }
          else if(text == 'o'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/LowerCaseO.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.LOWERCASE;
        }
          else if(text == 'p'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/LowerCaseP.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.HANGINGLOWERCASE;
        }
          else if(text == 'q'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/LowerCaseQ.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.HANGINGLOWERCASE;
        }
          else if(text == 'r'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/LowerCaseR.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.LOWERCASE;
        }
          else if(text == 's'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/LowerCaseS.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.LOWERCASE;
        }
          else if(text == 't'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/LowerCaseT.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.LOWERCASE;
        }
          else if(text == 'u'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/LowerCaseU.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.LOWERCASE;
        }
          else if(text == 'v'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/LowerCaseV.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.LOWERCASE;
        }
          else if(text == 'w'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/LowerCaseW.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.LOWERCASE;
        }
          else if(text == 'x'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/LowerCaseX.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.LOWERCASE;
        }
          else if(text == 'y'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/LowerCaseY.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.HANGINGLOWERCASE;
        }
          else if(text == 'z'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/LowerCaseZ.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.LOWERCASE;
        }
         else if(text == '9'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/Nine.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.NUMBER;
        }
         else if(text == '1'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/One.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.NUMBER;
        }
         else if(text == '{'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/OpenBracket.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.NUMBER;
        }
         else if(text == '('){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/OpenParenthesis.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.NUMBER;
        }
        else if(text == '['){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/OpenPhone.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.NUMBER;
        }
         else if(text == '%'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/Percentage.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.NUMBER;
        }
        else if(text == '.'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/Period.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.HANGINGLOWERCASE;
        }
        else if(text == '+'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/Plus.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.LOWERCASE;
        }
        else if(text == '#'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/PoundSign.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.NUMBER;
        }
        else if(text == '?'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/QuestionMark.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.NUMBER;
        }
          else if(text == '\''){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/Quote.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.APOSTRAPHE;
        }
        else if(text == ';'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/SemiColon.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.NUMBER;
        }
        else if(text == '7'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/Seven.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.NUMBER;
        }
        else if(text == '6'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/Six.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.NUMBER;
        }
        else if(text == '*'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/Star.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.APOSTRAPHE;
        }
        else if(text == '3'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/Three.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.NUMBER;
        }
        else if(text == '~'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/Tilde.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.UPPERCASE;
        }
        else if(text == '2'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/Two.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.NUMBER;
        }
        else if(text == '_'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/Underscore.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.UPPERCASE;
        }
        else if(text == 'A'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/UpperCaseA.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.UPPERCASE;
        }
        else if(text == 'B'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/UpperCaseB.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.UPPERCASE;
        }
        else if(text == 'C'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/UpperCaseC.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.UPPERCASE;
        }
        else if(text == 'D'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/UpperCaseD.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.UPPERCASE;
        }
        else if(text == 'E'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/UpperCaseE.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.UPPERCASE;
        }
        else if(text == 'F'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/UpperCaseF.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.UPPERCASE;
        }
        else if(text == 'G'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/UpperCaseG.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.UPPERCASE;
        }
        else if(text == 'H'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/UpperCaseH.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.UPPERCASE;
        }
        else if(text == 'I'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/UpperCaseI.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.UPPERCASE;
        }
        else if(text == 'J'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/UpperCaseJ.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.UPPERCASE;
        }
        else if(text == 'K'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/UpperCaseK.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.UPPERCASE;
        }
        else if(text == 'L'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/UpperCaseL.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.UPPERCASE;
        }
        else if(text == 'M'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/UpperCaseM.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.UPPERCASE;
        }
        else if(text == 'N'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/UpperCaseN.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.UPPERCASE;
        }
        else if(text == 'O'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/UpperCaseO.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.UPPERCASE;
        }
        else if(text == 'P'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/UpperCaseP.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.UPPERCASE;
        }
        else if(text == 'Q'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/UpperCaseQ.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.UPPERCASE;
        }
        else if(text == 'R'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/UpperCaseR.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.UPPERCASE;
        }
        else if(text == 'S'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/UpperCaseS.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.UPPERCASE;
        }
        else if(text == 'T'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/UpperCaseT.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.UPPERCASE;
        }
        else if(text == 'U'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/UpperCaseU.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.UPPERCASE;
        }
        else if(text == 'V'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/UpperCaseV.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.UPPERCASE;
        }
        else if(text == 'W'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/UpperCaseW.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.UPPERCASE;
        }
        else if(text == 'X'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/UpperCaseX.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.UPPERCASE;
        }
        else if(text == 'Y'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/UpperCaseY.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.UPPERCASE;
        }
        else if(text == 'Z'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/UpperCaseZ.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.UPPERCASE;
        }
        else if(text == '0'){
        
            glyph = (Glyph) App.app.getAssetManager().loadAsset("Glyphs/Zero.glyph");//.loadModel("Models/MyModel.j3o");
    symbolic = Symbol.NUMBER;
        }
        else if (text == ' '){
        
            glyph = new Glyph((short)1, (short)1, (short)4);
            symbolic = Symbol.UPPERCASE;
        }
        
        Vector2f start = new Vector2f();
        Vector2f end = new Vector2f();
        
        if (symbolic == Symbol.UPPERCASE){
         start = center.subtract(new Vector2f(size.x, size.y));
         end =  (center.add(new Vector2f(size.x, size.y)));
         
        } else if (symbolic == Symbol.LOWERCASE){
        start = center.subtract(new Vector2f(size.x, size.y));
         end =  (center.add(new Vector2f(size.x, 0)));
        } else if (symbolic == Symbol.HANGINGLOWERCASE){
        start = center.subtract(new Vector2f(size.x, size.y * 2));
         end =  (center.add(new Vector2f(size.x, 0)));
        } else if (symbolic == Symbol.NUMBER) {
        start = center.subtract(new Vector2f(size.x/2, size.y));
         end =  (center.add(new Vector2f(size.x/2, size.y)));
        } else if (symbolic == Symbol.APOSTRAPHE) {
        start = center.subtract(new Vector2f(size.x,0));
         end =  (center.add(new Vector2f(size.x, size.y)));
        }
        glyphMesh = new GlyphMesh(start, end, boundStart, boundEnd, depth, glyph);
    }
}
