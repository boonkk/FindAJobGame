package com.olech.findajobgame.model;

import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class EnvironmentGameObject extends GameObject {
    EnvironmentGameObjectType objectType;

    public EnvironmentGameObject(EnvironmentGameObjectType objectType) {
        this.objectType = objectType;
    }

    @Override
    public TextureRegion[] getAnimationSequence() {
        return new TextureRegion[0];
    }

    @Override
    public TextureRegion getTexture() {
        return objectType.getTreeTexture();
    }
}
