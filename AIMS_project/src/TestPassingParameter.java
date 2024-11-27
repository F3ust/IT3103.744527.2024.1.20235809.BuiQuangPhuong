import hust.soict.ite6.aims.media.disc.DigitalVideoDisc;

public class TestPassingParameter {

    public static void main(String[] args) {

        DigitalVideoDisc persona = new DigitalVideoDisc("Persona");
        DigitalVideoDisc metaphor = new DigitalVideoDisc("Metaphor");
		System.out.println("After Swap\n");
		swap(persona, metaphor);

	    System.out.println("Persona title: "+ persona.getTitle()+"\n");
	    System.out.println("Metaphor title: "+ metaphor.getTitle()+"\n");
	    System.out.println("After change title\n");
	    changeTitle(persona, metaphor.getTitle());
        System.out.println("Persona title: "+ persona.getTitle()+"\n");

        System.out.println("After correct swap\n");
        correctSwap(persona, metaphor);

        System.out.println("Persona title: "+ persona.getTitle()+"\n");
        System.out.println("Metaphor title: "+ metaphor.getTitle()+"\n");
        //Bui Quang Phuong 20235809
        System.out.println("Bui Quang Phuong 20235809");
    }
    //correct swap
    public static void correctSwap(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
        String oldTitle = dvd1.getTitle();
        dvd1.setTitle(dvd2.getTitle());
        dvd2.setTitle(oldTitle);
    }
    public static void swap(Object o1,Object o2) {
        Object tmp=o1;
        o1=o2;
        o2=tmp;
    }

    public static void changeTitle(DigitalVideoDisc disc,String title) {
        String oldTitle = disc.getTitle();
        disc.setTitle(title);
        disc = new DigitalVideoDisc(oldTitle);
    }


}