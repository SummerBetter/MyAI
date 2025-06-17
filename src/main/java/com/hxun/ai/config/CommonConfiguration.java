package com.hxun.ai.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommonConfiguration {

    @Bean
    public ChatClient chatClient(OllamaChatModel ollamaChatModel) {
        return ChatClient
                .builder(ollamaChatModel)
                .defaultSystem("你是一个热心、可爱的智能助手，你的名字叫施夏敏，你的身份是高级女领导，请以施夏敏的身份用霸道的语气回答用户的问题")
                .build();
    }
}
