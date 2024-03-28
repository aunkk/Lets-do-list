package javaant;

import javax.swing.*;
import javax.sound.sampled.*;
import java.io.*;
import static java.lang.Math.random;
import java.util.ArrayList;
import java.util.Random;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;


public class ControlMusic_P{
    String music, musicPath;
    Player player;
    long musicProgress, musicDuration;
    FileInputStream fin;
    BufferedInputStream bin;
    //music setup
    private ArrayList<String> musicList;
    private String thisDir;
    public int nowI;
    public int musicNum;
    Random random = new Random();
    
    
    public ControlMusic_P(){
        //create file path
        thisDir = System.getProperty("user.dir").replace(File.separator, "\\\\");
        System.out.println(thisDir);
        File musicdir = new File(thisDir+"\\src\\javaant\\music\\");
        //regist all files in specific folder to array
        File[] fileA = musicdir.listFiles();
        //getName for each file
        musicList = new ArrayList<>();
        for (File f : fileA) {
                musicList.add(f.getName());
        }
        this.musicNum = musicList.size();
        System.out.println(musicList);

    }
    public String getMusicName() {
            String fileName = musicList.get(nowI);
            String musicName = "";
            for (char ch : fileName.toCharArray()) {
                if (".".equals(String.valueOf(ch))) {
                    break;
                }
                musicName += ch;
            }
        return musicName;
    }
    public void PlayMusic(int i){
        musicPath = thisDir + "\\src\\javaant\\music\\" + musicList.get(i);
        this.nowI = i;
        try {
            fin = new FileInputStream(musicPath);
            bin = new BufferedInputStream(fin);
            player = new Player(bin);
            musicDuration = fin.available();
            //fix later
            this.musicPath = musicPath;
            //----
            System.out.println("now playing music no." + i);
            displayPlaying();
            
            //old ver.
            /*File musicPath = new File(mPath);
        
            //if(musicPath.exists()) {
                
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                Clip player = AudioSystem.getClip();
                player.open(audioInput);
                player.start();
                
                JOptionPane.showMessageDialog(null,"Ok to close");
            }else {
                System.out.println("file not found");
            }*/
        }catch(IOException | JavaLayerException e){
            System.out.println("[PlayMusic: exception]");
            e.printStackTrace();
        }
        new Thread() {
            @Override
            public void run() {
                try {
                    player.play();
                    if (StudyWithMe_P.isLoop && player.isComplete()) {
                        PlayMusic(i);
                    }else if (player.isComplete()){
                        NextMusic();
                    }
                }catch(JavaLayerException ex) {
                    System.out.println("[PlayMusicThread: exception]");
                    ex.printStackTrace();
                }
            }
        }.start();
    }
    
    public void PauseMusic(){
        if(player!=null) {
        try{
            musicProgress = fin.available();
            player.close();
        }catch(IOException ex) {
            System.out.println("[PauseMusic: exception]");
            ex.printStackTrace();
                }
        }
    }
    
    //copy from play, might merge'em later
    public void ResumeMusic(){
        try {
            fin = new FileInputStream(musicPath);
            bin = new BufferedInputStream(fin);
            player = new Player(bin);
            try {
                fin.skip(musicDuration - musicProgress);
            }catch(IOException ex){
                System.out.println("[ResumeMusic: exception]");
                ex.printStackTrace();
            }

        }catch(IOException | JavaLayerException e){
            e.printStackTrace();
        }
        new Thread() {
            @Override
            public void run() {
                try {
                    player.play();
                }catch(JavaLayerException ex) {
                    System.out.println("[ResumeMusicThread: exception]");
                    ex.printStackTrace();
                }
            }
        }.start();
    }
    public void NextMusic(){
        System.out.println("next music");
        PauseMusic();
        if(nowI == musicNum-1) {
                this.nowI = random.nextInt(musicNum);
            }
            else {nowI += 1;}
        PlayMusic(nowI);
        displayPlaying();
    }
    public void PreviousMusic(){
        System.out.println("next music");
        PauseMusic();
        if(nowI == 0) {
                this.nowI = random.nextInt(musicNum);
            }
            else {nowI -= 1;}
        PlayMusic(nowI);
        displayPlaying();
    }
     public void displayPlaying() {
        String musicName = getMusicName();
        String[] splitName = musicName.split(" - ", 2);
        StudyWithMe_P.setDisplayName(splitName[1], splitName[0]);
    }
}
    
