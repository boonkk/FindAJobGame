package com.olech.findajobgame.controller;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.olech.findajobgame.model.Direction;
import com.olech.findajobgame.model.ModelContainer;
import com.olech.findajobgame.model.PlayerCharacter;
import com.olech.findajobgame.view.View;

public class Controller {
    private View view;
    private ModelContainer model;
    private PlayerCharacter playerCharacter = PlayerCharacter.Male1;
    private float elapsedTime;

    public void init() {
        model = new ModelContainer(playerCharacter);
    }

    public Controller () {

    }

    public void draw() {
        view.draw(model);
    }
    public void update() {

    }
    public void moveControl(Direction direction) {
        elapsedTime += Gdx.graphics.getDeltaTime();
        model.movePlayer(direction);
    }


}
