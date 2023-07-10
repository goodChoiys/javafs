package Class_0710;

public class Audio1 implements RemoteControl1 {
    // 필드
    private int volume;

    // turnOn() 추상 메소드 오버라이딩
    @Override
    public void turnOn() {
        System.out.println("Audio를 켭니다.");
    }

    // turnOn() 추상 메소드 오버라이딩
    @Override
    public void turnOff() {
        System.out.println("Audio를 끕니다.");
    }

    // setVolume() 추상 메소드 오버라이딩
    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl1.MAX_VOLUME) {
            this.volume = RemoteControl1.MAX_VOLUME;
        } else if (volume < RemoteControl1.MIN_VOLUME) {
            this.volume = RemoteControl1.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 Audio 볼륨: " + volume);
    }
}
