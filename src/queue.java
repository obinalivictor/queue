import java.util.ArrayList;

    public class queue {
    private ArrayList<Integer>queueContent = new ArrayList<>();


    public int getSize(){
        return queueContent.size();
    }




        public boolean isEmpty() {

            return queueContent.isEmpty();
        }

        public void enqueue(int number) {
        queueContent.add(number);
        }

        public int dequeue() {
        if(isEmpty()){
            throw new IllegalStateException("queue is empty");
        }
            return queueContent.remove(0);
        }

        public int peek() {
        if(isEmpty()){
            throw new IllegalStateException("queue is empty");
        }
            return queueContent.get(0);
        }
    }


