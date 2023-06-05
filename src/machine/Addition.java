package machine;

public class Addition extends Operation {

    private int value;

    public Addition() {
    }

    @Override
    public void execute(Stack stack) {
        for (int i = 0; i < 2; i++) {
            value += stack.pop();
        }
        stack.push(value);
    }
}
