package com.example.ex5_1_music_play_list.service;

import com.example.ex5_1_music_play_list.models.Music;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IMusicService{
    List<Music> getPlayList();
}
