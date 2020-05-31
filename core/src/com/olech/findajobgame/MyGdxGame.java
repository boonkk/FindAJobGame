package com.olech.findajobgame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.olech.findajobgame.controller.Controller;
import com.olech.findajobgame.model.Direction;
import com.olech.findajobgame.model.GameObject;
import com.olech.findajobgame.model.Player;
import com.olech.findajobgame.view.View;

import java.util.ArrayList;

public class MyGdxGame extends ApplicationAdapter {
	Controller controller;

	private SpriteBatch batch;  //puszka z farba  - otworzyc i zamknac
	private Texture texture;
	private BitmapFont font;
	private GameObject gameObject;
	private static final int moveStepSize = 10;
	private float elapsedTime;
	private ArrayList<Animation<TextureRegion>> animations = new ArrayList<>();

	@Override
	public void create () {
		controller = new Controller();
		controller.init();
		texture = new Texture("malechar1.png");
		batch = new SpriteBatch();
		font = new BitmapFont();
		gameObject = new Player(texture);
		animations.add(gameObject.getAnimation());


	}

	@Override
	public void render () {
		update();
		Gdx.gl.glClearColor(98/255f, 114/255f, 114/255f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		batch.begin();
		controller.draw();
		batch.draw(animations.get(0).getKeyFrame(elapsedTime),gameObject.x, gameObject.y);
		//font.draw(batch, "Job Hunter", 350, 460);

		batch.end();
	}

	private void update() {
		elapsedTime += Gdx.graphics.getDeltaTime();

		if(Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
			controller.moveControl(Direction.LEFT);
		}
		else if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
			controller.moveControl(Direction.RIGHT);
		}
		else if(Gdx.input.isKeyPressed(Input.Keys.UP)) {
			controller.moveControl(Direction.UP);
		}
		else if(Gdx.input.isKeyPressed(Input.Keys.DOWN)) {
			controller.moveControl(Direction.DOWN);
		}

	}

	@Override
	public void dispose () {
		batch.dispose();
		texture.dispose();
		font.dispose();
	}
}
