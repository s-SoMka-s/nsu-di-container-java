package cases.music5;

import implementation.context.Context;
//import org.springframework.context.ApplicationContext;


public class RunMusic {
    public static void main(String[] args) {
        Context context = new Context("cases.music5");

        MusicPlayer musicPlayer1 = context.getBean(MusicPlayer.class);
        MusicPlayer musicPlayer2 = context.getBean(MusicPlayer.class);

        Computer computer1 = context.getBean("PC", Computer.class);
        Computer computer2 = context.getBean("PC", Computer.class);
        System.out.println(computer1.result());
        System.out.println(computer2.result());

        System.out.println(musicPlayer1);
        System.out.println(musicPlayer2);

        System.out.println(computer1);
        System.out.println(computer2);
    }
}