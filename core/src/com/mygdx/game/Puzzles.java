package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

public class Puzzles extends Game {
    Choices choices;

    @Override
    public void create() {
        this.setScreen(new MenuScreen(this));
        choices = new Choices(this);
    }


    @Override
    public void render() {

        super.render();
    }
}
