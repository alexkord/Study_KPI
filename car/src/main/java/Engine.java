public class Engine extends Component {
    static final int periodOfFix = 10_000;


    public Engine() {
        this.componentResourse = 20_000;
    }

    public int getNextLimitResourse() {
        return componentResourse + periodOfFix;
    }
}
