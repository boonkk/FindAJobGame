package com.olech.findajobgame.model;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.TextureRegion;


public class Player extends GameObject implements Animatable{
    private final int walkingStepSize = 2;
    private PlayerCharacter character;
    private TextureRegion[] currentAnimationSequence;
    private Direction currentDirection;
    public static final int GAME_WIDTH = Gdx.graphics.getWidth();
    public static final int GAME_HEIGHT = Gdx.graphics.getHeight();

//    private int experience;
//    private int luck;
//    private int money;

    public Player(PlayerCharacter character) {
        this.character = character;
        currentAnimationSequence = character.getAnimationDownSequenceArray();
        this.height = character.getCharFront().getRegionHeight();
        this.width = character.getCharFront().getRegionWidth();
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
        currentDirection = direction;
        updateCoordinates(direction);
        setMovingSequence(direction);
        checkBorders();
        parseDiscrete();
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void updateCoordinates(Direction direction) {
        switch(direction){
            case RIGHT: this.x+=walkingStepSize;
                break;
            case LEFT: this.x-=walkingStepSize;
                break;
            case UP: this.y+=walkingStepSize;
                break;
            case DOWN: this.y-=walkingStepSize;
                break;
        }
        parseDiscrete();
    }

    private void checkBorders() {
        x = x < 0 ? 0 : x;
        x = x > GAME_WIDTH - 32 ? GAME_WIDTH - 32 : x;
        y = y < 0 ? 0 : y;
        y = y > GAME_HEIGHT - 32 ? GAME_HEIGHT - 32 : y;
        //todo change 32 to constants (or global constants -32 if not needed elsewhere)
    }

    // todo find a better way for animation to be smoother
    private void parseDiscrete() {
        if(x%16 != 0)
            moveDir(currentDirection);
        if(y%16 !=0)
            moveDir(currentDirection);
    }

    @Override
    public TextureRegion[] getAnimationSequence() {
        return currentAnimationSequence;
    }

    public void checkCollision(GameObject o) {
        if(this.intersects(o)) {
            currentDirection = currentDirection.getOpposite();
            updateCoordinates(currentDirection);
            parseDiscrete();
            setMovingSequence(currentDirection.getOpposite());
        }
    }
    @Override
    public TextureRegion getTextureRegion() {
        return character.getCharFront();
    }

    private void setMovingSequence(Direction direction) {
        switch(direction) {
            case RIGHT:
                setRightSequence();
                break;
            case LEFT:
                setLeftSequence();
                break;
            case UP:
                setUpSequence();
                break;
            case DOWN:
                setDownSequence();
                break;
        }
    }
}
