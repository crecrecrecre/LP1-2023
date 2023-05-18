public class Main {

    public static void main(String[] args) {

        biblioteca Bib = new biblioteca("crefe", new dono("igor", "123.456.789-10"));

        dono Dono = new dono("igor", "123.456.789-00");

        funcionario Func = new funcionario("felipe", "540.726.098-28");
        funcionario Func2 = new funcionario("crecs", "453.054.558-81");

        livro Livro = new livro ( "é assim que acaba", "Collen Hoover", 2019);
        livro Livro2 = new livro ("todas as suas imperfeições", "Collen Hoover", 2010);
        livro Livro3 = new livro ("Mulherzinhas", "Louisa May Alcott", 1980);
        livro Livro4 = new livro ("Daisy jones", "Taylor Jenkins Reid", 2019);
        livro Livro5 = new livro ("Ponte para Terabítia", "Katherine Paterson", 2006);


        Bib.addlivros(Livro);
        Bib.addlivros(Livro2);
        Bib.addlivros(Livro3);
        Bib.addlivros(Livro4);
        Bib.addlivros(Livro5);

        Bib.addfunc(Func);
        Bib.addfunc(Func2);

        Bib.MostrarLivros();
        Bib.MostrarFuncionarios();
    }



}
