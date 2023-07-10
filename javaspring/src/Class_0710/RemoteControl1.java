package Class_0710;

public interface RemoteControl1 {
    // 상수 필드
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    // public 추상 메소드
    void turnOn();
    void turnOff();
    void setVolume(int volume);
}
