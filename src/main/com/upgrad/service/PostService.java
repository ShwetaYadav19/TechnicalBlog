package main.com.upgrad.service;

import main.com.upgrad.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {

    public PostService() {
        System.out.println("PostService is being called");
    }

    public List<Post> getAllPosts() {
        List<Post> posts = new ArrayList<>();

        Post post1 = new Post();
        post1.setTitle( "POST1" );
        post1.setBody( "Post Body1" );
        post1.setDate( new Date() );

        Post post2 = new Post();
        post2.setTitle( "POST2" );
        post2.setBody( "Post Body2" );
        post2.setDate( new Date() );

        Post post3 = new Post();
        post3.setTitle( "POST3" );
        post3.setBody( "Post Body3" );
        post3.setDate( new Date() );

        posts.add( post1 );
        posts.add( post2 );
        posts.add( post3 );

        return posts;
    }

    public List<Post> getOnePost(){
        List<Post> posts = new ArrayList<>();
        Post post = new Post();
        post.setTitle( "This is your first post." );
        post.setDate( new Date(  ) );
        post.setBody( "This is your first post. It has some valid content" );
        posts.add( post );
        return posts;
    }
}
