package main.com.upgrad.controller;

import main.com.upgrad.model.Post;
import main.com.upgrad.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class PostController {

    @Autowired
    private PostService postService;


    @RequestMapping("posts")
    public String getUserPosts(Model model){
        List<Post> posts = postService.getOnePost();
        model.addAttribute( "posts",posts );
        return "posts";
    }
}
