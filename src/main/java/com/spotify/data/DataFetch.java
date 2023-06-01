package com.spotify.data;

import com.spotify.util.Xls_Reader;

public class DataFetch {
	
	public Xls_Reader s = new Xls_Reader("C:\\Darshan_Study\\practiceDATA\\SpotifyTestCases.xlsx");
	
	public String getinvaliduserid = s.getCellData("Spotify", 7, 6);
	public String getunregistredemailid = s.getCellData("Spotify", 7, 7);
	public String getwrongpassword = s.getCellData("spotify", 7, 8);
	public String getvalidusername = s.getCellData("spotify", 7, 11);
	public String getregistredemailid = s.getCellData("spotify", 7, 12);
	public String getcorrectpassword = s.getCellData("spotify", 8, 13);
	
	public String expectedErr = "Incorrect username or password.";
	
	public String loginpagetitle = "Login - Spotify";
	public String homepagetitle = "Spotify - Web Player";
	public String searchpagetitle = "Spotify - Search";
	public String yourlibrarypagetitle = "Spotify - Your Library";
	public String likedsongspagetitle = "Spotify - Liked Songs";
	
	public String usertitle = "jackspot";
	/*FileInputStream f  = new FileInputStream("D:\\darshan's study\\spotifydata.properties");
	Properties prop = new Properties();
	prop.load(f);
	
	public String expectedErrMsg = prop.getProperty("expectedErrmsg");*/
}
