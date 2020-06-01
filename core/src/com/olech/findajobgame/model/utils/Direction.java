package com.olech.findajobgame.model.utils;

public enum Direction {
    UP,
    DOWN,
    LEFT,
    RIGHT;

    public Direction getOpposite() {
        switch (this){
            case DOWN:
                return UP;
            case UP:
                return DOWN;
            case LEFT:
                return RIGHT;
            case RIGHT:
                return LEFT;
        }
        return this;
    }
}
