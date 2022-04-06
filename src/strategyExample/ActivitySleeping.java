package strategyExample;

public class ActivitySleeping implements CurrentActivity{

    @Override
    public String showCurrentActivity() {
        return "I am currently sleeping";
    }
}
