package com.olech.findajobgame.model;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import java.awt.*;

public abstract class GameObject extends Rectangle {

    public abstract TextureRegion getTextureRegion();


    //todo add some kind of parsing mechanism to make data discrete (divide game area into 32 px square cells)



}
