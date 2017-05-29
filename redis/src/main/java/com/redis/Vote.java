package com.redis;

import java.util.Random;
import java.util.Set;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Tuple;

/**
 * 一句话功能简述.
 * 
 * @author Zhang.Ge
 * @version v1.0 2017年4月29日  下午5:36:56
 */
public class Vote {
    
    public void createArticle(Jedis conn, String id, String title, String link, String poster) {
        conn.hset(id, "title", title);
        conn.hset(id, "link", link);
        conn.hset(id, "poster", poster);
        long time = System.currentTimeMillis();
        conn.hset(id, "time", String.valueOf(time));
        conn.hset(id, "vote", "0");
        addArticleTimeSet(conn, id, Double.valueOf(time));
        createArticleScoreSet(conn, id);
    }
    
    public void addVoteUserSet(Jedis conn, String articleId, String user) {
        conn.sadd("vote:" + articleId, user);
    }
    
    private void addArticleTimeSet(Jedis conn, String article, double time) {
        conn.zadd("time", time, article);
    }
    
    private void createArticleScoreSet(Jedis conn, String article) {
        conn.zadd("score", 0, article);
    }
    
    public void addArticleScore(Jedis conn, String articleId) {
        conn.zincrby("score", 432, "article:" + articleId);
    }
    
    public static void main(String[] args) {
        Jedis conn = new Jedis("127.0.0.1");
        Vote vote = new Vote();
        Set<String> keys = conn.keys("article*");
        if (keys == null || keys.size() == 0) {
            for (int i = 0; i < 10; i++) {
                String id = "article:" + i;
                String title = "article" + i;
                String link = "www." + title + ".com";
                String poster = "user:" + i;
                vote.createArticle(conn, id, title, link, poster);
            }
        }
        Set<Tuple> elements = conn.zrangeWithScores("score", 0, -1);
        if (elements != null) {
            for (Tuple tuple : elements) {
                System.out.println(tuple.getElement() + ":" + tuple.getScore());
            }
        }
        
    }
}
