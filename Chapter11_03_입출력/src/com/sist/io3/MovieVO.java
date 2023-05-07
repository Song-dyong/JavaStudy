package com.sist.io3;

public class MovieVO
{
	private int cno;
	private int rank;               // 랭킹
	private String title;            // 제목
	private String poster;            // 포스터
	private double avg;               // 평점
	private double reservationRate;      // 예매율
	private String regDate;            // 개봉일
	private String contents;         // 줄거리(정보)
	
	
	public int getCno()
	{
		return cno;
	}
	public void setCno(int cno)
	{
		this.cno = cno;
	}
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
	public String getPoster()
	{
		return poster;
	}
	public void setPoster(String poster)
	{
		this.poster = poster;
	}
	public double getAvg()
	{
		return avg;
	}
	public void setAvg(double avg)
	{
		this.avg = avg;
	}
	public double getReservationRate()
	{
		return reservationRate;
	}
	public void setReservationRate(double reservationRate)
	{
		this.reservationRate = reservationRate;
	}
	public String getRegDate()
	{
		return regDate;
	}
	public void setRegDate(String regDate)
	{
		this.regDate = regDate;
	}
	public String getContents()
	{
		return contents;
	}
	public void setContents(String contents)
	{
		this.contents = contents;
	}
	
	
}
