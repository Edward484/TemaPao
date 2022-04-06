package strategyExample;

public class ActivityPlay implements CurrentActivity{
    @Override
    public String showCurrentActivity() {
        return "Playing with my friends";
    }
}
