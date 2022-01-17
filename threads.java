class NewThread implements Runnable
{
    String name;
    long time1;
    int x;
    Thread t;
    NewThread(String threadname, long time, int x1)
    {
        name=threadname;
        time1=time;
        x=x1;
        t=new Thread(this,name);
        t.start();
    }
    public void run()
    {
        try {
            for(int i=x;i>0;i--)
            {
                System.out.println(name);
                Thread.sleep(time1);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println(name + "Interrupted");
        }
    }
}




public class threads {
    public static void main(String args[]){
        new NewThread("BMS COLLEGE OF ENGINEERING",10000,2);
        new NewThread("CSE",2000,10);
    }
}
