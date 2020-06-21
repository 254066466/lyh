package com.beicheng.soft2group6.controller;

import com.beicheng.soft2group6.pojo.Album;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CommonController {
    @RequestMapping(value = "/albums")
    public List<Album> findAllAlbums(){
        List<Album>albums=new ArrayList<>();
        for (int i = 0 ; i < 10 ; i++){
            Album a=new Album();
            a.setId(i);
            a.setName("album"+i);
            albums.add(a);
        }
        return albums;
    }
}
