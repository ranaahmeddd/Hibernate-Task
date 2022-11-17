package observer;

public class OctalObserver extends Observer{

    public OctalObserver(Subject subject) {
        this.subject = subject;
        subject.addToList(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: " + Integer.toOctalString( subject.getState() ));
    }
}
