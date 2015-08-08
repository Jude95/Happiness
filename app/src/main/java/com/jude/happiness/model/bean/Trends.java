package com.jude.happiness.model.bean;

/**
 * Created by Mr.Jude on 2015/8/8.
 */
public class Trends {
    private String authorFace;
    private String authorNme;
    private String content;
    private long time;
    private String[] images;
    private String commentCount;
    private String praiseCount;
    private boolean isPraised;


    public Trends(String authorFace, String authorNme, String content, long time, String[] images, String commentCount, String praiseCount, boolean isPraised) {
        this.authorFace = authorFace;
        this.authorNme = authorNme;
        this.content = content;
        this.time = time;
        this.images = images;
        this.commentCount = commentCount;
        this.praiseCount = praiseCount;
        this.isPraised = isPraised;
    }


    public String getAuthorFace() {
        return authorFace;
    }

    public void setAuthorFace(String authorFace) {
        this.authorFace = authorFace;
    }

    public String getAuthorNme() {
        return authorNme;
    }

    public void setAuthorNme(String authorNme) {
        this.authorNme = authorNme;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String[] getImages() {
        return images;
    }

    public void setImages(String[] images) {
        this.images = images;
    }

    public String getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(String commentCount) {
        this.commentCount = commentCount;
    }

    public String getPraiseCount() {
        return praiseCount;
    }

    public void setPraiseCount(String praiseCount) {
        this.praiseCount = praiseCount;
    }

    public boolean getIsPraised() {
        return isPraised;
    }

    public void setIsPraised(boolean isPraised) {
        this.isPraised = isPraised;
    }


    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public boolean isPraised() {
        return isPraised;
    }

}
