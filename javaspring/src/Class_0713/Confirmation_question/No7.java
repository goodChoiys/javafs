package Class_0713.Confirmation_question;

import java.util.*;

public class No7 {

    public static void main(String[] args) {
        BoardDao dao = new BoardDao();
        List<Board> list = dao.getBoardList();
        for (Board board : list) {
            System.out.println(board.getTitle() + "-" + board.getContent());
        }
    }
}

class Board {
    private String title;
    private String content;

    public Board(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}

// 생성한 클래스
class BoardDao {
    // 생성한 메소드
    public List<Board> getBoardList() {
        // List<Board> list = new ArrayList<Board>();
        // List<Board> list = new Vector<Board>();
        List<Board> list = new LinkedList<Board>();
        list.add(new Board("제목1", "내용1"));
        list.add(new Board("제목2", "내용2"));
        list.add(new Board("제목3", "내용3"));
        return list;
    }

}
