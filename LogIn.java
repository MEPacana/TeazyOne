import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

/**
 * Created by Marie Curie on 01/04/2017.
 */
public class LogIn extends BasicGameState {
    public String mouse = "";
    public LogIn(int home) {
    }

    @Override
    public int getID() {
        return 1;
    }

    @Override
    public void init(GameContainer container, StateBasedGame game) throws SlickException {
        container.setShowFPS(false);
    }

    @Override
    public void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException {
        Image bg = new Image("res/Components/img-bg01-03.png");
        Image loginform = new Image("res/Components/03 log in/loginform.png");
        g.drawImage(bg,0,0);
        g.drawImage(loginform, 255,160);
        g.drawString(mouse, 50, 100);
    }

    @Override
    public void update(GameContainer container, StateBasedGame game, int delta) throws SlickException {
        int xpos = Mouse.getX();
        int ypos = Mouse.getY();
        mouse = "x pos = "+xpos+"   y pos = "+ypos;

        Input input = container.getInput();	//keyboard and mouse input

        if((xpos>288 && xpos<320) && (ypos>192 && ypos<205) ){
            if(input.isMouseButtonDown(0)){
                game.enterState(0); //go to landing state
            }
        }
        else if((xpos>482 && xpos<502) && (ypos>192 && ypos<206) ){
            if(input.isMouseButtonDown(0)){
                game.enterState(3); //go to main user
            }
        }
    }
}
