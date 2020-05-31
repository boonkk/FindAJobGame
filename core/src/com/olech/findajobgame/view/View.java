package com.olech.findajobgame.view;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.olech.findajobgame.model.GameObject;
import com.olech.findajobgame.model.ModelContainer;


import java.util.ArrayList;

public class View {
    private Texture texture;
    private BitmapFont font;
    private Animation playerAnimation;
    private ArrayList<GameObject> gameObjects;
    private static final int moveStepSize = 10;
    private float elapsedTime;
    private ArrayList<Animation<TextureRegion>> animations = new ArrayList<>();

    public View() {

    }


    public void draw(ModelContainer model) {

        model.getGameObjects().stream()
                .map(gameObject -> gameObject.g)
        animations.add(gameObject.getAnimation());
    }


    // some stuff connected with drawing board, objects
    // consider adding another view
}
