package com.olech.findajobgame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.olech.findajobgame.controller.Controller;
import com.olech.findajobgame.model.*;
import com.olech.findajobgame.model.utils.Direction;


public class MyGdxGame extends ApplicationAdapter {
	Controller controller;

	private ShapeRenderer shapeRenderer;

	@Override
	public void create () {
		controller = new Controller();
		shapeRenderer = new ShapeRenderer();
	}

	@Override
	public void render () {
		update();
		Gdx.gl.glClearColor(98/255f, 114/255f, 114/255f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		ModelContainer model = controller.getModel();

		controller.draw();
	}

	private void update() {
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
		controller.dispose();
	}
}
