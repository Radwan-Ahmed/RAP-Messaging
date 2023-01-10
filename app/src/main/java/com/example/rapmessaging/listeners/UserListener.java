package com.example.rapmessaging.listeners;

import com.example.rapmessaging.models.User;

public interface UserListener {
    void onUserClicked(User user);

    void initiateAudioMeeting(User user);

    void initiateVideoMeeting(User user);


}
