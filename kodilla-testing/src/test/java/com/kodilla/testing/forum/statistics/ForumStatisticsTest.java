package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ForumStatisticsTest {
    private ForumStatistics forumStatistics;
    @Mock
    private Statistics statisticsMock;

    @BeforeEach
    public void setUp(){
        forumStatistics = new ForumStatistics();
        statisticsMock = Mockito.mock(Statistics.class);
        List<String> users = new ArrayList<>();
        users.add("User1");
        users.add("User2");
        when(statisticsMock.userName()).thenReturn(users);
    }
    @Test
    public void testCalculateAdvStatisticsWhenPostCountIsZero(){
//        Given
        when(statisticsMock.postCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(10);
//        When
        forumStatistics.calculateAdvStatistics(statisticsMock);
//        Then
        assertEquals(0, forumStatistics.getAveragePostsPerUser(), 0.001);
        assertEquals(5.0, forumStatistics.getAverageCommentsPerUser(), 0.001);
        assertEquals(0, forumStatistics.getAverageCommentsPerPost(), 0.001);

    }
    @Test
    public void testCalculateAdvStatisticsWhenPostCountIsThousand(){
//        Given
        when(statisticsMock.postCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(500);
//        When
        forumStatistics.calculateAdvStatistics(statisticsMock);
//        Then
        assertEquals(500.0, forumStatistics.getAveragePostsPerUser(), 0.001);
        assertEquals(250.0, forumStatistics.getAverageCommentsPerUser(), 0.001);
        assertEquals(0.5, forumStatistics.getAverageCommentsPerPost(), 0.001);
    }
    @Test
    public void testCalculateAdvStatisticsWhenCommentCountIsZero() {
        when(statisticsMock.postCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(0);

        forumStatistics.calculateAdvStatistics(statisticsMock);

        assertEquals(50.0, forumStatistics.getAveragePostsPerUser(), 0.001);
        assertEquals(0, forumStatistics.getAverageCommentsPerUser(), 0.001);
        assertEquals(0, forumStatistics.getAverageCommentsPerPost(), 0.001);
    }
    @Test
    public void testCalculateAdvStatisticsWhenCommentCountIsLessThanPostCount(){
//        Given
        when(statisticsMock.postCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(50);
//        When
        forumStatistics.calculateAdvStatistics(statisticsMock);
//        Then
        assertEquals(50.0, forumStatistics.getAveragePostsPerUser(), 0.001);
        assertEquals(25.0, forumStatistics.getAverageCommentsPerUser(), 0.001);
        assertEquals(0.5, forumStatistics.getAverageCommentsPerPost(), 0.001);
    }
    @Test
    public void testCalculateAdvStatisticsWhenCommentCountIsGreaterThanPostCount() {
        // Given
        when(statisticsMock.postCount()).thenReturn(50);
        when(statisticsMock.commentsCount()).thenReturn(100);

        // When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        // Then
        assertEquals(25.0, forumStatistics.getAveragePostsPerUser(), 0.001);
        assertEquals(50.0, forumStatistics.getAverageCommentsPerUser(), 0.001);
        assertEquals(2.0, forumStatistics.getAverageCommentsPerPost(), 0.001);
    }
    @Test
    public void testCalculateAdvStatisticsWhenUserCountIsZero(){
//        Given
        List<String> emptyUserList = new ArrayList<>();
        when(statisticsMock.userName()).thenReturn(emptyUserList);
        when(statisticsMock.postCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(50);
//        When
        forumStatistics.calculateAdvStatistics(statisticsMock);
//        Than
        assertEquals(0, forumStatistics.getAveragePostsPerUser(), 0.001);
        assertEquals(0, forumStatistics.getAverageCommentsPerUser(), 0.001);
        assertEquals(0.5, forumStatistics.getAverageCommentsPerPost(), 0.001);

    }
    @Test
    public void testCalculateAdvStatisticsWhenUserCountIsHundred(){
//        Given
        List<String> userList = new ArrayList<>();
        for (int i =0; i < 100; i ++){
            userList.add("User1" + 1);
        }
        when(statisticsMock.userName()).thenReturn(userList);
        when(statisticsMock.postCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(500);
//        When
        forumStatistics.calculateAdvStatistics(statisticsMock);
//        Than
        assertEquals(10.0, forumStatistics.getAveragePostsPerUser(), 0.001);
        assertEquals(5.0, forumStatistics.getAverageCommentsPerUser(), 0.001);
        assertEquals(0.5, forumStatistics.getAverageCommentsPerPost(), 0.001);
    }


}
