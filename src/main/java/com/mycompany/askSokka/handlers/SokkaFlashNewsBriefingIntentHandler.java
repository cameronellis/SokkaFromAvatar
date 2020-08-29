package com.mycompany.askSokka.handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.Predicates;

import java.util.Optional;

public class SokkaFlashNewsBriefingIntentHandler implements RequestHandler {

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(Predicates.intentName("SokkaFlashNewsBriefingIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        String speechText = "Today, we’re invading the fire nation, and, uh, there’s an eclipse today";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .build();
    }

}
