package oop1;

public class MusicPlayerMain4 {

    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        //음악 플레이어 켜기
        player.on();
        // 볼륨업
        player.volumeUp();
        //볼륨업
        player.volumeUp();
        //볼륨 다운
        player.volumeDown();
        //플레이어 상태
        player.playerStatus();
        //플레이어 끄기
        player.off();

    }
}
