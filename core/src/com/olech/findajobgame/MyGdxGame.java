package com.olech.findajobgame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.olech.findajobgame.model.Direction;
import com.olech.findajobgame.model.GameObject;
import com.olech.findajobgame.model.Player;

public class MyGdxGame extends ApplicationAdapter {

	private SpriteBatch batch;  //puszka z farba  - otworzyc i zamknac
	private Texture texture;
	private BitmapFont font;
	private GameObject gameObject;
	private static final int moveStepSize = 10;


	@Override
	public void create () {
		texture = new Texture("player_move/downstay.png");
		batch = new SpriteBatch();
		font = new BitmapFont();
		gameObject = new Player(texture);

	}

	@Override
	public void render () {
		update();
		Gdx.gl.glClearColor(98/255f, 114/255f, 114/255f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		batch.begin();

		batch.draw(gameObject.getTexture(),gameObject.x, gameObject.y);
		font.draw(batch, "Job Hunter", 350, 460);

		batch.end();
	}

	private void update() {
		if(Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
			System.out.println("left");
			gameObject.setTexture(new Texture("player_move/leftstay.png"));

			gameObject.moveDir(Direction.LEFT);
		}
		if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
			System.out.println("right");
			gameObject.setTexture(new Texture("player_move/rightstay.png"));

			gameObject.moveDir(Direction.RIGHT);
		}
		if(Gdx.input.isKeyPressed(Input.Keys.UP)) {
			System.out.println("up");
			gameObject.setTexture(new Texture("player_move/upstay.png"));

			gameObject.moveDir(Direction.UP);
		}
		if(Gdx.input.isKeyPressed(Input.Keys.DOWN)) {
			System.out.println("down");
			gameObject.setTexture(new Texture("player_move/downstay.png"));

			gameObject.moveDir(Direction.DOWN);
		}
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void dispose () {
		batch.dispose();
		texture.dispose();
		font.dispose();
	}
}
