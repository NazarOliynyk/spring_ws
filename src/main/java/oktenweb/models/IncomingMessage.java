package oktenweb.models;

/**
 * Created by user on 16.01.19.
 */
public class IncomingMessage {

    public String incomingMessage;

    public IncomingMessage(String incomingMessage) {
        this.incomingMessage = incomingMessage;
    }

    public IncomingMessage() {
    }

    public String getIncomingMessage() {
        return incomingMessage;
    }

    public void setIncomingMessage(String incomingMessage) {
        this.incomingMessage = incomingMessage;
    }

    @Override
    public String toString() {
        return "IncomingMessage{" +
                "incomingMessage='" + incomingMessage + '\'' +
                '}';
    }
}
