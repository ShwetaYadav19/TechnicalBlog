package main.com.upgrad.controller;

import main.com.upgrad.model.Post;
import main.com.upgrad.model.User;
import main.com.upgrad.service.PostService;
import main.com.upgrad.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private PostService postService;

    @Autowired
    private UserService userService;

    @RequestMapping("users/login")
    public String login(){
        return "users/login";
    }

    @RequestMapping(value="users/login" ,method=RequestMethod.POST)
    public String loginUser(User user){
        if(userService.login( user )){
            return "redirect:/posts";
        }
        else{
            return "users/login";
        }

    }

    @RequestMapping(value="users/logout" ,method=RequestMethod.POST)
    public String logoutUser(Model model){
        List<Post> posts = postService.getAllPosts();
        model.addAttribute( "posts",posts );
        return "redirect:/";
    }

    @RequestMapping(value="users/registration")
    public String registration(){
        return "users/registration";
    }

    @RequestMapping(value="users/registration" ,method=RequestMethod.POST)
    public String registerUser(User user){
        return "users/login";
    }

}
