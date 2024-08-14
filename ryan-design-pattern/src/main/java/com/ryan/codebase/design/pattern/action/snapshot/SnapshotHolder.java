package com.ryan.codebase.design.pattern.action.snapshot;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Ryan
 * @version Id: SnapshotHolder, v 0.1 2021/8/11 上午9:53 ryan Exp $
 */
public class SnapshotHolder {

    private Stack snapshots = new Stack<>();

    public Snapshot popSnapshot() {
        return (Snapshot) snapshots.pop();
    }

    public void pushSnapshot(Snapshot snapshot) {
        snapshots.push(snapshot);
    }

    public static void main(String[] args) {
        InputText inputText = new InputText();
        SnapshotHolder snapshotsHolder = new SnapshotHolder();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String input = scanner.next();
            if (input.equals(":list")) {
                System.out.println(inputText.toString());
            } else if (input.equals(":undo")) {
                Snapshot snapshot = snapshotsHolder.popSnapshot();
                inputText.restoreSnapshot(snapshot);
            } else {
                snapshotsHolder.pushSnapshot(inputText.createSnapshot());
                inputText.append(input);
            }
        }
    }

}