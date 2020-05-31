package com.olech.findajobgame.model;

import com.badlogic.gdx.graphics.g2d.TextureRegion;

import java.util.ArrayList;

public class ModelContainer {
    private ArrayList<GameObject> gameObjects = new ArrayList<>();
    Player player;

    public ModelContainer(PlayerCharacter character) {
        player = new Player(character);
        gameObjects.add(player);
        gameObjects.add(new EnvironmentGameObject(EnvironmentGameObjectType.Tree));
        gameObjects.add(new EnvironmentGameObject(EnvironmentGameObjectType.Tree));
    }

    public Player getPlayer() {
        return player;
    }

    public void movePlayer(Direction direction){
        player.moveDir(direction);
    }

    public TextureRegion[] getPlayerAnimationSequence () {
        return player.getAnimationSequence();
    }

    public ArrayList<GameObject> getGameObjects() {
        return gameObjects;
    }
}
