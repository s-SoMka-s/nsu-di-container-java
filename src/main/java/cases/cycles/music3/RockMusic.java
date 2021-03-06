package cases.cycles.music3;

import framework.annotations.Component;
import framework.annotations.Inject;

@Component("rockMusic")
public class RockMusic implements Music {
    @Inject("classicalMusic")
    ClassicalMusic classicalMusic;

    @Override
    public String getSong() {
        return "Highway to Hell";
    }

    public ClassicalMusic getClassicalMusic() {
        return classicalMusic;
    }
}
