package com.example.ex5_1_music_play_list.reposiotry.MusicRepositoryImpl;

import com.example.ex5_1_music_play_list.models.Music;
import com.example.ex5_1_music_play_list.reposiotry.IMusicRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class MusicRepositoryImpl implements IMusicRepository {

    @Override
    public List<Music> getPlayList() {
        List<Music> playList = BaseRepository.entityManager
                .createQuery("select s from MusicDB s").getResultList();
        return playList;
    }

}
