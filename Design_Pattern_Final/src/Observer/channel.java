
package Observer;

import java.util.ArrayList;
import java.util.List;

public class channel {
    private List <Subscriber> subcriber_list = new ArrayList();
    static String title;
    
    public void subscribe(Subscriber subscriber){
        subcriber_list.add(subscriber);
    }
    public void unsubcribe(Subscriber subscriber){
        subcriber_list.remove(subscriber);
    }
    public void notify_all_subscriber(){
        for(Subscriber sub : subcriber_list){
            sub.update();
        }
    
    }
    public void upload(String title){
        this.title = title;
        notify_all_subscriber();
    }
}
