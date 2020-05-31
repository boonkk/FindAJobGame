package com.olech.findajobgame.model;

import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class EnvironmentGameObject extends GameObject {
    EnvironmentGameObjectType objectType;

    public EnvironmentGameObject(EnvironmentGameObjectType objectType, int x, int y) {
        this.objectType = objectType;
        this.x = x;
        this.y = y;
    }

    @Override
    public TextureRegion getTextureRegion() {
        return null;
    }

//
//    public TextureRegion[] getAnimationSequence() {
//        return new TextureRegion[0];
//    }

}
