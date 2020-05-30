package com.olech.findajobgame.model;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.TextureArray;
import com.badlogic.gdx.graphics.TextureData;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import java.awt.*;

public abstract   class  GameObject extends Rectangle {
    private Texture texture;
    private TextureRegion texRegion;
    public GameObject(Texture texture) {
        this.texture = texture;
        //texRegion = new TextureRegion(texture,texture);
    }

    public Texture getTexture() {
        return texture;
    }

    public void setTexture(Texture texture) {
        this.texture = texture;
    }

    public abstract void moveDir(Direction direction);
}
