import java.util.Random;

public class Producer implements Runnable{
    private SharedItem item;

    public Producer (SharedItem item){
        this.item = item;
    }

    @Override
    public void run(){
        for(int i=1; i<=5; i++){
            try{
                Thread.sleep(new Random().nextInt(10000));

            }catch (InterruptedException e){
                e.printStackTrace();
            }
            item.put(i);
            System.out.println("[생산자]아이템 " + i + " 생산");
        }
    }
}
