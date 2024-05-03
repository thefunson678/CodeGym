package com.example.ex5_1_music_play_list.models;

import javax.persistence.*;

@Entity(name="MusicDB")
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",columnDefinition = "INT")
    private Integer id;
    @Column(name = "name",columnDefinition = "VARCHAR(100)")
    private String name;
    @Column(name = "singer",columnDefinition = "VARCHAR(45)")
    private String singer;
    @Column(name = "type",columnDefinition = "VARCHAR(45)")
    private String type;
    @Column(name = "file_link",columnDefinition = "VARCHAR(100)")
    private String fileLink;

    public Music() {
    }

    public Music(Integer id, String name, String singer, String type, String fileLink) {
        this.id = id;
        this.name = name;
        this.singer = singer;
        this.type = type;
        this.fileLink = fileLink;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFileLink() {
        return fileLink;
    }

    public void setFileLink(String fileLink) {
        this.fileLink = fileLink;
    }
}
