import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import entities.Comment;
import entities.Post;

public class App {
    public static void main(String[] args) throws Exception {
        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome!");
        Post p1 = new Post(LocalDateTime.parse("21/06/2018 13:05:44", fmt01), "Traveling to New Zealand", "I'm going to visit this wonderful country!", 12);
        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);
    }
}
