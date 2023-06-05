package machine;

public class Stack {

    private int[] elements;
    private int capacity;
    private int position;

    public Stack(int capacity) {
        this.position = 0;
        this.capacity = capacity;
        elements = new int[capacity];
    }

    public void push(int e){
        if(position == capacity){
            return;
        }
        elements[position] = e;
        position++;
    }

    public int getSize() {
        return position;
    }

    public int pop(){
        if(position == 0){
            return -1000;
        }
        position--;
        return elements[position];
    }

    public String toString(){
        String result = "[";
        for (int i = 0; i < position; i++) {
            result += elements[i];
            if(i == position-1){
                result += "]";
            }
            else {
                result += ",";
            }
        }
        return result;
    }

}
