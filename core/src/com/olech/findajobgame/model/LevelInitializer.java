package com.olech.findajobgame.model;

import com.badlogic.gdx.Game;

import java.util.ArrayList;

public class LevelInitializer {
//    config.width = 800;
//    config.height = 480;
//    800 / 32 = 25
//    480 / 32 = 15

    //mechanism to load/save
    private static final String savedGamePath = "";
    private Player player;
    private ArrayList<GameObject> objects = new ArrayList<>();

    public LevelInitializer(boolean newGame, PlayerCharacter character) {
        if(newGame) {
            init(character);
        } else {
            initFromFile();
        }
    }

    private void init(PlayerCharacter character) {
        player = new Player(character);
        objects.add(player);
        objects.add(new EnvironmentGameObject(EnvironmentGameObjectType.IT_Corp, 656, 336));

    }
    private void initFromFile() {

    }

    public Player getPlayer() {
        return player;
    }

    public ArrayList<GameObject> getGameObjects() {
        return objects;
    }
}
