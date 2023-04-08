package com.example.javafxtest

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.scene.layout.VBox
import javafx.stage.Stage

class HelloApplication : Application() {
    override fun start(stage: Stage) {
        val jclass = HelloApplication::class.java;
        val fxmlLoader = FXMLLoader(jclass.getResource("hello-view.fxml"))
        val scene = Scene(fxmlLoader.load(), 320.0, 240.0)
        stage.title = "Hello!"
        stage.scene = scene
        stage.show()
    }
}

fun main() {
    Application.launch(HelloApplication::class.java)
}