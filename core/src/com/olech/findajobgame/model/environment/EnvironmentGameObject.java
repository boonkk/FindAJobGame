package com.olech.findajobgame.model.environment;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.olech.findajobgame.model.gameobject.GameObject;

public class EnvironmentGameObject extends GameObject {
    EnvironmentGameObjectType objectType;
    // todo factory (or sth) method for returning actionable and n
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
