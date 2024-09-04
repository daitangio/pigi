package com.gioorgi.pque.client.config;

import lombok.Data;

@Data
public class PGMQVisiblityTimeout {
    int seconds;
    public PGMQVisiblityTimeout(int s){
        if(s <0 ) {
            throw new IllegalArgumentException("Timeout must be >0");
        }
        this.seconds=s;
    }
}
