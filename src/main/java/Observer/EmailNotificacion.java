package Observer;

public class EmailNotificacion implements Observer{
    @Override
    public void update(String message) {
        System.out.println("Notificacion");
    }
}
