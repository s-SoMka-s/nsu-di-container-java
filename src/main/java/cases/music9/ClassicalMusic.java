package cases.music9;

import framework.annotations.Component;
import framework.annotations.Inject;

//@Named
//@Named("classicalMusic")
@Component("classicalMusic")
public class ClassicalMusic implements Music {
    @Inject("rockMusic")
    RockMusic rockMusic;

    @Override
    public String getSong() {
        return "In the Hall of the Mountain King ";
    }
}