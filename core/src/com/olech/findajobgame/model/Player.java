package com.olech.findajobgame.model;

import com.badlogic.gdx.graphics.Texture;
import com.olech.findajobgame.model.GameObject;

import java.nio.file.DirectoryStream;

public class Player extends GameObject {
    private final int walkingStepSize = 10;
    private Texture[] walkingUp;
    private Texture[] walkingDown;
    private Texture[] walkingLeft;
    private Texture[] walkingRight;
    private Texture stayUp;
    private Texture stayDown;
    private Texture stayLeft;
    private Texture stayRight;

    //todo change constructor parameter to string - name of folder with player set of moves pics
    public Player(Texture texture) {
        super(texture);
    }

    public void moveDir(Direction direction) {
        switch(direction){
            case RIGHT:
                this.x+=walkingStepSize;
                break;

            case LEFT:
                this.x-=walkingStepSize;
                break;

            case UP:
                this.y+=walkingStepSize;

                break;
            case DOWN:
                this.y-=walkingStepSize;
                break;
        }

    }

}
