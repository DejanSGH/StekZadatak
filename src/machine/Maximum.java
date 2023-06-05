package machine;

public class Maximum extends  Operation{

    public Maximum() {
    }

    @Override
    public void execute(Stack stack) {

        if(stack.getSize() < 2) {
            return;
        }
        int value = stack.pop();
        int value2 = stack.pop();

        if(value > value2){
            stack.push(value);
        }
        else{
            stack.push(value2);
        }
    }
}
