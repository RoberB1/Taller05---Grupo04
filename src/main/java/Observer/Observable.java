package Observer;

public interface Observable {

    void agregarObservers(Observer observer);
    void eliminarObservers(Observer observer);
    void notifyObservers();

} 
