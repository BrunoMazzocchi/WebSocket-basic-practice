package com.example.msgwebsocket.persistance.data;

import lombok.*;

@Getter
@Setter
public class ChatDTO {
    private String sentAt;
    private String sentBy;
    private String msg;
}
