package com.example.aulakotlin2;

public class TestesJava {

    void testar() {
        Musica m1 = new Musica();

        m1.setNome("Su amor me pegou");

        System.out.println(m1.getNome());


        Filme f1 = new Filme("Nasce uma estrela", 2018);

        f1.setAno(2000);
        String tit = f1.getTitulo();

        Lutador l1 = new Lutador("Zé Ruela", 100.0);
        Lutador l2 = new Lutador("Zé Ruela", 100.0);

        boolean testex = l1.equals(l2);


    }
}
