package com.yesia.fisikaku.Model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResponseFisika{

	@SerializedName("fisika")
	private List<FisikaItem> fisika;

	@SerializedName("status")
	private boolean status;

	public void setFisika(List<FisikaItem> fisika){
		this.fisika = fisika;
	}

	public List<FisikaItem> getFisika(){
		return fisika;
	}

	public void setStatus(boolean status){
		this.status = status;
	}

	public boolean isStatus(){
		return status;
	}
}