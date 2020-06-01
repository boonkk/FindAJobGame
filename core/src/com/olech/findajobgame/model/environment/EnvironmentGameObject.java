package com.olech.findajobgame.model;

import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class EnvironmentGameObject extends GameObject {
    EnvironmentGameObjectType objectType;

    public EnvironmentGameObject(EnvironmentGameObjectType objectType, int x, int y) {
        this.objectType = objectType;
        this.x = x;
        this.y = y;

        this.width = objectType.getTexture().getRegionWidth();
        this.height = objectType.getTexture().getRegionHeight();
        //should be static final

    }

    @Override
    public TextureRegion getTextureRegion() {
        return objectType.getTexture();
    }

//
//    public TextureRegion[] getAnimationSequence() {
//        return new TextureRegion[0];
//    }

}
