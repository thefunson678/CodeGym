package com.example.ex5_1_music_play_list.controllers;

import com.example.ex5_1_music_play_list.models.Music;
import com.example.ex5_1_music_play_list.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MusicPlayListControllers {
    @Autowired
    private IMusicService iMusicService;


    @GetMapping("/playlists")
    public String getPlayList(Model model){
        List<Music> musicList =   iMusicService.getPlayList();
        model.addAttribute(musicList);
        return "list";
    }

}
