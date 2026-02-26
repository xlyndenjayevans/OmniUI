/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mygame;

import com.jme3.asset.AssetInfo;
import com.jme3.asset.AssetLoader;
import com.jme3.export.binary.BinaryImporter;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author xlyndenjayevans
 */
public class GlyphLoader implements AssetLoader {

    @Override
    public Object load(AssetInfo assetInfo) throws IOException {
        BinaryImporter importer = BinaryImporter.getInstance();
        importer.setAssetManager(assetInfo.getManager());
        
        try (InputStream in = assetInfo.openStream()) {
            // This reads the binary data and reconstructs the Savable object
            return importer.load(in);
        }
    }
}