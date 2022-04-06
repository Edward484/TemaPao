package strategyExample;

public class ActivityEating implements CurrentActivity{

    @Override
    public String showCurrentActivity() {
        return "I am currently eating";
    }
}
