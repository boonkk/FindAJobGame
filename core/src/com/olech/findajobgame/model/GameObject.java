package com.olech.findajobgame.model;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import java.awt.*;

public abstract class GameObject extends Rectangle {
    private Texture texture;
    private TextureRegion texRegion;


    public TextureRegion getTexture() {
        return texture;
    }

    public void setTexture(Texture texture) {
        this.texture = texture;
    }

    public abstract TextureRegion[] getAnimationSequence();

}
