package genericsTutorial;

public class BoxPrinter<T> implements Cloneable{
    private T value;

    public T getValue() {
        return value;
    }

    public BoxPrinter(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "genericsTutorial.BoxPrinter " +"value = " + value;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
