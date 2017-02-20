/**
 * Created by Dmitrii on 16.02.2017.
 */
public class Button {
    EventHnd eventHnd;

    public Button(EventHnd eventHnd) {
        this.eventHnd = eventHnd;
    }

    public void click(){
        eventHnd.execute();
    }
}
