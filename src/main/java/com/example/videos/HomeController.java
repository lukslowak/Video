package com.example.videos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//1.
@Controller
    public class HomeController {
        //2
        @GetMapping ("/")
        public String hello(){
            return "hello";}

            //3.zrob html
            //4.registry > compiler.automake.allow.when.app.runningd
         @GetMapping("/video")
          public String video (){
             return "video";
            }
        }

