package main.com.upgrad.controller;

import main.com.upgrad.model.Post;
import main.com.upgrad.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

    @RequestMapping("posts/newpost")
    public String createPosts(Model model){
      return "posts/create";
    }


    @RequestMapping(value="posts/create",method=RequestMethod.POST)
    public String createNewPost(Post newPost){
        postService.createPost(newPost);
        return "redirect:/posts";
    }
}
