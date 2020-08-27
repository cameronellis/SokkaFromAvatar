package com.mycompany.askSokka;

import com.amazon.ask.Skill;
import com.amazon.ask.Skills;
import com.amazon.ask.SkillStreamHandler;

import com.mycompany.askSokka.handlers.*;

public class AskSokkaStreamHandler extends SkillStreamHandler {

    private static Skill getSkill() {
        return Skills.standard()
                .addRequestHandlers(
                        new CancelandStopIntentHandler(),
                        new FallbackIntentHandler(),
                        new HelpIntentHandler(),
                        new LaunchRequestHandler(),
                        new SessionEndedRequestHandler(),
                        new WhatCanSokkaDoIntentHandler()
                )
                .build();
    }

    public AskSokkaStreamHandler() {
        super(getSkill());
    }
}
