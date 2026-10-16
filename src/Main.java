public class Main {

    public static void main(String[] args) {

        Actor actor1 = new Actor("Сидни", "Суини", Gender.FEMALE, 163);
        Actor actor2 = new Actor("Марк", "Эдельштейн", Gender.MALE, 175);
        Actor actor3 = new Actor("Юра", "Борисов", Gender.MALE, 177);

        Director director1 = new Director("Кристофер", "Нолан", Gender.MALE, 14);
        Director director2 = new Director("Дени", "Вильнёв", Gender.MALE, 17);

        String musicAuthor = "Ханс Циммер";
        String choreographer = "Иржи Килиан";

        Show drama = new Show("Сато",
                150,
                director2);

        Opera opera = new Opera("Евгений Онегин",
                175,
                director1,
                musicAuthor,
                "Трагедия о несбывшейся любви и роковой ошибке, где чувства героев сталкиваются с" +
                        " жёсткими правилами общества.",
                20);

        Ballet ballet = new Ballet("Чайка",
                120,
                director1,
                musicAuthor,
                "Драма творческих амбиций и неразделённых чувств, где искусство и личная жизнь героев " +
                        "неотделимы друг от друга.",
                choreographer);

        drama.addActor(actor1);
        drama.addActor(actor2);

        opera.addActor(actor2);
        opera.addActor(actor3);

        ballet.addActor(actor1);
        ballet.addActor(actor3);

        System.out.println();
        System.out.println(drama);
        drama.printActors();
        System.out.println();

        System.out.println(opera);
        opera.printActors();
        System.out.println();

        System.out.println(ballet);
        ballet.printActors();
        System.out.println();

        System.out.println("Замена актёра в спектакле «" + drama.getTitle() + "».");
        drama.replaceActor(actor3, "Суини");
        System.out.println();
        drama.printActors();
        System.out.println();

        System.out.println("Замена несуществующего актера в опере «" + opera.getTitle() + "».");
        opera.replaceActor(actor1, "Камбербетч");
        System.out.println();
        opera.printActors();
        System.out.println();

        opera.printLibretto();
        System.out.println();
        ballet.printLibretto();
    }
}
