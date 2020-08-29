package com.mycompany.askSokka.handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.Predicates;

import java.util.Optional;

public class SokkaTellJokeIntentHandler implements RequestHandler {

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(Predicates.intentName("SokkaTellJokeIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        String speechText = "The whole time that I was in that hole, not knowing if I would live or die, " +
                "it makes a man think about…";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .build();
    }

}
