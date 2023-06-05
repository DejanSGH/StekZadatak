package machine;

public class Subtraction extends Operation {

    private int value;

    public Subtraction(int value) {
        if(value > 0){
            this.value = value;
        }
        else{
            this.value = 1;
        }
    }

    @Override
    public void execute(Stack stack) {
        for (int i = 0; i < value; i++) {
            stack.pop();
        }
//       stack.push(stack.pop()-value);
    }
}
