package class_basic.song;
//프로그램이 잘 돌아가는지 확인해 보세요.

public class SongTest_610 {
    public static void main(String[] args) {
        Song_610 song = new Song_610();

        //ctrl + p --> 입력해야할 정보 뜸
        //배열(abc)을 미리 만들어 넣어줌
        String[] abc = {"kim", "lee", "park"};
        song.initSong("gasi","buzz","nana",2002,abc);

        //내용 출력
        song.printSong();
    }
}
