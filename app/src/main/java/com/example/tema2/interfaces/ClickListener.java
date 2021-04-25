package com.example.tema2.interfaces;

import com.example.tema2.models.Album;
import com.example.tema2.models.User;

public interface ClickListener {
    public void onUserClick(User user);
    public void onAlbumCLick(Album album);
    public void onArrowClick(User user);
}

