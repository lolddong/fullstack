package ch15.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Queue 컬렉션 생성: LinkedList를 큐로 이용
        Queue<Message> queue = new LinkedList<Message>();

        // 메시지 추가
        queue.offer(new Message ("sendMail", "홍길동"));
        queue.offer(new Message("sendSMS", "신용권"));
        queue.offer(new Message("sendKakaotalk", "김자바"));

        // 메시지 하나씩 출력
        while (!queue.isEmpty()) {
            Message msg = queue.poll();
            String command = msg.command;
            switch(command) {
                case "sendMail": command = "메일"; break;
                case "sendSMS": command = "SMS"; break;
                case "sendKakaotalk": command = "카카오톡"; break;
                default: break;
            }
            System.out.printf("%s님에게 %s을(를) 보냅니다.\n", msg.to, command);
        }
    }
}
