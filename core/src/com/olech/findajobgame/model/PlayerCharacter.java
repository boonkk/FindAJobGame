package com.olech.findajobgame.model;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public enum  PlayerCharacter {
    Male1("male1.png"),
    Male2("male2.png"),
    Female1("female1.png"),
    Female2("female2.png"),
    ;
    private static final int charFrontX = 32;
    private static final int charFrontY = 96;
    private static final int charDimension = 32;
    private Texture texture;

    TextureRegion[][] textureRegions;
    private TextureRegion[] animationLeftSequenceArray;
    private TextureRegion[] animationRightSequenceArray;
    private TextureRegion[] animationUpSequenceArray;
    private TextureRegion[] animationDownSequenceArray;


    PlayerCharacter(String path) {
        texture = new Texture(path);

        textureRegions = TextureRegion.split(texture,32,32);
    }

    public TextureRegion getCharFront() {
        return textureRegions[0][1];
    }

    public TextureRegion[] getAnimationLeftSequenceArray() {
        return textureRegions[1];
    }

    public TextureRegion[] getAnimationRightSequenceArray() {
        return textureRegions[2];
    }

    public TextureRegion[] getAnimationUpSequenceArray() {
        return textureRegions[3];
    }

    public TextureRegion[] getAnimationDownSequenceArray() {
        return textureRegions[0];
    }
}
