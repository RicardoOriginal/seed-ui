/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seed.ui.util;

import com.itextpdf.text.Image;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author ricar
 */
public class VisualizadorPdf {

    private final Stage dialog;
    private final Image image;
    // O resto de seus atributos (botões, paineis, etc);

    public VisualizadorPdf(Stage owner, Image image){
        this.image = image;

        dialog = new Stage();
        dialog.initModality(Modality.WINDOW_MODAL);
        dialog.initOwner(owner);
        dialog.setScene(createScene());
        dialog.setTitle("Título da minha janela");
    }

    public Scene createScene() {
        // Crie sua cena aqui
        return null;
        // Crie sua cena aqui
    }

    // Método para exibir sua janela
    public void show() {
        dialog.show();
    }
}
