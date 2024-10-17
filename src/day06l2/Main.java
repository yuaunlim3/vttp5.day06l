package day06l2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        
        MyImplementation my1 = new MyImplementation();
        MyImplementation my2 = new MyImplementation();
        MyImplementation my3 = new MyImplementation();
        MyImplementation my4 = new MyImplementation();
        MyImplementation my5 = new MyImplementation();

        //Execute task using single thread
        //ExecutorService es = Executors.newSingleThreadExecutor();
        //es.execute(my1);
        //es.execute(my2);
        
        //Shutdown
        //es.shutdown();

        //Execute using fixed thread pool
        ExecutorService es2 = Executors.newFixedThreadPool(5);

        es2.execute(my3);
        es2.execute(my4);
        es2.execute(my5);

        es2.shutdown();


    }
    
}
