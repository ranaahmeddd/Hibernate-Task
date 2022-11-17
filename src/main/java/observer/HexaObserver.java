package observer;

public class HexaObserver extends Observer{

    public HexaObserver(Subject subject) {
        this.subject= subject;
        subject.addToList(this);
    }

    @Override
    public void update() {
        System.out.println( "Hexa String: " + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}
