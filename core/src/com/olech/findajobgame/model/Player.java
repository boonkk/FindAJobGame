package com.olech.findajobgame.model;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.olech.findajobgame.MyGdxGame;

public class Player extends GameObject implements Animatable{
    private final int walkingStepSize = 5;
    private PlayerCharacter character;
    private TextureRegion[] currentAnimationSequence;
    public static final int GAME_WIDTH = Gdx.graphics.getWidth();
    public static final int GAME_HEIGHT = Gdx.graphics.getHeight();

//    private int experience;
//    private int luck;
//    private int money;

    public Player(PlayerCharacter character) {
        this.character = character;
        currentAnimationSequence = character.getAnimationDownSequenceArray();
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
        checkBorders();
    }

    private void checkBorders() {
        x = x < 0 ? 0 : x;
        x = x > GAME_WIDTH - 32 ? GAME_WIDTH - 32 : x;
        y = y < 0 ? 0 : y;
        y = y > GAME_HEIGHT - 32 ? GAME_HEIGHT - 32 : y;
        //todo change 32 to constants (or global constants -32 if not needed elsewhere)
    }

    @Override
    public TextureRegion[] getAnimationSequence() {
        return currentAnimationSequence;
    }


    @Override
    public TextureRegion getTextureRegion() {
        return null;
    }
}
