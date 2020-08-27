package com.mycompany.askSokka.handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.Predicates;

import java.util.Optional;

public class WhatCanSokkaDoIntentHandler implements RequestHandler {

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(Predicates.intentName("WhatCanSokkaDoIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        String speechText = "Good morning everyone, so, as you know, um…. I’m sorry, let me start at the beginning";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .build();
    }

}
