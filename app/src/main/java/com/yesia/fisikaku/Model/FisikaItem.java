package com.yesia.fisikaku.Model;

import com.google.gson.annotations.SerializedName;

public class FisikaItem{

	@SerializedName("materi")
	private String materi;

	@SerializedName("gambar_rumus")
	private String gambarRumus;

	@SerializedName("id")
	private String id;

	@SerializedName("gambar")
	private String gambar;

	public void setMateri(String materi){
		this.materi = materi;
	}

	public String getMateri(){
		return materi;
	}

	public void setGambarRumus(String gambarRumus){
		this.gambarRumus = gambarRumus;
	}

	public String getGambarRumus(){
		return gambarRumus;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setGambar(String gambar){
		this.gambar = gambar;
	}

	public String getGambar(){
		return gambar;
	}
}