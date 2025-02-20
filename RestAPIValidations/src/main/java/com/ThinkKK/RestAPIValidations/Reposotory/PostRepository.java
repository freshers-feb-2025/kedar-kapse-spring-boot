package com.ThinkKK.RestAPIValidations.Reposotory;

import com.ThinkKK.RestAPIValidations.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
}
