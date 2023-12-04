
package Observer;

public class youtube {
    public static void main(String[] args) {
        Subscriber s1 = new Subscriber("Abul");
        Subscriber s2 = new Subscriber("Babul");
        Subscriber s3 = new Subscriber("Cabul");
        channel Rj = new channel();
        Rj.subscribe(s1);
        Rj.subscribe(s2);
        Rj.subscribe(s3);
        Rj.upload("How to fail in Exam......");
        Rj.unsubcribe(s3);
        Rj.upload("Akash Vora tara.....");
        
    }
}
