package com.sist.main3.music;



public class Music	// 데이터형만 모아주기 --> 사용자 정의 데이터형 (노래 1곡에 대한 순위, 제목, 가수, 앨범명, 상태, 등폭)
{
	private int rank;
	private String title;
	private String singer;
	private String album;
	private String state;
	private String idcrment; 	// 등폭
	
// 읽기, 쓰기 기능 필요 => Getter/Setter 불러오기 => for 다른 클래스와 연결 
	public int getRank()
	{
		return rank;
	}
	public void setRank(int rank)
	{
		this.rank = rank;
	}
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	public String getSinger()
	{
		return singer;
	}
	public void setSinger(String singer)
	{
		this.singer = singer;
	}
	public String getAlbum()
	{
		return album;
	}
	public void setAlbum(String album)
	{
		this.album = album;
	}
	public String getState()
	{
		return state;
	}
	public void setState(String state)
	{
		this.state = state;
	}
	public String getIdcrment()
	{
		return idcrment;
	}
	public void setIdcrment(String idcrment)
	{
		this.idcrment = idcrment;
	}
	
	
	
	
	
	
	
	
}