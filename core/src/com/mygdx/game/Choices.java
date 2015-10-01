package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

/**
 * Created by k9sty on 2015-09-24.
 */
public class Choices implements Screen {
    private SpriteBatch batch;
    private Texture texture;
    private Sprite sprite;
    private Skin skin;
    Game game;
    Stage stage;
    TextureAtlas badlogic;
    TextButton testButton;
    Image testImage;

    //create buttons with on and off
    public Choices(Game game) {

        this.game = game;
        batch = new SpriteBatch();
        badlogic = new TextureAtlas("button test.pack");
        sprite = new Sprite(texture);
        createButtonImage();
    }

    private void createButtonImage() {
        BitmapFont font = new BitmapFont();
        skin = new Skin();
        skin.addRegions(badlogic);
        TextButton.TextButtonStyle testStyle = new TextButton.TextButtonStyle;
        testStyle.up = skin.getDrawable("badlogic");
        testStyle.down = skin.getDrawable("badlogic");
        testStyle.font = font;
        testButton = new TextButton("", testStyle);
        testButton.setPosition(Gdx.graphics.getWidth() / 2 - Gdx.graphics.getWidth() / 8, Gdx.graphics.getHeight() / 2);
        testImage.addListener(new ClickListener() {
            public void clicked(InputEvent e, float x, float y) {
                System.out.println("clicked");
            }
        });
    }

    @Override
    public void show() {
        Gdx.input.setInputProcessor(stage);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1f, 1f, 1f, 1f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        sprite.draw(batch);
        batch.end();
    }

    @Override
    public void resize(int width, int height) {

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

    @Override
    public void dispose() {
        batch.dispose();
        texture.dispose();
    }
}
