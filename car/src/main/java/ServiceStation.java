public class ServiceStation implements Fixable {


    @Override
    public boolean check(Component component) {
        if (component.getComponentResourse() > 10000) {
            fix(component);
        }
        return true;
    }

    @Override
    public void fix(Component component) {

    }
}
