package com.github.gawkat.hexapong;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;

public class Styles {

	public static LabelStyle labelStyle;

	public static void loadStyles(final HexaPong hexaPong) {
		labelStyle = new LabelStyle(hexaPong.font, Color.WHITE);
	}

}
