package com.mycompany.askSokka.handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.Predicates;

import java.util.Optional;

public class SokkaSpellWordIntentHandler implements RequestHandler {

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(Predicates.intentName("SokkaSpellWordIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        String speechText = "Why are you all looking at me? That’s a lot of pressure";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .build();
    }

}