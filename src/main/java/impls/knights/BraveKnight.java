package impls.knights;

import interfaces.Knight;
import interfaces.Quest;

/**
 * Created by User on 01.12.2015.
 */
public class BraveKnight implements Knight {
    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
