package uk.co.jassoft.markets.datamodel.story;

import java.util.function.Predicate;

/**
 * Created by jonshaw on 21/08/15.
 */
public class StoryPredicates {

    public static Predicate<Story> isStoryEmpty() {
        return story -> story.getBody() == null || story.getBody().isEmpty();
    }
}
