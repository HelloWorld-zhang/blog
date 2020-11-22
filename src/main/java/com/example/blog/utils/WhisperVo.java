package com.example.blog.utils;

import com.example.blog.entity.Whisper;

public class WhisperVo extends Whisper {
    private Integer commentCounts;

    public Integer getCommentCounts() {
        return commentCounts;
    }

    public void setCommentCounts(Integer commentCounts) {
        this.commentCounts = commentCounts;
    }
}
