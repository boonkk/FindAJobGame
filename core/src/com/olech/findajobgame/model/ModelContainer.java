package com.olech.findajobgame.model;

import com.badlogic.gdx.graphics.g2d.TextureRegion;

import java.util.ArrayList;

public class ModelContainer {
    private ArrayList<GameObject> gameObjects = new ArrayList<>();
    LevelInitializer levelInitializer;
    Player player;

    public ModelContainer(PlayerCharacter character, boolean newGame) {
        levelInitializer = new LevelInitializer(newGame, character);
        player = levelInitializer.getPlayer();
        gameObjects = levelInitializer.getGameObjects();

//        gameObjects.add(new EnvironmentGameObject(EnvironmentGameObjectType.Tree,100, 200));
//        gameObjects.add(new EnvironmentGameObject(EnvironmentGameObjectType.Tree,200, 350));
    }


    public Player getPlayer() {
        return player;
    }

    public void movePlayer(Direction direction){
        player.moveDir(direction);
        for(GameObject o : gameObjects){
            if(o instanceof Player)
                continue;
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
