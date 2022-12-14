package com.example.rapmessaging.utilities;

import java.util.HashMap;

public class Constants {
    public static final String KEY_COLLECTION_USERS =  "users";
    public static final String KEY_NAME =  "name";
    public static final String KEY_EMAIL =  "email";
    public static final String KEY_PASSWORD =  "password";
    public static final String KEY_PREFERENCE_NAME =  "chatAppPreference";
    public static final String KEY_IS_SIGNED_IN =  "isSignedIn";
    public static final String KEY_USER_ID =  "userId";
    public static final String KEY_IMAGE=  "image";
    public static final String KEY_FCM_TOKEN = "fcmToken";
    public static final String KEY_USER = "user";
    public static final String KEY_COLLECTION_CHAT = "chat";
    public static final String KEY_SENDER_ID = "senderId";
    public static final String KEY_RECEIVER_ID = "receiverId";
    public static final String KEY_MESSAGE = "message";
    public static final String KEY_TIMESTAMP = "timestamp";

    public static final String KEY_COLLECTION_CONVERSATIONS  = "conversations";
    public static final String KEY_SENDER_NAME = "senderName";
    public static final String KEY_RECEIVER_NAME = "receiverName";
    public static final String KEY_SENDER_IMAGE = "senderImage";
    public static final String KEY_RECEIVER_IMAGE = "receiverImage";
    public static final String KEY_LAST_MESSAGE = "lastMessage";

    public static final String KEY_AVAILABILITY = "availability";

    public static final String REMOTE_MSG_AUTHORIZATION =  "Authorization";
    public static final String REMOTE_MSG_CONTENT_TYPE = "Content-Type";

    public static final String REMOTE_MSG_TYPE = "type";
    public static final String REMOTE_MSG_INVITATION = "invitation" ;
    public static final String REMOTE_MSG_MEETING_TYPE = "meetingType";
    public static final String REMOTE_MSG_INVITER_TOKEN = "inviterToken";
    public static final String REMOTE_MSG_DATA = "data";
    public static final String REMOTE_MSG_REGISTRATION_IDS = "registration_ids";

    public static final String REMOTE_MSG_INVITATION_RESPONSE = "invitationResponse";
    public static final String REMOTE_MSG_INVITATION_ACCEPTED = "accepted";
    public static final String REMOTE_MSG_INVITATION_REJECTED = "rejected";
    public static final String REMOTE_MSG_INVITATION_CANCELLED = "cancelled";

    public static final String REMOTE_MSG_MEETING_ROOM = "meetingRoom";



   /* public static HashMap<String , String > remoteMsgHeaders = null;
    public static HashMap<String, String > getRemoteMessageHeaders(){
        if (remoteMsgHeaders == null){
            remoteMsgHeaders = new HashMap<>();
            remoteMsgHeaders.put(
                    REMOTE_MSG_AUTHORIZATION,
                    "key=AAAA5lN8Dq0:APA91bHKqOd6SYQb_vKfSs5QYeax_Xpn-0zLLNdDGNoK1NNvaNdOqBNB8l_4IvTuZFZ_KbAbPtIK_NubEnypzH637bIADek6DBxVQyXd26u2EGYWeYHBqv6WeSw1v8JskTofrN88L0ws"
            );
            remoteMsgHeaders.put(
                    REMOTE_MSG_CONTENT_TYPE,
                    "application/json"
            );
        }
        return remoteMsgHeaders;
    } */
    public static HashMap<String, String> getRemoteMessageHeaders(){
        HashMap<String, String> headers = new HashMap<>();
        headers.put(
                Constants.REMOTE_MSG_AUTHORIZATION,
                "key=AAAA5lN8Dq0:APA91bGZyQcwmUbOZAbIhnaYAH6yRGqbwAEU_9zoHNOm54bxeaZYNwoKJNTlJcGKhWgJujsoRb4-SxsZqrRi6enUwSSI0kQXNMAN-3_iRT-uW6qdjIbSakuBC0EikjIMuhv2gcW_8I0E"
        );
        headers.put(Constants.REMOTE_MSG_CONTENT_TYPE, "application/json");
        return headers;
    }


}
