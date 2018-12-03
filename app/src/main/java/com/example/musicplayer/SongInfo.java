package com.example.musicplayer;

/**
 * Created by asus on 2018/12/3.
 */

public class SongInfo {
    public String songName;//歌曲名
    public String singer;//歌手
    public long songSize;//歌曲占空间大小
    public int songTime;//歌曲时间长度
    public String songPath;//歌曲地址

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }
    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public long getSongSize() {
        return songSize;
    }

    public void setSongSize(long songSize) {
        this.songSize = songSize;
    }

    public int getSongTime() {
        return songTime;
    }

    public void setSongTime(int songTime) {
        this.songTime = songTime;
    }
    public String getSongPath() {
        return songPath;
    }

    public void setSongPath(String songPath) {
        this.songPath = songPath;
    }

    @Override
    public String toString() {
        return "SongInfo{" +
                "songName='" + songName + '\'' +
                ", singer='" + singer + '\'' +
                ", songSize=" + songSize +
                ", songTime=" + songTime +
                ", songPath='" + songPath + '\'' +
                '}';
    }
}
