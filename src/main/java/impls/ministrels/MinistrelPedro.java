package impls.ministrels;

import interfaces.Ministrel;

/**
 * Created by User on 01.12.2015.
 */
public class MinistrelPedro implements Ministrel {
    public void singBeforeQuest() {
        System.out.println("Knight is going to make a quest");
    }

    public void singAfterQuest() {
        System.out.println("Knight have completed the quest");
    }
}
