public class G1Demo {
    public static void main(String[] args) {

        //allocates objects in loop
        for(int i=0;i<100000;i++){
            Object obj = new Object();

        }

        //explicitely trigger garbage collection
        System.gc();

        //sleep for short
        try{
            Thread.sleep(5000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

        byte[] largeArray = new byte[150*1024*1024];
        //allocate more objects after garbage collection
        for(int i=0;i<5000;i++){
            Object obj = new Object();

            System.gc();
        }
    }
}
