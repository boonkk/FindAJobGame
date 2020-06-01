package com.olech.findajobgame.model.environment;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public enum EnvironmentGameObjectType {
    Tree1("tree1.png", 93,96),
    Tree2("tree2.png", 90,75),
    Building1("building1.png", 70, 172),
    // todo change hardcoding values
//    Block(""),
//    Building("")
    IT_Corp("itcorpo.png", 128, 141),
    Bush("bush1.png", 16, 30)
    ;

    //needs to be changed to abstract factory propably or some kind of decorator?

    private final Texture texture;
    private final TextureRegion[][] textureRegions;

    EnvironmentGameObjectType(String path, int tileWidth, int tileHeight) {
        texture = new Texture(path);
        textureRegions = TextureRegion.split(texture,texture.getWidth(), texture.getHeight());
    }

    //this method needs to be changed
    public TextureRegion getTexture() {
        return textureRegions[0][0];
    }


}
