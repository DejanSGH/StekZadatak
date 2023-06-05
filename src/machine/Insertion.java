package machine;

public class Insertion extends Operation {

    private int value;

    public Insertion(int value) {
        this.value = value;
    }

    @Override
    public void execute(Stack stack) {
        stack.push(value);
    }
}
