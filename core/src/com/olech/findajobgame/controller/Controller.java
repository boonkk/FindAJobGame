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
    private boolean newGame = true;

    private ModelContainer model;
    private PlayerCharacter playerCharacter = PlayerCharacter.Male1;
    private float elapsedTime;


    public Controller () {
        view = new View();
        model = new ModelContainer(playerCharacter, newGame);
    }

    public void draw() {
        view.draw(model,elapsedTime);
    }
    public void update() {

    }
    public void moveControl(Direction direction) {
        elapsedTime += Gdx.graphics.getDeltaTime();
        model.movePlayer(direction);
    }

    public ModelContainer getModel() {
        return model;
    }

    public float getElapsedTime() {
        return elapsedTime;
    }

    public void dispose() {
        view.dispose();
    }
}
