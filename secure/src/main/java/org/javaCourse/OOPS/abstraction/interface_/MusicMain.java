package org.javaCourse.OOPS.abstraction.interface_;

interface Music{
    int count=100;//by default final and static
    void play();
    void pause();
}
interface Phone{
    void app();
}
interface User extends Phone{
    void opperate();
}
class Spotify implements Music,User{

    @Override
    public void play() {
        System.out.println("music playing...");
    }

    @Override
    public void pause() {
        System.out.println("music stopped");
    }

    @Override
    public void app() {
        System.out.println("Installed spotify");
    }

    @Override
    public void opperate() {
        System.out.println("user opperating");
    }
}
public class MusicMain {
    public static void main(String[] args) {
        Spotify spotify=new Spotify();
        spotify.play();
        spotify.pause();
        System.out.println(Spotify.count);
        spotify.app();
        spotify.opperate();
    }
}
