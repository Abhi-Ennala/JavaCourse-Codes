//class S extends Thread
//class S implements Runnable
//{
//    public void run()
//    {
//        for(int i=1;i<=100;i++)
//        {
//            System.out.println("Hi");
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//            }
//        }
//    }
//}

//class T extends Thread
//class T implements Runnable
//{
//    public void run()
//    {
//        for(int i=1;i<=100;i++)
//        {
//            System.out.println("Hello");
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}

public class Threads {
    public static void main(String[] args) throws NumberFormatException, InterruptedException {

        Runnable obj1= () -> {
            for (int i = 1; i <= 100; i++) {
                System.out.println("Hi");
                try {Thread.sleep(10);} catch (InterruptedException e) {throw new RuntimeException(e);}
            }
        };

        Runnable obj2=()->
            {
                for(int i=1;i<=100;i++)
                {
                    System.out.println("Hello");
                    try {Thread.sleep(10);} catch (InterruptedException e) {throw new RuntimeException(e);}
                }

        };

        Thread t1= new Thread(obj1);
        Thread t2= new Thread(obj2);
        t1.start();
        t2.start();
//        obj1.setPriority(Thread.MAX_PRIORITY);
//        try {
//            Thread.sleep(2);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        obj1.start();
//        obj2.start();
//        obj1.show(); You can't use show method for threads and have to use start()
//        obj2.show();
    }

}
