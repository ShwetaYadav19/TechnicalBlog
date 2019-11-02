package main.com.upgrad.controller;

import main.com.upgrad.model.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String getAllPosts(Model model) {
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

        posts.add(post1);
        posts.add( post2 );
        posts.add( post3 );

        model.addAttribute( "posts",posts );
        return "index";
    }
}
