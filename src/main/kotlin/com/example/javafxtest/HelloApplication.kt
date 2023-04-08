package com.example.javafxtest

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Stage

class HelloApplication : Application() {
    override fun start(stage: Stage) {
        val fxmlLoader = FXMLLoader(javaClass.getResource("hello-view.fxml"))
        val root = fxmlLoader.load<Parent>()
        //val controller = fxmlLoader.getController<HelloController>()

        stage.title = "Hello!"
        stage.scene = Scene(root, width, height)
        stage.show()
    }

    companion object {
        private const val width = 320.0
        private const val height = 240.0
    }
}

fun main() {
    Application.launch(HelloApplication::class.java)
}