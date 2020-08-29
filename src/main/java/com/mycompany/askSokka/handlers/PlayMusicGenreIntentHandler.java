package com.mycompany.askSokka.handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.Predicates;

import java.util.Optional;

public class PlayMusicGenreIntentHandler implements RequestHandler {

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(Predicates.intentName("PlayMusicGenreIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        String speechText = "Badger moles coming toward me…";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .build();
    }

}