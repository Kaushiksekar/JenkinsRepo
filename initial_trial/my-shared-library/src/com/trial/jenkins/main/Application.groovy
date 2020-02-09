package com.trial.jenkins.main

import com.trial.jenkins.stage.Stage

class Application {

    public static void main(String[] args) {
        Stage s = new Stage("Stage1");
        println(s.getName());
    }
}
