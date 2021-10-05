package com.example.proyectomathsocket;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;

public class VentanaPrincipal extends Application {



    @Override
    public void start(Stage stage) throws IOException {

        Label dado = new Label();
        Label player1 = new Label("Player1");
        Label player2 = new Label("player2");


        Button btnDado = new Button();
        Button btnSalida = new Button();

        Pane root = new Pane();


        //rectangulos
        Rectangle rectanguloPlayer1 = new Rectangle();
        rectanguloPlayer1.setX(0);
        rectanguloPlayer1.setY(0);
        rectanguloPlayer1.setWidth(45);
        rectanguloPlayer1.setHeight(20);
        rectanguloPlayer1.setFill(Color.LIGHTBLUE);

        Rectangle rectanguloPlayer2 = new Rectangle();
        rectanguloPlayer2.setX(46);
        rectanguloPlayer2.setY(0);
        rectanguloPlayer2.setWidth(45);
        rectanguloPlayer2.setHeight(20);
        rectanguloPlayer2.setFill(Color.PINK);


        Rectangle rectangulo00 = new Rectangle();
        rectangulo00.setX(30);
        rectangulo00.setY(50);
        rectangulo00.setWidth(150);
        rectangulo00.setHeight(100);
        rectangulo00.setFill(Color.CORNFLOWERBLUE);
        rectangulo00.setStrokeWidth(3);
        rectangulo00.setStroke(Color.BLACK);


        Rectangle rectangulo01 = new Rectangle();
        rectangulo01.setX(183);
        rectangulo01.setY(50);
        rectangulo01.setWidth(150);
        rectangulo01.setHeight(100);
        rectangulo01.setFill(colores());
        rectangulo01.setStrokeWidth(3);
        rectangulo01.setStroke(Color.BLACK);

        Rectangle rectangulo02 = new Rectangle();
        rectangulo02.setX(336);
        rectangulo02.setY(50);
        rectangulo02.setWidth(150);
        rectangulo02.setHeight(100);
        rectangulo02.setFill(colores());
        rectangulo02.setStrokeWidth(3);
        rectangulo02.setStroke(Color.BLACK);

        Rectangle rectangulo03 = new Rectangle();
        rectangulo03.setX(489);
        rectangulo03.setY(50);
        rectangulo03.setWidth(150);
        rectangulo03.setHeight(100);
        rectangulo03.setFill(colores());
        rectangulo03.setStrokeWidth(3);
        rectangulo03.setStroke(Color.BLACK);

        Rectangle rectangulo04 = new Rectangle();
        rectangulo04.setX(642);
        rectangulo04.setY(50);
        rectangulo04.setWidth(150);
        rectangulo04.setHeight(100);
        rectangulo04.setFill(colores());
        rectangulo04.setStrokeWidth(3);
        rectangulo04.setStroke(Color.BLACK);

        Rectangle rectangulo05 = new Rectangle();
        rectangulo05.setX(795);
        rectangulo05.setY(50);
        rectangulo05.setWidth(150);
        rectangulo05.setHeight(100);
        rectangulo05.setFill(colores());
        rectangulo05.setStrokeWidth(3);
        rectangulo05.setStroke(Color.BLACK);

        Rectangle rectangulo10 = new Rectangle();
        rectangulo10.setX(30);
        rectangulo10.setY(153);
        rectangulo10.setWidth(150);
        rectangulo10.setHeight(100);
        rectangulo10.setFill(colores());
        rectangulo10.setStrokeWidth(3);
        rectangulo10.setStroke(Color.BLACK);

        Rectangle rectangulo11 = new Rectangle();
        rectangulo11.setX(183);
        rectangulo11.setY(153);
        rectangulo11.setWidth(150);
        rectangulo11.setHeight(100);
        rectangulo11.setFill(colores());
        rectangulo11.setStrokeWidth(3);
        rectangulo11.setStroke(Color.BLACK);


        Rectangle rectangulo12 = new Rectangle();
        rectangulo12.setX(336);
        rectangulo12.setY(153);
        rectangulo12.setWidth(150);
        rectangulo12.setHeight(100);
        rectangulo12.setFill(colores());
        rectangulo12.setStrokeWidth(3);
        rectangulo12.setStroke(Color.BLACK);

        Rectangle rectangulo13 = new Rectangle();
        rectangulo13.setX(489);
        rectangulo13.setY(153);
        rectangulo13.setWidth(150);
        rectangulo13.setHeight(100);
        rectangulo13.setFill(colores());
        rectangulo13.setStrokeWidth(3);
        rectangulo13.setStroke(Color.BLACK);

        Rectangle rectangulo14 = new Rectangle();
        rectangulo14.setX(642);
        rectangulo14.setY(153);
        rectangulo14.setWidth(150);
        rectangulo14.setHeight(100);
        rectangulo14.setFill(colores());
        rectangulo14.setStrokeWidth(3);
        rectangulo14.setStroke(Color.BLACK);

        Rectangle rectangulo15 = new Rectangle();
        rectangulo15.setX(795);
        rectangulo15.setY(153);
        rectangulo15.setWidth(150);
        rectangulo15.setHeight(100);
        rectangulo15.setFill(colores());
        rectangulo15.setStrokeWidth(3);
        rectangulo15.setStroke(Color.BLACK);

        Rectangle rectangulo20 = new Rectangle();
        rectangulo20.setX(30);
        rectangulo20.setY(256);
        rectangulo20.setWidth(150);
        rectangulo20.setHeight(100);
        rectangulo20.setFill(colores());
        rectangulo20.setStrokeWidth(3);
        rectangulo20.setStroke(Color.BLACK);

        Rectangle rectangulo21 = new Rectangle();
        rectangulo21.setX(183);
        rectangulo21.setY(256);
        rectangulo21.setWidth(150);
        rectangulo21.setHeight(100);
        rectangulo21.setFill(colores());
        rectangulo21.setStrokeWidth(3);
        rectangulo21.setStroke(Color.BLACK);

        Rectangle rectangulo22 = new Rectangle();
        rectangulo22.setX(336);
        rectangulo22.setY(256);
        rectangulo22.setWidth(150);
        rectangulo22.setHeight(100);
        rectangulo22.setFill(colores());
        rectangulo22.setStrokeWidth(3);
        rectangulo22.setStroke(Color.BLACK);

        Rectangle rectangulo23 = new Rectangle();
        rectangulo23.setX(489);
        rectangulo23.setY(256);
        rectangulo23.setWidth(150);
        rectangulo23.setHeight(100);
        rectangulo23.setFill(colores());
        rectangulo23.setStrokeWidth(3);
        rectangulo23.setStroke(Color.BLACK);

        Rectangle rectangulo24 = new Rectangle();
        rectangulo24.setX(642);
        rectangulo24.setY(256);
        rectangulo24.setWidth(150);
        rectangulo24.setHeight(100);
        rectangulo24.setFill(colores());
        rectangulo24.setStrokeWidth(3);
        rectangulo24.setStroke(Color.BLACK);

        Rectangle rectangulo25 = new Rectangle();
        rectangulo25.setX(795);
        rectangulo25.setY(256);
        rectangulo25.setWidth(150);
        rectangulo25.setHeight(100);
        rectangulo25.setFill(colores());
        rectangulo25.setStrokeWidth(3);
        rectangulo25.setStroke(Color.BLACK);

        Rectangle rectangulo30 = new Rectangle();
        rectangulo30.setX(30);
        rectangulo30.setY(359);
        rectangulo30.setWidth(150);
        rectangulo30.setHeight(100);
        rectangulo30.setFill(colores());
        rectangulo30.setStrokeWidth(3);
        rectangulo30.setStroke(Color.BLACK);

        Rectangle rectangulo31 = new Rectangle();
        rectangulo31.setX(183);
        rectangulo31.setY(359);
        rectangulo31.setWidth(150);
        rectangulo31.setHeight(100);
        rectangulo31.setFill(colores());
        rectangulo31.setStrokeWidth(3);
        rectangulo31.setStroke(Color.BLACK);

        Rectangle rectangulo32 = new Rectangle();
        rectangulo32.setX(336);
        rectangulo32.setY(359);
        rectangulo32.setWidth(150);
        rectangulo32.setHeight(100);
        rectangulo32.setFill(colores());
        rectangulo32.setStrokeWidth(3);
        rectangulo32.setStroke(Color.BLACK);

        Rectangle rectangulo33 = new Rectangle();
        rectangulo33.setX(489);
        rectangulo33.setY(359);
        rectangulo33.setWidth(150);
        rectangulo33.setHeight(100);
        rectangulo33.setFill(colores());
        rectangulo33.setStrokeWidth(3);
        rectangulo33.setStroke(Color.BLACK);

        Rectangle rectangulo34 = new Rectangle();
        rectangulo34.setX(642);
        rectangulo34.setY(359);
        rectangulo34.setWidth(150);
        rectangulo34.setHeight(100);
        rectangulo34.setFill(colores());
        rectangulo34.setStrokeWidth(3);
        rectangulo34.setStroke(Color.BLACK);

        Rectangle rectangulo35 = new Rectangle();
        rectangulo35.setX(795);
        rectangulo35.setY(359);
        rectangulo35.setWidth(150);
        rectangulo35.setHeight(100);
        rectangulo35.setFill(colores());
        rectangulo35.setStrokeWidth(3);
        rectangulo35.setStroke(Color.BLACK);

        Rectangle rectangulo40 = new Rectangle();
        rectangulo40.setX(30);
        rectangulo40.setY(462);
        rectangulo40.setWidth(150);
        rectangulo40.setHeight(100);
        rectangulo40.setFill(colores());
        rectangulo40.setStrokeWidth(3);
        rectangulo40.setStroke(Color.BLACK);

        Rectangle rectangulo41 = new Rectangle();
        rectangulo41.setX(183);
        rectangulo41.setY(462);
        rectangulo41.setWidth(150);
        rectangulo41.setHeight(100);
        rectangulo41.setFill(colores());
        rectangulo41.setStrokeWidth(3);
        rectangulo41.setStroke(Color.BLACK);

        Rectangle rectangulo42 = new Rectangle();
        rectangulo42.setX(336);
        rectangulo42.setY(462);
        rectangulo42.setWidth(150);
        rectangulo42.setHeight(100);
        rectangulo42.setFill(colores());
        rectangulo42.setStrokeWidth(3);
        rectangulo42.setStroke(Color.BLACK);

        Rectangle rectangulo43 = new Rectangle();
        rectangulo43.setX(489);
        rectangulo43.setY(462);
        rectangulo43.setWidth(150);
        rectangulo43.setHeight(100);
        rectangulo43.setFill(colores());
        rectangulo43.setStrokeWidth(3);
        rectangulo43.setStroke(Color.BLACK);

        Rectangle rectangulo44 = new Rectangle();
        rectangulo44.setX(642);
        rectangulo44.setY(462);
        rectangulo44.setWidth(150);
        rectangulo44.setHeight(100);
        rectangulo44.setFill(colores());
        rectangulo44.setStrokeWidth(3);
        rectangulo44.setStroke(Color.BLACK);

        Rectangle rectangulo45 = new Rectangle();
        rectangulo45.setX(795);
        rectangulo45.setY(462);
        rectangulo45.setWidth(150);
        rectangulo45.setHeight(100);
        rectangulo45.setFill(colores());
        rectangulo45.setStrokeWidth(3);
        rectangulo45.setStroke(Color.BLACK);

        Rectangle rectangulo50 = new Rectangle();
        rectangulo50.setX(30);
        rectangulo50.setY(565);
        rectangulo50.setWidth(150);
        rectangulo50.setHeight(100);
        rectangulo50.setFill(colores());
        rectangulo50.setStrokeWidth(3);
        rectangulo50.setStroke(Color.BLACK);

        Rectangle rectangulo51 = new Rectangle();
        rectangulo51.setX(183);
        rectangulo51.setY(565);
        rectangulo51.setWidth(150);
        rectangulo51.setHeight(100);
        rectangulo51.setFill(colores());
        rectangulo51.setStrokeWidth(3);
        rectangulo51.setStroke(Color.BLACK);

        Rectangle rectangulo52 = new Rectangle();
        rectangulo52.setX(336);
        rectangulo52.setY(565);
        rectangulo52.setWidth(150);
        rectangulo52.setHeight(100);
        rectangulo52.setFill(colores());
        rectangulo52.setStrokeWidth(3);
        rectangulo52.setStroke(Color.BLACK);

        Rectangle rectangulo53 = new Rectangle();
        rectangulo53.setX(489);
        rectangulo53.setY(565);
        rectangulo53.setWidth(150);
        rectangulo53.setHeight(100);
        rectangulo53.setFill(colores());
        rectangulo53.setStrokeWidth(3);
        rectangulo53.setStroke(Color.BLACK);

        Rectangle rectangulo54 = new Rectangle();
        rectangulo54.setX(642);
        rectangulo54.setY(565);
        rectangulo54.setWidth(150);
        rectangulo54.setHeight(100);
        rectangulo54.setFill(colores());
        rectangulo54.setStrokeWidth(3);
        rectangulo54.setStroke(Color.BLACK);

        Rectangle rectangulo55 = new Rectangle();
        rectangulo55.setX(795);
        rectangulo55.setY(565);
        rectangulo55.setWidth(150);
        rectangulo55.setHeight(100);
        rectangulo55.setFill(colores());
        rectangulo55.setStrokeWidth(3);
        rectangulo55.setStroke(Color.BLACK);


        //labels
        dado.setLayoutX(1025);
        dado.setLayoutY(0);

        player1.setLayoutX(0);
        player1.setLayoutY(0);

        player2.setLayoutX(50);
        player2.setLayoutY(0);



        //boton de dado
        btnDado.setLayoutX(1020);
        btnDado.setLayoutY(20);
        btnDado.setText("Dado");
        btnDado.setOnAction(event ->{
            int numero = (int)(Math.random()*4+1);// da valores de 1 a 4
            dado.setText(String.valueOf(numero));
        });

        //boton de salida
        btnSalida.setText("Salida!!!");
        btnSalida.setLayoutY(500);
        btnSalida.setLayoutX(1015);
        btnSalida.setOnAction(event -> {
            stage.close();
        });


        //roots



            //root rectangulos
        root.getChildren().add(rectanguloPlayer1);
        root.getChildren().add(rectanguloPlayer2);
        root.getChildren().add(rectangulo00);
        root.getChildren().add(rectangulo01);
        root.getChildren().add(rectangulo02);
        root.getChildren().add(rectangulo03);
        root.getChildren().add(rectangulo04);
        root.getChildren().add(rectangulo05);
        root.getChildren().add(rectangulo10);
        root.getChildren().add(rectangulo11);
        root.getChildren().add(rectangulo12);
        root.getChildren().add(rectangulo13);
        root.getChildren().add(rectangulo14);
        root.getChildren().add(rectangulo15);
        root.getChildren().add(rectangulo20);
        root.getChildren().add(rectangulo21);
        root.getChildren().add(rectangulo22);
        root.getChildren().add(rectangulo23);
        root.getChildren().add(rectangulo24);
        root.getChildren().add(rectangulo25);
        root.getChildren().add(rectangulo30);
        root.getChildren().add(rectangulo31);
        root.getChildren().add(rectangulo32);
        root.getChildren().add(rectangulo33);
        root.getChildren().add(rectangulo34);
        root.getChildren().add(rectangulo35);
        root.getChildren().add(rectangulo40);
        root.getChildren().add(rectangulo41);
        root.getChildren().add(rectangulo42);
        root.getChildren().add(rectangulo43);
        root.getChildren().add(rectangulo44);
        root.getChildren().add(rectangulo45);
        root.getChildren().add(rectangulo50);
        root.getChildren().add(rectangulo51);
        root.getChildren().add(rectangulo52);
        root.getChildren().add(rectangulo53);
        root.getChildren().add(rectangulo54);
        root.getChildren().add(rectangulo55);

        //roots Labels
        root.getChildren().add(dado);
        root.getChildren().add(player1);
        root.getChildren().add(player2);


            //roots Btns
        root.getChildren().add(btnDado);
        root.getChildren().add(btnSalida);

        Scene scene = new Scene(root, 600, 1100);

        stage.setTitle("MathSocket");
        stage.setHeight(780);
        stage.setWidth(1100);
        stage.setScene(scene);
        // se debe mantener al final del metodo

        stage.show();
    }

    //funcion encargada de generar aleatoriedad de colores en el tablero
    public static Color colores(){
        switch ((int) (Math.random()*3)){
            case 0: return Color.LIGHTGREEN;
            case 1: return Color.PINK;
            case 2: return Color.LIGHTBLUE;
        }
        return null;
    }



    public static void main(String[] args) {
        launch();
    }
}