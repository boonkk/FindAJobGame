package com.olech.findajobgame.model;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public enum EnvironmentGameObjectType {
    Tree("tree.png", 96,96),
//    Block(""),
//    Building("")
    IT_Corp("itcorpo.png", 128, 141)
    ;

    //needs to be changed to abstract factory propably or some kind of decorator?

    private final Texture texture;
    private final TextureRegion[][] textureRegions;

    EnvironmentGameObjectType(String path, int tileWidth, int tileHeight) {
        texture = new Texture(path);
        textureRegions = TextureRegion.split(texture,tileWidth, tileHeight);
    }

    //this method needs to be changed
    public TextureRegion getTexture() {
        return textureRegions[0][0];
    }


}
