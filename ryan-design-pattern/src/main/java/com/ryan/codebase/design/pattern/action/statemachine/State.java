package com.ryan.codebase.design.pattern.action.statemachine;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author ryan
 * @version Id: State, v 0.1 2022/1/15 9:40 AM ryan Exp $
 */
@Getter
@AllArgsConstructor
public enum State {
    SMALL(0),
    SUPER(1),
    FIRE(2),
    CAPE(3);
    private int value;
}
