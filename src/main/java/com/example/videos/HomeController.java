package com.example.videos;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.lang.model.element.Name;

//1.
@Controller
public class HomeController {
    //2
    @GetMapping("/")
    public String hello() {
        return "hello";
    }

    //3.zrob html
    //4.registry > compiler.automake.allow.when.app.runningd
    @GetMapping("/video")
    public String video() {
        return "video";
    }

    @GetMapping("/videoPlay")
    public String add(@RequestParam String name,
                      @RequestParam String url,
                      ModelMap map) {
        VideoName videoName = new VideoName(name,url);
        map.put("videoName", videoName);
        return "videoPlay";
    }

    @GetMapping("/list")
    public String getList(ModelMap modelMap){
        modelMap.put("list",VideoName.getVideoList());
        System.out.println("Hello"+VideoName.getVideoList());
        return "list";
    }
}