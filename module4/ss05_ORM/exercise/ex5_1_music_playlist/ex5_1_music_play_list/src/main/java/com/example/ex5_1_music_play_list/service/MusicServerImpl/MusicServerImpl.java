package com.example.ex5_1_music_play_list.service.MusicServerImpl;

import com.example.ex5_1_music_play_list.models.Music;
import com.example.ex5_1_music_play_list.reposiotry.IMusicRepository;
import com.example.ex5_1_music_play_list.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicServerImpl implements IMusicService {
    @Autowired
    public  IMusicRepository iMusicRepository;

    @Override
    public List<Music> getPlayList() {
        return iMusicRepository.getPlayList();
    }
}
