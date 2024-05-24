package model;

import model.lancamentos.Lancamentos;

public class App {
    public static void main(String[] args) {
        Lancamentos db = new Lancamentos();
        db.getAll().forEach(System.out::println);
    }
}