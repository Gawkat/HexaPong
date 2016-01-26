package com.github.gawkat.hexapong.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.github.gawkat.hexapong.HexaPong;
import com.github.gawkat.hexapong.Styles;

public class MenuScreen implements Screen {

	private final HexaPong hexaPong;

	private OrthographicCamera camera;
	private Viewport viewport;

	private Stage menuStage;

	public MenuScreen(final HexaPong hexaPong) {
		this.hexaPong = hexaPong;

		camera = new OrthographicCamera();

		viewport = new StretchViewport(HexaPong.VIRTUAL_WIDTH, HexaPong.VIRTUAL_HEIGHT);
		viewport.apply();

		camera.position.set(camera.viewportWidth / 2, camera.viewportHeight / 2, 0);

		menuStage = new Stage(viewport);
		Gdx.input.setInputProcessor(menuStage);

		/*
		 * UI Elements
		 */

		Label debugLabel = new Label("TEST", Styles.labelStyle);
		debugLabel.setPosition(10, 0);
		menuStage.addActor(debugLabel);
	}

	private void update(float delta) {
		menuStage.act(delta);
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		update(delta);

		menuStage.draw();
	}

	@Override
	public void resize(int width, int height) {
		viewport.update(width, height);
		camera.position.set(camera.viewportWidth / 2, camera.viewportHeight / 2, 0);
	}

	@Override
	public void dispose() {
		menuStage.dispose();
	}

	@Override
	public void show() {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}

	@Override
	public void hide() {
	}

}
