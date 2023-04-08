package com.example.javafxtest

import javafx.fxml.FXML
import javafx.scene.control.Label
import javafx.scene.control.TreeItem
import javafx.scene.control.TreeView

class HelloController {
    @FXML
    private lateinit var treeView: TreeView<String>

    @FXML
    private fun onAddTreeItemClick() {
        addTreeItem("New Node ${treeView.root.children.size}")
    }

    @FXML
    private fun onRemoveTreeItemClick() {

    }

    private fun addTreeItem(s: String) {
        treeView.root.children.add(TreeItem(s))
    }
}