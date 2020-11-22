package com.example.blog.utils;

import com.example.blog.entity.Album;
import com.example.blog.entity.AlbumDetail;

import java.util.List;

public class AlbumVo extends Album {
    private Integer pictures;
    private List<AlbumDetail> albumDetails;
    private String albumTypeStr;

    public Integer getPictures() {
        return pictures ==null?0:pictures;
    }

    public void setPictures(Integer pictures) {
        this.pictures = pictures;
    }

    public List<AlbumDetail> getAlbumDetails() {
        return albumDetails;
    }

    public void setAlbumDetails(List<AlbumDetail> albumDetails) {
        this.albumDetails = albumDetails;
    }

    public String getAlbumTypeStr() {
        return albumTypeStr;
    }

    public void setAlbumTypeStr(String albumTypeStr) {
        this.albumTypeStr = albumTypeStr;
    }
}
