/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119061.latihan32.daftarffilm;

/**
 *
 * @author Rheiza
 * NAMA  : RHEIZA AKMAL R
 * KELAS : IF2
 * NIM   : 10119061
 */
public class PBOIF210119061Latihan32DaftarfFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Film film = new Film();
        System.out.println("===Daftar Film Sedang Tayang===");
        
        film.filmName = "Venom";
        film.filmGenre = "Action,Horror,Scifi";
        film.filmRating = 8.5;
        film.filmDuration = 120;
        film.nowPlaying();
        
        film.filmName = "Small Foot";
        film.filmGenre = "Animation";
        film.filmRating = 9.0;
        film.filmDuration = 96;
        film.nowPlaying();
        
        film.filmName = "Crazy Rich Asian";
        film.filmGenre = "Comedy";
        film.filmRating = 7.8;
        film.filmDuration = 119;
        film.nowPlaying();
        
        film.filmName = "Asih";
        film.filmGenre = "Horror";
        film.filmRating = 6.0;
        film.filmDuration = 100;
        film.nowPlaying();
    }
    
}
