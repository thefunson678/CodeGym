package com.example.ex5_1_music_play_list.reposiotry;

import com.example.ex5_1_music_play_list.models.Music;

import java.util.List;

public interface IMusicRepository {

    List<Music> getPlayList();
}
