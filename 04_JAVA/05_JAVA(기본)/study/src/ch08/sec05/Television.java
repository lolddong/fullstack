package ch08.sec05;

public class Television implements RemoteControl{
    // 필드
    private int volume;

    // turnOn() 추상 메소드 오버라이딩
    @Override // 컴파일 시 정확히 오버라이딩이 되었는지 확인해줌
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    // turnOff() 추상 메소드 오버라이딩
    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }

    // setVolume() 추상 메소드 오버라이딩
    @Override
    public void setVolume(int volume) {
        // 상수 필드이기에 바로 접근 가능 (RemoteControl.MAX_VOLUME)
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 TV 볼륨: " + this.volume);
    }
}
