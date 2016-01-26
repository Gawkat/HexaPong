package com.github.gawkat.hexapong;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.github.gawkat.hexapong.screens.MenuScreen;

public class HexaPong extends Game {

	public SpriteBatch batch;
	public BitmapFont font;

	public static final int VIRTUAL_WIDTH = 1280;
	public static final int VIRTUAL_HEIGHT = 800;

	@Override
	public void create() {
		batch = new SpriteBatch();

		loadFonts();
		Styles.loadStyles(this);

		this.setScreen(new MenuScreen(this));
	}

	@Override
	public void render() {
		super.render();
	}

	@Override
	public void dispose() {
		batch.dispose();
	}

	private void loadFonts() {
		font = new BitmapFont();

		FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal("8bitFont.ttf"));
		FreeTypeFontGenerator.FreeTypeFontParameter parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
		parameter.size = 72;
		font = generator.generateFont(parameter);
		font.getRegion().getTexture().setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
		generator.dispose();
	}

}
