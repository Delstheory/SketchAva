package sketch.Logic.variables;

public class MediaPlayer {

    public static boolean isPlaying;
    public static boolean isLooping;

    public static int seek;

    private static double duration;

    public MediaPlayer() {

    }

    public static double getDuration(){
      return duration;
    }

    public static void setSeek(int s){
      seek = s;
    }

    
}
