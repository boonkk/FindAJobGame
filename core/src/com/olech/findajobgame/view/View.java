package com.olech.findajobgame.view;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.olech.findajobgame.model.utils.Animatable;
import com.olech.findajobgame.model.ModelContainer;


public class View {
    private SpriteBatch batch;

    public View() {
        batch = new SpriteBatch();
    }


    public void draw(ModelContainer model, float elapsedTime) {

        ShapeRenderer shapeRenderer = new ShapeRenderer();
        shapeRenderer.begin(ShapeRenderer.ShapeType.Line);
        shapeRenderer.setColor(0, 1, 1, 1);


        int squaresOnHeight = 480/32;
        int squaresOnWidth = 800/32;


        for(int y = 0; y < squaresOnHeight; y++){
            for(int x = 0; x < squaresOnWidth; x++){
                shapeRenderer.rect(x*32, y*32, 32, 32);
            }
        }
        shapeRenderer.end();
        batch.begin();
        batch.draw(new Texture("backgroundgame.png"),0,0);
//        System.out.println(model.getGameObjects().get(0));
//        System.out.println(model.getGameObjects().get(0).getAnimationSequence().length);
//        Animation<TextureRegion> animation = new Animation<>(1f/10f, model.getGameObjects().get(0).getAnimationSequence());
//        batch.draw(animation.getKeyFrame(elapsedTime), model.getGameObjects().get(0).x, model.getGameObjects().get(0).y);
        model.getGameObjects()
                .forEach(object -> {
                    if( object instanceof Animatable ) {
                        Animation<TextureRegion> animation = new Animation<>(1f/20f, ((Animatable) object).getAnimationSequence());
                        animation.setPlayMode(Animation.PlayMode.LOOP);
                        batch.draw(animation.getKeyFrame(elapsedTime), object.x, object.y);
                    } else if(object != null)
                        batch.draw(object.getTextureRegion(), object.x, object.y);
                });
        batch.end();
    }

    public void dispose() {
        batch.dispose();
    }

    // some stuff connected with drawing board, objects
    // consider adding another view
}
