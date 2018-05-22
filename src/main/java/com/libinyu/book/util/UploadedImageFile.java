package com.libinyu.book.util;

/**
 * Created by Administrator on 2018/3/30.
 */
import org.springframework.web.multipart.MultipartFile;

public class UploadedImageFile {
    MultipartFile image;

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }

}