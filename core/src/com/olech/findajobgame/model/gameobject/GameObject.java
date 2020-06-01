package com.olech.findajobgame.model.gameobject;


import com.badlogic.gdx.graphics.g2d.TextureRegion;

import java.awt.*;

public abstract class GameObject extends Rectangle {
    // decide if extending rectangle is necessary propably not
    // put more things from Player and Environment into this class

    // RECTANGLE provides easy check for collisions
    public abstract TextureRegion getTextureRegion();


    //todo add some kind of parsing mechanism to make data discrete (divide game area into 32 px square cells)



}
