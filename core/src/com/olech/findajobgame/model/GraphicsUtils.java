package com.olech.findajobgame.model;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class GraphicsUtils {
    public static TextureRegion[][] getSequenceArray(String animationSequencePath) {
        return TextureRegion.split(new Texture(animationSequencePath), 32, 32);
    }


}
