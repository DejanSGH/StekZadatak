package machine;

import java.util.ArrayList;
import java.util.List;

public class Program {

    private Stack stack;
    //private Operation[] operations;

    List<Operation> operations = new ArrayList();
    private int position = 0;

    public Program(Stack stack) {
        this.stack = stack;
        //operations = new Operation[10];
    }

    public void add(Operation o){
        //operations[position] = o;
        operations.add(o);
    }

    public void execute(){
        for (int i = 0; i <= operations.size()-1; i++) {
            //operations[i].execute(stack);
            operations.get(i).execute(stack);
        }
    }
}
