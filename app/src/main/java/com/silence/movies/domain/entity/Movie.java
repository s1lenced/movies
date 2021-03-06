package com.silence.movies.domain.entity;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

@Generated("com.robohorse.robopojogenerator")
public class Movie {

	public Movie(String type, String year, String imdbID, String poster, String title) {
		this.type = type;
		this.year = year;
		this.imdbID = imdbID;
		this.poster = poster;
		this.title = title;
	}

	@SerializedName("Type")
	private String type;

	@SerializedName("Year")
	private String year;

	@SerializedName("imdbID")
	private String imdbID;

	@SerializedName("Poster")
	private String poster;

	@SerializedName("Title")
	private String title;

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setYear(String year){
		this.year = year;
	}

	public String getYear(){
		return year;
	}

	public void setImdbID(String imdbID){
		this.imdbID = imdbID;
	}

	public String getImdbID(){
		return imdbID;
	}

	public void setPoster(String poster){
		this.poster = poster;
	}

	public String getPoster(){
		return poster;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movie)) return false;
        Movie movie = (Movie) o;
        return getType().equals(movie.getType()) &&
                getYear().equals(movie.getYear()) &&
                getImdbID().equals(movie.getImdbID()) &&
                Objects.equals(getPoster(), movie.getPoster()) &&
                getTitle().equals(movie.getTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getType(), getYear(), getImdbID(), getPoster(), getTitle());
    }

    @Override
 	public String toString(){
		return 
			"Movie{" +
			"type = '" + type + '\'' + 
			",year = '" + year + '\'' + 
			",imdbID = '" + imdbID + '\'' + 
			",poster = '" + poster + '\'' + 
			",title = '" + title + '\'' + 
			"}";
		}
}