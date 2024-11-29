package Observer;

public class SMSNotificacion implements Observer{
    @Override
    public void update(String message) {
        System.out.println("Notificacion");
    }
}
