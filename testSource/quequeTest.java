import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class quequeTest {

    @Test
    public void TesThatDefaultValueOfSizeIsZero(){

        queue myqueue = new queue();
        assertEquals(0,myqueue.getSize());
    }

    @Test
    public void TestForSizeOfTheArray(){
        queue myqueue = new queue();
        assertTrue(myqueue.isEmpty());
    }
        @Test
        public void TestThatAddingAnItemCanBeAddedSuccessfully(){
            queue myqueue = new queue();
            assertTrue(myqueue.isEmpty());
            assertEquals(0,myqueue.getSize());

            myqueue.enqueue(23);
            assertFalse(myqueue.isEmpty());
            assertEquals(1,myqueue.getSize());
        }

        @Test
        public void TestRemovalOfItemFromAList(){
            queue myqueue = new queue();
            myqueue.enqueue(23);
            myqueue.enqueue(4);
            myqueue.enqueue(53);
            myqueue.enqueue(73);
            assertEquals(4,myqueue.getSize());

            myqueue.dequeue();

            assertEquals(3,myqueue.getSize());
        }

        @Test
        public void TestThatYouCanPeekAtAnFrontOfQueue(){
            queue myqueue = new queue();

            myqueue.enqueue(23);
            myqueue.enqueue(4);
            myqueue.enqueue(53);
            myqueue.enqueue(73);

            assertEquals(23,myqueue.peek());

        }
    }

