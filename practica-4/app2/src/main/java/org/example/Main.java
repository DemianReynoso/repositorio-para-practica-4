package org.example;

import io.javalin.Javalin;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Javalin app = Javalin.create().start(7070);

        app.get("/", ctx -> {
            ctx.result("Bienvenido a mi app2!");
        });
    }
}
