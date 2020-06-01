package com.olech.findajobgame.model.board;


import com.olech.findajobgame.model.gameobject.GameObject;

import com.olech.findajobgame.model.player.Player;
import com.olech.findajobgame.model.player.PlayerCharacter;

import java.awt.*;
import java.util.ArrayList;

public class LevelInitializer {
    //todo mechanism to load/save from/to file
    private static final String savedGamePath = "";
    private Player player;
    private ArrayList<GameObject> objects = new ArrayList<>();
    private ArrayList<Rectangle> rectangles = new ArrayList<>();

    public LevelInitializer(boolean newGame, PlayerCharacter character) {
        if(newGame) {
            init(character);
        } else {
            initFromFile();
        }
    }

    private void init(PlayerCharacter character) {
        int cellDim = 32;
        player = new Player(character);
        objects.add(player);

        //still not perfect way to do this
        rectangles.add(new Rectangle(0, 10*cellDim, 32,64));            // flowers
        rectangles.add(new Rectangle(1*cellDim, 11*cellDim, 64,96));    // house
        rectangles.add(new Rectangle(3*cellDim, 10*cellDim, 32,96));    // flowers
        rectangles.add(new Rectangle(4*cellDim, 12*cellDim, 128,64));   //trees
        rectangles.add(new Rectangle(16*cellDim,11*cellDim,64,96));     //small house
        rectangles.add(new Rectangle(18*cellDim,9*cellDim, 96, 160));   //house + bushes
        rectangles.add(new Rectangle(21*cellDim,10*cellDim, 32, 256));  // it corp entrance
        rectangles.add(new Rectangle(22*cellDim,9*cellDim, 96, 192));   //bushes + building
        rectangles.add(new Rectangle(22*cellDim,1*cellDim, 96, 224));   //pink trees


//        objects.add(new EnvironmentGameObject(EnvironmentGameObjectType.IT_Corp, 656, 336));
//        objects.add(new EnvironmentGameObject(EnvironmentGameObjectType.Bush, 640, 456));
//        objects.add(new EnvironmentGameObject(EnvironmentGameObjectType.Bush, 640, 426));
//        objects.add(new EnvironmentGameObject(EnvironmentGameObjectType.Bush, 640, 396));
//        objects.add(new EnvironmentGameObject(EnvironmentGameObjectType.Bush, 640, 366));
//        objects.add(new EnvironmentGameObject(EnvironmentGameObjectType.Bush, 640, 336));
//        objects.add(new EnvironmentGameObject(EnvironmentGameObjectType.Bush, 640, 306));
//        objects.add(new EnvironmentGameObject(EnvironmentGameObjectType.Bush, 640, 276));
//        objects.add(new EnvironmentGameObject(EnvironmentGameObjectType.Bush, 640, 246));
//
//
//        objects.add(new EnvironmentGameObject(EnvironmentGameObjectType.Bush, 688, 306));
//        objects.add(new EnvironmentGameObject(EnvironmentGameObjectType.Bush, 688, 276));
//        objects.add(new EnvironmentGameObject(EnvironmentGameObjectType.Bush, 688, 246));
//        objects.add(new EnvironmentGameObject(EnvironmentGameObjectType.Bush, 704, 246));
//        objects.add(new EnvironmentGameObject(EnvironmentGameObjectType.Bush, 720, 246));
//        objects.add(new EnvironmentGameObject(EnvironmentGameObjectType.Bush, 736, 246));
//        objects.add(new EnvironmentGameObject(EnvironmentGameObjectType.Bush, 752, 246));
//        objects.add(new EnvironmentGameObject(EnvironmentGameObjectType.Bush, 768, 246));
//        objects.add(new EnvironmentGameObject(EnvironmentGameObjectType.Bush, 784, 246));
//        objects.add(new EnvironmentGameObject(EnvironmentGameObjectType.Tree2, 707, 115));
//        objects.add(new EnvironmentGameObject(EnvironmentGameObjectType.Tree1, 707, 50));
//        objects.add(new EnvironmentGameObject(EnvironmentGameObjectType.Tree2, 707, 0));
//        objects.add(new EnvironmentGameObject(EnvironmentGameObjectType.Building1, 567, 310));

    }
    private void initFromFile() {

    }

    public Player getPlayer() {
        return player;
    }

    public ArrayList<GameObject> getGameObjects() {
        return objects;
    }

    public ArrayList<Rectangle> getRectangles() {
        return rectangles;
    }
}
