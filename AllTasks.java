import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

/**
 * Created by Marie Curie on 01/04/2017.
 */
public class AllTasks extends BasicGameState {
    public String mouse = "";
    public AllTasks(int alltasks) {
    }

    @Override
    public int getID() {
        return 4;
    }

    @Override
    public void init(GameContainer container, StateBasedGame game) throws SlickException {
        container.setShowFPS(false);
    }

    @Override
    public void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException {
        Image bg = new Image("res/Components/04 home/bg-main.png");
        Image leftpanel = new Image("res/Components/04 home/leftpanel.png");
        Image iconalltasks = new Image("res/Components/04 home/iconalltasks.png");
        Image icontoday = new Image("res/Components/04 home/icontoday.png");
        Image iconthisweek = new Image("res/Components/04 home/iconthisweek.png");
        Image iconcategory = new Image("res/Components/04 home/iconcategory.png");
        Image selectorview = new Image("res/Components/04 home/selectorview.png");
        Image empty = new Image("res/Components/04 home/empty.png");
        Image addnewcategory = new Image("res/Components/04 home/addnewcategory.png");
        Image fab = new Image("res/Components/04 home/fab.png");
        Image taskbox = new Image("res/Components/04 home/taskbox.png");

        g.drawImage(bg,0,0);
        g.drawImage(leftpanel, 0,0);
        g.drawImage(selectorview,0,145);
        g.drawImage(iconalltasks,25, 155);
        g.drawImage(icontoday,25, 145+34+(34-24)/2);
        g.drawImage(iconthisweek,25,145+34*2+(34-24)/2);
        g.drawImage(iconcategory,25,280);
        g.drawImage(empty, 320, 110);
        g.drawImage(fab,730,460);
        g.drawImage(addnewcategory, 30,320);
        g.drawString(mouse, 50, 100);
    }

    @Override
    public void update(GameContainer container, StateBasedGame game, int delta) throws SlickException {
        int xpos = Mouse.getX();
        int ypos = Mouse.getY();
        mouse = "x pos = "+xpos+"   y pos = "+ypos;

        Input input = container.getInput();	//keyboard and mouse input
    }
}
