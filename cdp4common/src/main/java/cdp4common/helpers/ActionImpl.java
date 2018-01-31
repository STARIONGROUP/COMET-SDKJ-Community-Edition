/*
 * ActionImpl.java
 * Copyright (c) 2018 RHEA System S.A.
 */

package cdp4common.helpers;

public class ActionImpl implements Action {
    private Action action;

    public ActionImpl(Action action) {
        this.action = action;
    }

    @Override
    public void invoke() {
        this.action.invoke();
    }
}
