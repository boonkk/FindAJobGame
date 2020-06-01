package com.olech.findajobgame.model;

import com.badlogic.gdx.graphics.g2d.TextureRegion;

import com.olech.findajobgame.model.board.LevelInitializer;
import com.olech.findajobgame.model.gameobject.GameObject;
import com.olech.findajobgame.model.player.Player;
import com.olech.findajobgame.model.player.PlayerCharacter;
import com.olech.findajobgame.model.utils.Direction;

import java.awt.*;
import java.util.ArrayList;

public class ModelContainer {
    private ArrayList<GameObject> gameObjects;
    private ArrayList<Rectangle> rectangles;
    LevelInitializer levelInitializer;
    Player player;

    public ModelContainer(PlayerCharacter character, boolean newGame) {
        levelInitializer = new LevelInitializer(newGame, character);
        player = levelInitializer.getPlayer();
        gameObjects = levelInitializer.getGameObjects();
        rectangles = levelInitializer.getRectangles();

//        gameObjects.add(new EnvironmentGameObject(EnvironmentGameObjectType.Tree,100, 200));
//        gameObjects.add(new EnvironmentGameObject(EnvironmentGameObjectType.Tree,200, 350));
    }


    public Player getPlayer() {
        return player;
    }

    public void movePlayer(Direction direction){
        player.moveDir(direction);
        for(Rectangle o : rectangles){
            player.checkCollision(o);
        }


    }

    public TextureRegion[] getPlayerAnimationSequence () {
        return player.getAnimationSequence();
    }

    public ArrayList<GameObject> getGameObjects() {
        return gameObjects;
    }
}
