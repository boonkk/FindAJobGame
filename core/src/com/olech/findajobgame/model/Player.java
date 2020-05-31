package com.olech.findajobgame.model;

import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Player extends GameObject {
    private final int walkingStepSize = 10;
    private PlayerCharacter character;
    private TextureRegion[] currentAnimationSequence;

//    private int experience;
//    private int luck;
//    private int money;

    public Player(PlayerCharacter character) {
        this.character = character;
    }

    public void setLeftSequence() {
        currentAnimationSequence =  character.getAnimationLeftSequenceArray();
    }

    public void setRightSequence() {
        currentAnimationSequence = character.getAnimationRightSequenceArray();
    }

    public void setUpSequence() {
        currentAnimationSequence = character.getAnimationUpSequenceArray();
    }

    public void setDownSequence() {
        currentAnimationSequence = character.getAnimationDownSequenceArray();
    }

    public void moveDir(Direction direction) {
        switch(direction){
            case RIGHT:
                setRightSequence();
                this.x+=walkingStepSize;
                break;

            case LEFT:
                setLeftSequence();
                this.x-=walkingStepSize;
                break;

            case UP:
                setUpSequence();
                this.y+=walkingStepSize;
                break;

            case DOWN:
                setDownSequence();
                this.y-=walkingStepSize;
                break;
        }
    }

    @Override
    public TextureRegion[] getAnimationSequence() {
        return currentAnimationSequence;
    }


}
