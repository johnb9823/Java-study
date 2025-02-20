package poly.ex.sender;

public class SenderMain {

    public static void main(String[] args) {

        Sender[] senders = {new EmailSender(), new SmsSender(), new FaceBookSender()};
        //new EmailSender, new SmsSender, new FaceBookSender 이것들이
        // Sender 배열에 들어가야 하니까 타입이 같아야 된다.
        for (Sender sender : senders) {
            sender.sendMessage("환영합니다!");
        }

    }
}
