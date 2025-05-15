package ch15.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // LinkedList 큐 생성
        Queue<Message> queue = new LinkedList<>();

        // Message 인스턴스를 다음 순(command, to)로 추가
        queue.offer(new Message("sendMail", "홍길동"));
        queue.offer(new Message("sendSMS", "신용권"));
        queue.offer(new Message("sendKakaotalk", "감자바"));

        // queue가 빌 때까지 queue에서 Message 추출하며 command에 따라 내용 출력
        while (!queue.isEmpty()) {
            Message message = queue.poll();
            String commandKor;
            switch (message.command) {
                case "sendMail": commandKor = "메일"; break;
                case "sendSMS": commandKor = "SMS"; break;
                default: commandKor = "카카오톡";
            }
            System.out.printf("%s에게 %s을 보냅니다.\n", message.to, commandKor);
        }
    }
}
