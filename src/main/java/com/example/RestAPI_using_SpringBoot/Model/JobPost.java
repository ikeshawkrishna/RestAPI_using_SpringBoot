package com.example.RestAPI_using_SpringBoot.Model;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@NoArgsConstructor
@Component
public class JobPost {


    private String postProfile;
    private String postDesc;
    private Integer reqExperience;
    private List<String> posttechstack;
    private int postid;

    public JobPost(int postId,String postProfile,String postDesc,Integer reqExperience,List<String> postTechStack){
        this.postid = postId;
        this.postProfile = postProfile;
        this.postDesc = postDesc;
        this.reqExperience = reqExperience;
        this.posttechstack = postTechStack;
    }
}
