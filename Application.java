/**
 * Created by User on 3/31/2017.
 */
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
public class Application extends StateBasedGame{
    public static final String appName = "Teazy";
    public static final int landingstate = 0;
    public static final int login = 1;
    public static final int signup = 2;
    public static final int main = 3;
    public static final int alltasks = 4;
    public static final int todayview = 5;
    public static final int weekview = 6;


    public Application(String appName){
        super(appName);
        this.addState(new LandingState(landingstate));
        this.addState(new LogIn(login));
        this.addState(new SignUp(signup));
        this.addState(new MainUser(main));
        this.addState(new AllTasks(alltasks));
        this.addState(new TodayView(todayview));
        this.addState(new WeekView(weekview));
    }

    @Override
    public void initStatesList(GameContainer gameContainer) throws SlickException {
        this.getState(landingstate).init(gameContainer,this);
        this.getState(login).init(gameContainer,this);
        this.getState(signup).init(gameContainer,this);
        this.getState(main).init(gameContainer,this);
        this.getState(alltasks).init(gameContainer,this);
        this.getState(todayview).init(gameContainer,this);
        this.getState(weekview).init(gameContainer,this);


        this.enterState(landingstate);
    }

    public static void main(String[] args){
        AppGameContainer appgc;
        try{
            appgc = new  AppGameContainer((new Application(appName)));
            appgc.setDisplayMode(810,540,false);
            appgc.start();

        }catch(SlickException e){
            e.printStackTrace();
        }
    }
}