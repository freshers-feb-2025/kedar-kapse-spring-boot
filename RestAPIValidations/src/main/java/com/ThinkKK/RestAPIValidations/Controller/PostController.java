package com.ThinkKK.RestAPIValidations.Controller;

import com.ThinkKK.RestAPIValidations.Entity.Post;
import com.ThinkKK.RestAPIValidations.Entity.User;
import com.ThinkKK.RestAPIValidations.Reposotory.PostRepository;
import com.ThinkKK.RestAPIValidations.Service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
public class PostController {

    @Autowired
    private PostRepository postRepository;

    public PostController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @PostMapping("/addpost")
    public ResponseEntity<Post> addPost(@Valid @RequestBody Post post) {
        Post creratedPost = postRepository.save(post);
        return ResponseEntity.created(URI.create("/user/"+creratedPost.getId())).body(creratedPost);
    }



    @GetMapping("/allPost")
    public ResponseEntity<List<Post>> getAllUsers() {
        List<Post> posts = postRepository.findAll();
        if(posts.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok().body(posts);
    }

    @GetMapping("/{id}")
    public Post getPostById(@PathVariable Long id) {
        return postRepository.findById(id).orElseThrow(()->new RuntimeException("Value Not Found :- "+id));
    }

    @DeleteMapping("/delete/{id}")
    public void deletePosts(@PathVariable Long id) {
        postRepository.deleteById(id);
    }

        @PutMapping("/updatepost/{id}")
        public Post updatePost(@PathVariable Long id , @RequestBody Post post){
                return postRepository.findById(id).map(existingUser ->{
                    existingUser.setId(post.getId());
                    existingUser.setDescription(post.getDescription());
                    return postRepository.save(existingUser);
                }).orElseThrow(null);
        }
}
