package com.mycompany.askSokka;

import com.amazon.ask.Skill;
import com.amazon.ask.Skills;
import com.amazon.ask.SkillStreamHandler;

import com.mycompany.askSokka.handlers.*;

public class AskSokkaStreamHandler extends SkillStreamHandler {

    private static Skill getSkill() {
        return Skills.standard()
                .addRequestHandlers(
                        new AddItemToShoppingListIntentHandler(),
                        new CancelandStopIntentHandler(),
                        new FallbackIntentHandler(),
                        new HeightOfMountainIntentHandler(),
                        new HelpIntentHandler(),
                        new LaunchRequestHandler(),
                        new NumTeaspoonsInATablespoonIntentHandler(),
                        new PlayMusicGenreIntentHandler(),
                        new SessionEndedRequestHandler(),
                        new SokkaCurrentTimeIntentHandler(),
                        new SokkaDefineWordIntentHandler(),
                        new SokkaFlashNewsBriefingIntentHandler(),
                        new SokkaPlayDanceMixIntentHandler(),
                        new SokkaSpellWordIntentHandler(),
                        new SokkaTellJokeIntentHandler(),
                        new WhatCanSokkaDoIntentHandler()
                )
                .build();
    }

    public AskSokkaStreamHandler() {
        super(getSkill());
    }
}
