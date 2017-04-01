import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

/**
 * Created by Marie Curie on 01/04/2017.
 */
public class SignUp extends BasicGameState {
    public String mouse = "";
    public SignUp(int signup) {
    }

    @Override
    public int getID() {
        return 2;
    }

    @Override
    public void init(GameContainer container, StateBasedGame game) throws SlickException {
        container.setShowFPS(false);
    }

    @Override
    public void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException {
        Image bg = new Image("res/Components/img-bg01-03.png");
        Image signinform = new Image("res/Components/02 sign up/signinform.png");
        g.drawImage(bg,0,0);
        g.drawImage(signinform, 230,100);
        g.drawString(mouse, 50, 100);
    }

    @Override
    public void update(GameContainer container, StateBasedGame game, int delta) throws SlickException {
        int xpos = Mouse.getX();
        int ypos = Mouse.getY();
        mouse = "x pos = "+xpos+"   y pos = "+ypos;

        Input input = container.getInput();	//keyboard and mouse input
        if((xpos>296 && xpos<328) && (ypos>121 && ypos<134) ){
            if(input.isMouseButtonDown(0)){
                game.enterState(0); //go to landing state
            }
        }
        else if((xpos>487 && xpos<509) && (ypos>122 && ypos<135) ){
            if(input.isMouseButtonDown(0)){
                game.enterState(3); //go to main user
            }
        }

    }
}
