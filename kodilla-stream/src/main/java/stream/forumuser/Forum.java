package stream.forumuser;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> userList = new ArrayList<>();
    public Forum(){
        userList.add(new ForumUser(1 , "Adam Nowak", 'M', 2001,10,13, 2));
        userList.add(new ForumUser(2 , "Katarzyna Karpiel", 'F', 1989,7,16, 12));
        userList.add(new ForumUser(3 , "Anna Pater", 'F', 2005,1,20, 3));
        userList.add(new ForumUser(4 , "Grzegorz Piwowar", 'M', 2010,8,6, 0));
        userList.add(new ForumUser(5 , "Dominik Musiał", 'M', 1999,4,17, 3));
        userList.add(new ForumUser(6 , "Tomasz Ochota", 'M', 2000,11,3, 3));
        }
    public List<ForumUser> getList(){
        return new ArrayList<>(userList);
    }


}
