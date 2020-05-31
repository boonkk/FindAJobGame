package com.olech.findajobgame.model;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public enum EnvironmentGameObjectType {
    Tree("tree.png"),
    Block(""),
    Building("")
    ;


    private final Texture texture;
    private final TextureRegion[][] textureRegions;

    EnvironmentGameObjectType(String path) {
        texture = new Texture(path);
        textureRegions = TextureRegion.split(texture,32,32);
    }

    public TextureRegion getTreeTexture() {
        return textureRegions[1][0];
    }


}
