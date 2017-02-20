/**
 * Created by Dmitrii on 16.02.2017.
 */
public class Edit {
    ReadHnd readHnd;

    public Edit(ReadHnd readHnd) {
        this.readHnd = readHnd;
    }

    public void click(){
        readHnd.execute();
    }
}
