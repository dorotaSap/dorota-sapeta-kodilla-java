package com.kodilla.stream;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
     Forum forum = new Forum();

        Map<Integer, ForumUser> filteredUsers = forum.getList().stream()
               .filter(user -> user.getSex() == 'M')
                .filter(user -> user.getDateOfBirth().plusYears(20).isBefore(LocalDate.now()))
                .filter(user -> user.getNumberOfPost() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserId, user -> user));
       System.out.println("# elements: " + filteredUsers.size());             // [2]
        filteredUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue().getUserName())                   // [3]
               .forEach(System.out::println);
   }


}

