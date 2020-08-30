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
        String speechText = "<audio src=\"https://alexa-skill-sokka-from-avatar.s3-us-west-2.amazonaws.com/theWholeTimeIWasInThatHoleItMakesA.mp3\" />";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .build();
    }

}
