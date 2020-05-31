package com.olech.findajobgame.view;

import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.olech.findajobgame.model.Animatable;
import com.olech.findajobgame.model.GameObject;
import com.olech.findajobgame.model.ModelContainer;




public class View {
    private SpriteBatch batch;

    public View() {
        batch = new SpriteBatch();
    }


    public void draw(ModelContainer model, float elapsedTime) {
        batch.begin();
//        System.out.println(model.getGameObjects().get(0));
//        System.out.println(model.getGameObjects().get(0).getAnimationSequence().length);
//        Animation<TextureRegion> animation = new Animation<>(1f/10f, model.getGameObjects().get(0).getAnimationSequence());
//        batch.draw(animation.getKeyFrame(elapsedTime), model.getGameObjects().get(0).x, model.getGameObjects().get(0).y);
        model.getGameObjects()
                .forEach(object -> {
                    if( object instanceof Animatable ) {
                        Animation<TextureRegion> animation = new Animation<>(1f/10f, ((Animatable) object).getAnimationSequence());
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
